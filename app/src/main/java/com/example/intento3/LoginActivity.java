package com.example.intento3;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private final EditText mUsernameEditText;
    private final EditText mPasswordEditText;
    private SharedPreferences mSharedPreferences;

    public LoginActivity(EditText mUsernameEditText, EditText mPasswordEditText) {
        this.mUsernameEditText = mUsernameEditText;
        this.mPasswordEditText = mPasswordEditText;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        View mLoginButton = null;
        assert false;
        mLoginButton.setOnClickListener(v -> {
            String username = mUsernameEditText.getText().toString();
            String password = mPasswordEditText.getText().toString();
            if (verifyLoginCredentials(username, password)) {
                mSharedPreferences.edit().putBoolean("isLoggedIn", true).apply();
                Intent intent = new Intent(LoginActivity.this, MenuActivity.class);
                intent.putExtra("username", username);
                startActivity(intent);
                finish();
            } else {
                Toast.makeText(LoginActivity.this, "Invalid credentials, please try again.", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private boolean verifyLoginCredentials(String username, String password) {
        // Check username and password against a registered user database
        // Return true if they match, false otherwise
        return username.equals("admin") && password.equals("admin123");
    }
}
