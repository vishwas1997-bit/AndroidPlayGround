package com.example.kotlindemo.di;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.kotlindemo.R;
import com.example.kotlindemo.di.component.DaggerNotesComponent;
import com.example.kotlindemo.di.component.NotesComponent;
import com.example.kotlindemo.di.local.NoteDatabase;
import com.example.kotlindemo.di.local.DataEntity;
import com.example.kotlindemo.di.module.NotesModule;

import javax.inject.Inject;

public class InsertDataActivity extends AppCompatActivity implements View.OnClickListener{

    EditText inUsername, inNumber;
    Button btnSave, btnGet;
    TextView tvNote;
    private NotesComponent notesComponent;
    @Inject
    SharedPreferences sharedPreferences;
    @Inject
    NoteDatabase database;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_data);

        initViews();
        notesComponent = DaggerNotesComponent.builder()
                .notesModule(new NotesModule(this))
                .build();
        notesComponent.inject(this);
    }

    private void initViews() {
        btnGet = findViewById(R.id.btnGet);
        btnSave = findViewById(R.id.btnSave);
        inUsername = findViewById(R.id.inUsername);
        inNumber = findViewById(R.id.inNumber);
        tvNote = findViewById(R.id.tvNote);
        btnSave.setOnClickListener(this);
        btnGet.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnGet:
                tvNote.setText(database.getNoteDao().getNoteList().toString());
//                inUsername.setText(sharedPreferences.getString("username", "default"));
//                inNumber.setText(sharedPreferences.getString("number", "12345"));
                break;
            case R.id.btnSave:
                DataEntity dataEntity = new DataEntity();
                dataEntity.setData(inUsername.getText().toString().trim());
                database.getNoteDao().insert(dataEntity);
//                SharedPreferences.Editor editor = sharedPreferences.edit();
//                editor.putString("username", inUsername.getText().toString().trim());
//                editor.putString("number", inNumber.getText().toString().trim());
//                editor.apply();
                break;

        }
    }
}