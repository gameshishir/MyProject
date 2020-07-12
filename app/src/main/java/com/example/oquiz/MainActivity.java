package com.example.oquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button startbtn,bookmarBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startbtn = findViewById(R.id.start_btn);
        bookmarBtn = findViewById(R.id.bookmarks_btn);

        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(MainActivity.this, CategoriesActivity.class);
                startActivity(categoryIntent);

            }
        });
        bookmarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bookmarksIntent = new Intent(MainActivity.this, BookmarkActivity.class);
                startActivity(bookmarksIntent);

            }
        });
    }
}