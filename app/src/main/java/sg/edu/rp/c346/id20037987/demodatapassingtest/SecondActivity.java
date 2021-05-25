package sg.edu.rp.c346.id20037987.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    //Step 1
    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Step 2
        tvAnswer = findViewById(R.id.textView);
        Intent intentRecieved = getIntent();
        int value = intentRecieved.getIntExtra("Value", 0);
        tvAnswer.setText("Integer value received is: " + value);
    }
}