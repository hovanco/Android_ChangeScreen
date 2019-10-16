package com.example.android_change_screen;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.android_change_screen.R.id.back_second;
import static com.example.android_change_screen.R.id.back_third;

public class VocabularyThirdActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabularythird);

        // Vào AndroidMainfest để thêm activity cho c/tr chạy
        btn = findViewById(back_third);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
