package com.example.intento3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.text.BreakIterator;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        String username = getIntent().getStringExtra("username");
        BreakIterator mGreetingTextView = null;
        assert false;
        mGreetingTextView.setText(String.format("Hola estimado , ¿qué te podemos llevar hasta tu casa este día? Por favor selecciona:", username));

        View mPizzasButton = null;
        mPizzasButton.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, PizzaMenuActivity.class);
            startActivity(intent);
        });

        View mBeveragesButton = null;
        mBeveragesButton.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, BeverageMenuActivity.class);
            startActivity(intent);
        });
    }

    public void setContentView(int activity_menu) {

    }
}
