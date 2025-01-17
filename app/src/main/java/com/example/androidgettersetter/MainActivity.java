package com.example.androidgettersetter;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.androidgettersetter.books.bookspage;
import com.example.androidgettersetter.employee.employeepage;
import com.example.androidgettersetter.products.productspage;
import com.example.androidgettersetter.restaurant.restaurantpage;
import com.example.androidgettersetter.university.universitypage;


public class MainActivity extends AppCompatActivity {

    Button btnbookspage, btnemployeepage, btnproductspage, btnrestaurantpage, btnuniversitypage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnproductspage = findViewById(R.id.btn_products_page);
        btnbookspage = findViewById(R.id.btn_book_page);
        btnemployeepage = findViewById(R.id.btn_employee_page);
        btnrestaurantpage = findViewById(R.id.btn_restaurant_page);
        btnuniversitypage = findViewById(R.id.btn_university_page);

        btnproductspage.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, productspage.class);
            startActivity(intent);
        });

        btnbookspage.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, bookspage.class);
            startActivity(intent);
        });

        btnemployeepage.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, employeepage.class);
            startActivity(intent);
        });

        btnrestaurantpage.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, restaurantpage.class);
            startActivity(intent);
        });

        btnuniversitypage.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, universitypage.class);
            startActivity(intent);
        });

    }
}