package com.example.hw_311_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView showText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showText = findViewById(R.id.show_text);

        findViewById(R.id.button_1).setOnClickListener(buttonsClickListener);
        findViewById(R.id.button_2).setOnClickListener(buttonsClickListener);
        findViewById(R.id.button_3).setOnClickListener(buttonsClickListener);
        findViewById(R.id.button_4).setOnClickListener(buttonsClickListener);
        findViewById(R.id.button_5).setOnClickListener(buttonsClickListener);
        findViewById(R.id.button_6).setOnClickListener(buttonsClickListener);
        findViewById(R.id.button_7).setOnClickListener(buttonsClickListener);
        findViewById(R.id.button_8).setOnClickListener(buttonsClickListener);
        findViewById(R.id.button_9).setOnClickListener(buttonsClickListener);
        findViewById(R.id.button_0).setOnClickListener(buttonsClickListener);
        findViewById(R.id.button_point).setOnClickListener(buttonsClickListener);

    }

    private View.OnClickListener buttonsClickListener = (new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button_0:
                    showText.append("0");
                    break;
                case R.id.button_1:
                    showText.append("1");
                    break;
                case R.id.button_2:
                    showText.append("2");
                    break;
                case R.id.button_3:
                    showText.append("3");
                    break;
                case R.id.button_4:
                    showText.append("4");
                    break;
                case R.id.button_5:
                    showText.append("5");
                    break;
                case R.id.button_6:
                    showText.append("6");
                    break;
                case R.id.button_7:
                    showText.append("7");
                    break;
                case R.id.button_8:
                    showText.append("8");
                    break;
                case R.id.button_9:
                    showText.append("9");
                    break;
                case R.id.button_point:
                    showText.append(".");
                    break;
            }
        }
    });

}
