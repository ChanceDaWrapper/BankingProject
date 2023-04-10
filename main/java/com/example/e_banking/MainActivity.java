package com.example.e_banking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);

        // Get references to the input fields and the SignInButton
        EditText signInUsername = findViewById(R.id.SignInUsername);
        EditText signInPassword = findViewById(R.id.SignInPassword);
        Button signInButton = findViewById(R.id.SignInButton);
        Button signUpButton = findViewById(R.id.SignUpButton);


        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the username and password entered by the user
                String username = signInUsername.getText().toString();
                String password = signInPassword.getText().toString();

                // Check if the account exists in the SQL database
                boolean accountExists = checkAccountExists(username, password);

                if (accountExists) {
                    // If the account exists, navigate to the dashboard
                    Intent intent = new Intent(MainActivity.this, DashboardActivity.class);
                    startActivity(intent);
                } else {
                    // If the account does not exist, show an error message
                    Toast.makeText(MainActivity.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    // Function to check if an account exists in the SQL database
    private boolean checkAccountExists(String username, String password) {
        // SQL Stuff

        return true;
    }
}