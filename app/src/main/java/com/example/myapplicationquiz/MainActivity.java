package com.example.myapplicationquiz;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String selectedTopic = "";
    private LinearLayout uaz;
    private LinearLayout pat;
    private Button startQuizBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uaz = findViewById(R.id.line1);
        pat = findViewById(R.id.line2);
        startQuizBtn = findViewById(R.id.startQuizButton);

        uaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopic = "uaz";
                uaz.setBackgroundResource(R.drawable.round_back_white_stroke10);
                pat.setBackgroundResource(R.drawable.round_back_white10);


            }
        });

        pat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopic = "cars";

                pat.setBackgroundResource(R.drawable.round_back_white_stroke10);
                uaz.setBackgroundResource(R.drawable.round_back_white10);


            }
        });


        startQuizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (selectedTopic.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Выберите викторину", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                    intent.putExtra("selectedTopic", selectedTopic);
                    startActivity(intent);

                }

            }
        });

    }
}