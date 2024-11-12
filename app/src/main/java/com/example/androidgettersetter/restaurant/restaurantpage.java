package com.example.androidgettersetter.restaurant;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidgettersetter.R;

public class restaurantpage extends AppCompatActivity {

    EditText etName, etType, etLocation;
    Button btnAddItem;
    TextView tvResults;

    restaurants restaurant;
    StringBuilder stringBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurant);

        restaurant= new restaurants();
        stringBuilder = new StringBuilder();

        etName = findViewById(R.id.et_name);
        etType = findViewById(R.id.et_type);
        etLocation = findViewById(R.id.et_location);
        btnAddItem = findViewById(R.id.btn_add_item);
        tvResults = findViewById(R.id.tv_results);

        btnAddItem.setOnClickListener(v -> addFunction());
    }

    private void addFunction() {
        restaurant.setName(etName.getText().toString());
        restaurant.setType(etType.getText().toString());
        restaurant.setLocation(etLocation.getText().toString());

        Log.d("MAIN", "name: " + restaurant.getName() + ", type: " + restaurant.getType() + ", location: " + restaurant.getLocation());

        stringBuilder.append("\n\n Restaurant Name: ").append(restaurant.getName());
        stringBuilder.append("\n Type: ").append(restaurant.getType());
        stringBuilder.append("\n Location: ").append(restaurant.getLocation());

        tvResults.setText(stringBuilder.toString());
    }
}