package com.example.kotlindemo.rxjava.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.example.kotlindemo.R;
import com.example.kotlindemo.databinding.ActivityTwoApiCallBinding;
import com.example.kotlindemo.rxjava.data.QuoteList;
import com.example.kotlindemo.rxjava.data.UserModel;
import com.example.kotlindemo.rxjava.networking.ApiClient;
import com.example.kotlindemo.rxjava.networking.ApiInterface;
import com.example.kotlindemo.utils.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

public class MultipleApiCallActivity extends AppCompatActivity {
    ApiInterface apiInterfaceFirst, apiInterfaceSecond;
    Observable<List<UserModel>> observableData;
    Observable<QuoteList> observableQuotes;
    ArrayList<String> finalResult = new ArrayList<>();
    ActivityTwoApiCallBinding binding;
    long startTime, endTime, duration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_two_api_call);

        apiInterfaceFirst = ApiClient.INSTANCE.getInstance(Constants.mockApi_url).create(ApiInterface.class);
        apiInterfaceSecond = ApiClient.INSTANCE.getInstance(Constants.quotes_url).create(ApiInterface.class);

        // observable
        observableData = apiInterfaceFirst.getData().subscribeOn(Schedulers.io());
        observableQuotes = apiInterfaceSecond.getQuotes().subscribeOn(Schedulers.io());

//        zipFunction();
        serialApiRequest();

    }

    private void zipFunction() {
        //For Parallel Api Call using "Zip Operator"
        startTime = System.nanoTime();
        Observable<List<String>> observableZip = Observable.zip(observableData, observableQuotes, new BiFunction<List<UserModel>, QuoteList, List<String>>() {
            @NonNull
            @Override
            public List<String> apply(@NonNull List<UserModel> userModels, @NonNull QuoteList quoteList) throws Exception {
                finalResult.clear();
                finalResult.add(userModels.toString());
                finalResult.add(quoteList.toString());
                return finalResult;
            }
        });
        observableZip.observeOn(AndroidSchedulers.mainThread())
                .subscribe(getObserver());
    }

    private Observer<List<String>> getObserver() {
        return new Observer<List<String>>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull List<String> strings) {
                binding.loader.setVisibility(View.GONE);
                binding.tvId.setText(strings.toString());
                Log.e(Constants.TAG,"Start Time : "+TimeUnit.MILLISECONDS.toSeconds(startTime)+"\t"+"End Time : "+TimeUnit.MILLISECONDS.toSeconds(endTime));
                Log.e(Constants.TAG, "Duration : "+ TimeUnit.MILLISECONDS.toSeconds(duration));
            }

            @Override
            public void onError(@NonNull Throwable e) {
                Log.e(Constants.TAG, "" + e.getLocalizedMessage());
            }

            @Override
            public void onComplete() {

            }
        };
    }

    private void serialApiRequest() {
        startTime = System.nanoTime();
        Observable<List<String>> disposable = apiInterfaceFirst.getData()
                .subscribeOn(Schedulers.io())
                .flatMap(new Function<List<UserModel>, ObservableSource<QuoteList>>() {
                    @Override
                    public ObservableSource<QuoteList> apply(@NonNull List<UserModel> userModels) throws Exception {
                        finalResult.add(userModels.toString());
                        return apiInterfaceSecond.getQuotes();
                    }
                })
                .map(new Function<QuoteList, List<String>>() {
                    @Override
                    public List<String> apply(@NonNull QuoteList quoteList) throws Exception {
                        finalResult.add(quoteList.toString());
                        return finalResult;
                    }
                });

        disposable.observeOn(AndroidSchedulers.mainThread())
                .subscribe(getObserver());
    }
}