package com.gustavo.quizgamewithactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class QuizGame extends AppCompatActivity {

    private Button btnNext, btnBack;
    private TextView txtQuestion;
    private RadioButton rb1, rb2, rb3, rb4;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_game);

//        QuestionShape question = getIntent().getParcelableExtra("dataQuestion");
//
//        if (question != null) {
//
//            txtQuestion = findViewById(R.id.question);
//            txtQuestion.setText(question.getQuestion());
//
//        } else {
//            Toast.makeText(getApplicationContext(), "Deu Ruim", Toast.LENGTH_SHORT).show();
//        }

    }
}