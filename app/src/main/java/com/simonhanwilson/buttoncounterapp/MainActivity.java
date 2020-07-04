package com.simonhanwilson.buttoncounterapp;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private EditText userInput;
    private TextView textview;

    public final String TEXT_CONTENTS = "TextContents";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "Oncreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInput = findViewById(R.id.editText);
        Button button = findViewById(R.id.button);
        textview = findViewById(R.id.textView);

        userInput.setText("");
        textview.setText("");

        textview.setMovementMethod(new ScrollingMovementMethod());

        View.OnClickListener ourOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               String result = userInput.getText().toString();

               result = result + "\n";

               textview.append(result);

               userInput.setText("");

            }
        };

        button.setOnClickListener(ourOnClickListener);

        Log.d(TAG, "Oncreate ended");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        Log.d(TAG, "onRestoreInstanceState called");
        super.onRestoreInstanceState(savedInstanceState);
//        String savedString = savedInstanceState.getString(TEXT_CONTENTS);
//        textview.setText(savedString);
        textview.setText(savedInstanceState.getString(TEXT_CONTENTS));
        Log.d(TAG, "onRestoreInstanceState ended");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        Log.d(TAG, "onSaveInstanceState called");
        outState.putString(TEXT_CONTENTS, textview.getText().toString());
        super.onSaveInstanceState(outState);

        Log.d(TAG, "onSaveInstanceState ended");
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart called");
        super.onStart();

        Log.d(TAG, "onStart ended");
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume called");
        super.onResume();

        Log.d(TAG, "onResume ended");
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause called");
        super.onPause();
    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "onRestart called");
        super.onRestart();

        Log.d(TAG, "onRestart ended");
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy called");
        super.onDestroy();

        Log.d(TAG, "onDestroy ended");
    }
}