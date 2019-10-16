package com.example.android_change_screen;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.android_change_screen.R.id.back_fourth;
import static com.example.android_change_screen.R.id.back_second;

public class VocabularyFourthActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabularyfourth);

        // Vào AndroidMainfest để thêm activity cho c/tr chạy
        btn = findViewById(R.id.back_fourth);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
