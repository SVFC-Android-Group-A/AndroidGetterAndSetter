package com.example.androidgettersetter.products;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidgettersetter.MainActivity;
import com.example.androidgettersetter.R;

public class productspage extends MainActivity {

    EditText etName, etPrice, etCategory;
    Button btnAddItem;
    TextView tvResults;

    StringBuilder stringBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product);

        stringBuilder = new StringBuilder();

        etName = findViewById(R.id.et_name);
        etPrice = findViewById(R.id.et_price);
        etCategory = findViewById(R.id.et_category);
        btnAddItem = findViewById(R.id.btn_add_item);
        tvResults = findViewById(R.id.tv_results);

        btnAddItem.setOnClickListener(v -> addFunction());
    }

    private void addFunction() {
        product product = new product();
        product.setName(etName.getText().toString());
        product.setPrice(Integer.parseInt(etPrice.getText().toString()));
        product.setCategory(etCategory.getText().toString());

        Log.d("MAIN", "name: " + product.getName() + ", price: " + product.getPrice() + ", category: " + product.getCategory());

        stringBuilder.append("\n\n Name: ").append(product.getName());
        stringBuilder.append("\n Price: ").append(product.getPrice());
        stringBuilder.append("\n Category: ").append(product.getCategory());

        tvResults.setText(stringBuilder.toString());
    }
}