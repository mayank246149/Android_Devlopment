package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.welcome.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button welcomeButton = findViewById(R.id.welcomeButton);
        final TextView welcomeMessage = findViewById(R.id.welcomeMessage);

        welcomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                welcomeMessage.setText("Welcome to Graphic Era University - MCA");
                welcomeMessage.setVisibility(View.VISIBLE);
            }
        });
    }
}
