package com.example.androidgettersetter.university;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;


import com.example.androidgettersetter.MainActivity;
import com.example.androidgettersetter.R;

import com.example.androidgettersetter.university.university;

public class universitypage extends MainActivity {

    private EditText etName, etType, etWebsite;
    private Button btnAddItem;
    private TextView tvResults;

    private university universityObject;
    private StringBuilder stringBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.university);


        etName = findViewById(R.id.et_name);
        etType = findViewById(R.id.et_type);
        etWebsite = findViewById(R.id.et_website);
        btnAddItem = findViewById(R.id.btn_add_item);
        tvResults = findViewById(R.id.tv_results);

        universityObject = new university();

        btnAddItem.setOnClickListener(v -> addFunction());
    }


    private void addFunction(){
        universityObject.setName(etName.getText().toString());
        universityObject.setType(etType.getText().toString());
        universityObject.setType(etWebsite.getText().toString());

        Log.d("MAIN", "name: " + universityObject.getName() + ", type: " + universityObject.getType() + ", website: " + universityObject.getWebsite());

        stringBuilder.append("\n\n School Name: ").append(universityObject.getName());
        stringBuilder.append("\n Type: ").append(universityObject.getType());
        stringBuilder.append("\n School Website: ").append(universityObject.getWebsite());

        tvResults.setText(stringBuilder.toString());
    }
}