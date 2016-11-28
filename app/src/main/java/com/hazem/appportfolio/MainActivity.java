package com.hazem.appportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickConfig();
    }

    private void clickConfig() {
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendMessage(getString(R.string.button_click_message, view.getTag().toString()));
            }
        };

        findViewById(R.id.btnBuildItBigger).setOnClickListener(listener);
        findViewById(R.id.btnCapstone).setOnClickListener(listener);
        findViewById(R.id.btnGoUbiquitous).setOnClickListener(listener);
        findViewById(R.id.btnMakeYourAppMaterial).setOnClickListener(listener);
        findViewById(R.id.btnPopularMovies).setOnClickListener(listener);
        findViewById(R.id.btnStockHawk).setOnClickListener(listener);
    }

    private void sendMessage(String msg) {
        Toast.makeText(getBaseContext(), msg, Toast.LENGTH_LONG).show();
    }
}
