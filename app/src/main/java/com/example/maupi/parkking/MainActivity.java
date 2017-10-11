package com.example.maupi.parkking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button AccBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AccBtn = (Button) findViewById(R.id.AccBtn);

        AccBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                goToCreateAccount();
            }
        });

    }
    public void goToCreateAccount()
    {
        Intent intent = new Intent(this, CreateAccount.class);
        startActivity(intent);
    }
}
