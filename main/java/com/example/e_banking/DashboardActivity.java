package com.example.e_banking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DashboardActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        TextView bankStatement = findViewById(R.id.BankStatement);

        //Set the text to the bank statement variable
        //bankStatement.setText()

        Button deposit = findViewById(R.id.DepositButton);
        Button withdraw = findViewById(R.id.WithdrawButton);

        deposit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, DepositActivity.class);
                startActivity(intent);
            }
        });

        withdraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, WithdrawActivity.class);
                startActivity(intent);
            }
        });
    }
}
