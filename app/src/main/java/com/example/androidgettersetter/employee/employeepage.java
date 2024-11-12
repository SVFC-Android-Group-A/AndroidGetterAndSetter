package com.example.androidgettersetter.employee;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import com.example.androidgettersetter.MainActivity;
import com.example.androidgettersetter.R;

public class employeepage extends MainActivity {

    EditText etName, etDepartment, etEmail;
    Button btnAddItem;
    TextView tvResults;

    employees employeeObject;
    StringBuilder stringBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employee);

        employeeObject = new employees();
        stringBuilder = new StringBuilder();

        etName = findViewById(R.id.et_name);
        etDepartment = findViewById(R.id.et_department);
        etEmail = findViewById(R.id.et_email);
        btnAddItem = findViewById(R.id.btn_add_item);
        tvResults = findViewById(R.id.tv_results);

        btnAddItem.setOnClickListener(v -> addFunction());
    }

    private void addFunction(){
        employeeObject.setName(etName.getText().toString());
        employeeObject.setDepartment(etDepartment.getText().toString());
        employeeObject.setEmail(etEmail.getText().toString());

        Log.d("MAIN", "name: " + employeeObject.getName() + ", department: " + employeeObject.getDepartment() + ", email: " + employeeObject.getEmail());

        stringBuilder.append("\n\n Name: ").append(employeeObject.getName());
        stringBuilder.append("\n Department: ").append(employeeObject.getDepartment());
        stringBuilder.append("\n Email: ").append(employeeObject.getEmail());

        tvResults.setText(stringBuilder.toString());
    }
}