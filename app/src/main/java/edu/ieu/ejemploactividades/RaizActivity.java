package edu.ieu.ejemploactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RaizActivity extends AppCompatActivity {
    private TextView mRaizTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raiz);
        Intent intent = getIntent();
        String raiz = intent.getStringExtra(SumaActivity.STATE_SUM_OUTPUT);
        mRaizTextView = findViewById(R.id.raiz_textview);

        mRaizTextView.setText(raiz);
    }
}