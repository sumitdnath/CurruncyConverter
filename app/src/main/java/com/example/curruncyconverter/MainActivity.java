package com.example.curruncyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view){
        Log.i("Info","Button Pressed");

        EditText editText = (EditText) findViewById(R.id.editText);

        String ammountInPounds = editText.getText().toString();
        Double ammountInPoundsDouble = Double.parseDouble(ammountInPounds);
        Double ammontInDollersDouble = ammountInPoundsDouble * 71.76;
        String ammontInDollersString = String.format("%.2f", ammontInDollersDouble);
        Log.i("Convert", ammontInDollersString);
        Log.i("Give",editText.getText().toString());
        Toast.makeText(this, ammountInPounds + " $ is " + " ₹ " + ammontInDollersString, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
