package com.example.kotlindemo.workmanager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.OneTimeWorkRequest;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.kotlindemo.R;

import java.util.concurrent.TimeUnit;

public class WorkManagerActivity extends AppCompatActivity {

    Constraints constraints;
    Data data;
    TextView textView;
    PeriodicWorkRequest periodicWorkRequest;
    OneTimeWorkRequest workRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_manager);
        textView = findViewById(R.id.textViewStatus);

        //creating constraints
        constraints = new Constraints.Builder()
                .setRequiresCharging(true) // you can add as many constraints as you want
                .build();

        //creating a data object
        //to pass the data with workRequest
        //we can put as many variables needed
        data = new Data.Builder()
                .putString(MyWorker.TASK_DESC, "The task data passed from MainActivity")
                .build();


        //A click listener for the button
        //inside the onClick method we will perform the work
        findViewById(R.id.buttonEnqueue).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Enqueuing the work request
                WorkManager.getInstance().enqueue(workRequest);
            }
        });

        findViewById(R.id.buttonEnqueuePeriodic).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Enqueuing the work request
                WorkManager.getInstance().enqueue(periodicWorkRequest);
            }
        });

        oneTimeWork();
        periodicWorkRequest();
    }

    private void oneTimeWork(){
        //This is the subclass of our WorkRequest
        workRequest = new OneTimeWorkRequest
                .Builder(MyWorker.class)
                .setInputData(data)
                .setConstraints(constraints)
                .build();

        //Listening to the work status
        WorkManager.getInstance().getWorkInfoByIdLiveData(workRequest.getId())
                .observe(this, new Observer<WorkInfo>() {
                    @Override
                    public void onChanged(@Nullable WorkInfo workInfo) {
                        //receiving back the data
                        if(workInfo != null && workInfo.getState().isFinished())
                            textView.append(workInfo.getOutputData().getString(MyWorker.TASK_DESC) + "\n");

                        textView.append(workInfo.getState().name() + "\n");
                    }
                });
    }

    private void periodicWorkRequest(){
        periodicWorkRequest = new PeriodicWorkRequest
                .Builder(MyWorker.class, 10, TimeUnit.SECONDS)
                .setInputData(data)
                .build();

        WorkManager.getInstance().getWorkInfoByIdLiveData(periodicWorkRequest.getId())
                .observe(this, new Observer<WorkInfo>() {
                    @Override
                    public void onChanged(@Nullable WorkInfo workInfo) {
                        //receiving back the data
                        if(workInfo != null && workInfo.getState().isFinished())
                            textView.append(workInfo.getOutputData().getString(MyWorker.TASK_DESC) + "\n");

                        textView.append(workInfo.getState().name() + "\n");
                    }
                });
    }
}