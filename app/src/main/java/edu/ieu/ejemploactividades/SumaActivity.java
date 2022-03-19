package edu.ieu.ejemploactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class SumaActivity extends AppCompatActivity {
    private static final String TAG = SumaActivity.class.getSimpleName();
    public static final String STATE_SUM_OUTPUT = "sumOutput";

    private EditText mNumberAInput;
    private EditText mNumberBInput;
    private TextView mSumTotalLabel;
    private Button mAddButton;
    private Button mGetRootButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);
        mNumberAInput = findViewById(R.id.number_a_input);
        mNumberBInput = findViewById(R.id.number_b_input);
        mSumTotalLabel = findViewById(R.id.sum_label);
        mAddButton = findViewById(R.id.add_button);
        mGetRootButton = findViewById(R.id.get_root_button);

        mAddButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                addUserNumbers();
            }
        });

        mGetRootButton.setOnClickListener( view -> {
            showRootScreen();
        });
        Log.d(TAG, "onCreate()");

    }

    private void showRootScreen() {
        Intent intent = new Intent(this, RaizActivity.class);
        intent.putExtra(STATE_SUM_OUTPUT, mSumTotalLabel.getText().toString()
                .replace("= ", ""));
        startActivity(intent);
    }

    private void addUserNumbers() {
        String inputA = mNumberAInput.getText().toString();
        String inputB = mNumberBInput.getText().toString();
        int numberA = inputB.isEmpty()? 0 : Integer.parseInt(inputA);
        int numberB = inputB.isEmpty()? 0 : Integer.parseInt(inputB);
        String sumOutput = String.format(Locale.getDefault(), "= %d",
                numberA + numberB);
        mSumTotalLabel.setText(sumOutput);
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart()");
        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop()");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "onRestart()");
        super.onRestart();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause()");
        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume()");
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy()");
        super.onDestroy();
    }
}