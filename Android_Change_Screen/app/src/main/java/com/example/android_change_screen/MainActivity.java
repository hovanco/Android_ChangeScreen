package com.example.android_change_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Tìm id nút btn_hello trong giao diện activity_main.xml
        btn1 = findViewById(R.id.btn_word1);

        // Bắt sự kiện click/ chuyển trang từ giao diện activity_main sang activity_register
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent1);

            }
        });




        btn2 = findViewById(R.id.btn_word2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, VocabularySecondActivity.class);
                startActivity(intent2);

            }
        });




        btn3 = findViewById(R.id.btn_word3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this, VocabularyThirdActivity.class);
                startActivity(intent3);

            }
        });

        btn4 = findViewById(R.id.btn_word4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(MainActivity.this, VocabularyFourthActivity.class);
                startActivity(intent4);

            }
        });



        btn5 = findViewById(R.id.btn_word5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(MainActivity.this, VocabularyFifthActivity.class);
                startActivity(intent5);

            }
        });



        btn6 = findViewById(R.id.btn_word6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(MainActivity.this, VocabularySixthActivity.class);
                startActivity(intent6);

            }
        });

    }
}
