package com.example.kotlindemo.rxjava.ui;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.kotlindemo.R;
import com.example.kotlindemo.utils.Constants;
import com.example.kotlindemo.rxjava.data.QuoteList;
import com.example.kotlindemo.rxjava.data.UserModel;
import com.example.kotlindemo.rxjava.networking.ApiClient;
import com.example.kotlindemo.rxjava.networking.ApiInterface;

import java.util.List;

import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class SimpleAPICallActivity extends AppCompatActivity {
    ApiInterface apiInterfaceFirst,apiInterfaceSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_show_java2);

        apiInterfaceFirst = ApiClient.INSTANCE.getInstance(Constants.mockApi_url).create(ApiInterface.class);
        apiInterfaceSecond = ApiClient.INSTANCE.getInstance(Constants.quotes_url).create(ApiInterface.class);
        initSingleObserver();
        // observable
//        Observable<List<UserModel>> observable = apiInterfaceFirst.getData();
//        Observable<QuoteList> quotesObservable = apiInterfaceSecond.getQuotes();

        //observable set-up
//        apiInterfaceFirst.getData().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(getObserver());
//        quotesObservable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(getQuotesObserver());
    }

    private Observer<List<UserModel>> getObserver() {
        return new Observer<List<UserModel>>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
                Log.d("TAG_VK", "onSubscribe");
            }

            @Override
            public void onNext(@NonNull List<UserModel> userModels) {
                Log.d("TAG_VK", "onNext");
                for (UserModel data : userModels) {
                    Log.d("TAG_VK", data.getName());
                }
            }

            @Override
            public void onError(@NonNull Throwable e) {
                Log.d("TAG_VK", "onError : "+e.getLocalizedMessage());
            }

            @Override
            public void onComplete() {
                Log.d("TAG_VK", "onComplete");
            }
        };
    }

    private Observer<QuoteList> getQuotesObserver(){
        return new Observer<QuoteList>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
            }

            @Override
            public void onNext(@NonNull QuoteList quoteList) {
                Log.d("TAG_VK", "onNext"+quoteList.toString());
            }

            @Override
            public void onError(@NonNull Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        };
    }


    // Single use
    private void initSingleObserver(){
        Single<QuoteList> quotesObservableSingle = apiInterfaceSecond.getDataSingle();
        quotesObservableSingle
                .doOnSuccess(quoteList -> {
            Log.d("TAG_VK","doOnSuccess : "+quoteList.toString());
        })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe();


        // using single with compositeDisposable
//        new CompositeDisposable().add(quotesObservableSingle
//                .doOnSuccess(quoteList -> {
//                    Log.d("TAG_VK","doOnSuccess : "+quoteList.toString());
//                })
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(quoteList -> {
//                    Log.d("TAG_VK","onSubscribe : "+quoteList.toString());
//                },throwable -> {
//                    Toast.makeText(this, ""+throwable.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
//                }));
    }
}