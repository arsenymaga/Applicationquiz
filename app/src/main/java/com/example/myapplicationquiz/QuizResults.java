package com.example.myapplicationquiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class QuizResults extends AppCompatActivity {
    AppCompatButton startNewQuiz;
    TextView correctAnswers;
    TextView inCorrectAnswers;
    int getCorrectAnswers;
    int getIncorrectAnswers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_results);

        startNewQuiz = findViewById(R.id.startNewQuizBtn);
        correctAnswers = findViewById(R.id.correctAnswers);
        inCorrectAnswers = findViewById(R.id.inCorrectAnswers);

        getCorrectAnswers = getIntent().getIntExtra("correct",0);
        getIncorrectAnswers = getIntent().getIntExtra("incorrect",0);

        correctAnswers.setText(String.valueOf("Количество верных ответов:" + getCorrectAnswers) );
        inCorrectAnswers.setText(String.valueOf("Количество неверных ответов:" +getIncorrectAnswers));

        startNewQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuizResults.this, MainActivity.class));

            }
        });
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(QuizResults.this, MainActivity.class));

    }
}