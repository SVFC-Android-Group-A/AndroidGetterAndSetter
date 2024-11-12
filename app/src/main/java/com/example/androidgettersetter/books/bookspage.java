package com.example.androidgettersetter.books;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidgettersetter.MainActivity;
import com.example.androidgettersetter.R;

public class bookspage extends MainActivity {

    EditText etTitle, etAuthor, etGenre;
    Button btnAddItem;
    TextView tvResults;

    books bookObject;
    StringBuilder stringBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.books);

        bookObject = new books();
        stringBuilder = new StringBuilder();

        etTitle = findViewById(R.id.et_title);
        etAuthor = findViewById(R.id.et_author);
        etGenre = findViewById(R.id.et_genre);
        btnAddItem = findViewById(R.id.btn_add_item);
        tvResults = findViewById(R.id.tv_results);

        btnAddItem.setOnClickListener(v -> addFunction());
    }

    private void addFunction(){
        bookObject.setTitle(etTitle.getText().toString());
        bookObject.setAuthor(etAuthor.getText().toString());
        bookObject.setGenre(etGenre.getText().toString());

        Log.d("MAIN", "title: " + bookObject.getTitle() + ", author: " + bookObject.getAuthor() + ", genre: " + bookObject.getGenre());

        stringBuilder.append("\n\n Title: ").append(bookObject.getTitle());
        stringBuilder.append("\n Author: ").append(bookObject.getAuthor());
        stringBuilder.append("\n Genre: ").append(bookObject.getGenre());

        tvResults.setText(stringBuilder.toString());
    }
}
