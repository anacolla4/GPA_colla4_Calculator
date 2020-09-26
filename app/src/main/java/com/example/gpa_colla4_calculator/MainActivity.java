package com.example.gpa_colla4_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText firstValueText;
    private EditText secondValueText;
    private EditText thirdValueText;
    private EditText fourthValueText;
    private EditText fifthValueText;
    private Button mBtn;
    private TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstValueText= (EditText) findViewById(R.id.et1);
        secondValueText= (EditText) findViewById(R.id.et2);
        thirdValueText= (EditText) findViewById(R.id.et3);
        fourthValueText= (EditText) findViewById(R.id.et4);
        fifthValueText= (EditText) findViewById(R.id.et5);
        mBtn= (Button)findViewById(R.id.btn1);
        answer = (TextView) findViewById(R.id.answer);

        mBtn.setOnClickListener(new View.OnClickListener() {
         @Override

            public void onClick(View v)
         {
             mBtn.setBackgroundColor(Color.TRANSPARENT);

             String firstValue = firstValueText.getText().toString();
             String secondValue = secondValueText.getText().toString();
             String thirdValue = thirdValueText.getText().toString();
             String fourthValue = fourthValueText.getText().toString();
             String fifthValue = fifthValueText.getText().toString();

             if(firstValue.isEmpty())
             {
                 firstValueText.setText("Input Value");
             }
             else if (secondValue.isEmpty())
             {
                 secondValueText.setText("Input Value");
             }
             else if (thirdValue.isEmpty())
             {
                 thirdValueText.setText("Input Value");
             }
             else if (fourthValue.isEmpty())
             {
                 fourthValueText.setText("Input Value");
             }
             else if (fifthValue.isEmpty())
             {
                 fifthValueText.setText("Input Value");
             }
             else {
                 //get the integer value of the EditText

                 int numbers = (Integer.valueOf(firstValue) + Integer.valueOf(secondValue) + Integer.valueOf(thirdValue) + Integer.valueOf(fourthValue) + Integer.valueOf(fifthValue)) / 5;
                 answer.setText(String.valueOf(numbers));

             }
         }

        });
    }


}