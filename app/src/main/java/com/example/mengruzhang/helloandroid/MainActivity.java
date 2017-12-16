package com.example.mengruzhang.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //step 1: Declaration
    Button plusButton, subjectButton;
    EditText inputBox1, inputBox2;
    TextView resultsView;
    int op1, op2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //step2 - hookup step
        plusButton = (Button) findViewById(R.id.button);
        subjectButton = (Button) findViewById(R.id.button2);
        inputBox1 = (EditText) findViewById(R.id.editText);
        inputBox2 = (EditText) findViewById(R.id.editText2);
        resultsView = (TextView) findViewById(R.id.textView);

        //step 3: do something
        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               op1 = Integer.parseInt(inputBox1.getText().toString());
               op2 = Integer.parseInt(inputBox2.getText().toString());
               result = op1+op2;
               resultsView.setText(String.valueOf(result));
            }
        });

        subjectButton.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick (View view){
                    op1 = Double.parseDouble(inputBox1.getText().toString());
                    result = Math.sqrt(op1);
                    resultsView.setText(String.valueOf(result));

//                op1 = Integer.parseInt(inputBox1.getText().toString());
//                op2 = Integer.parseInt(inputBox2.getText().toString());
//                    result = op1 - op2;
//                resultsView.setText(String.valueOf(result));
            }
        });


    }
}
