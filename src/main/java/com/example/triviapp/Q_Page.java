package com.example.triviapp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Path;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Q_Page extends AppCompatActivity {

    public String answer;
    public Button Option1,Option2,Option3,Option4,Correct;
    public boolean Flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q__page);
        TextView Question= (TextView)findViewById(R.id.textView);
        String Q="Which dragon died in season 7?";
        Question.setText(Q);
        ImageView Q_image=(ImageView) findViewById(R.id.imageView);
        Q_image.setImageResource(R.drawable.dragon);
        Option1=findViewById(R.id.button2);
        Option2=findViewById(R.id.button3);
        Option3=findViewById(R.id.button8);
        Option4=findViewById(R.id.button5);
        String O1="OP1 Txt";
        String O2="OP2 Txt";
        String O3="OP3 Txt";
        String O4="OP4 Txt";
        answer="OP3 Txt";
        Option1.setText(O1);
        Option2.setText(O2);
        Option3.setText(O3);
        Option4.setText(O4);
        if (answer.equals(O1))
            Correct=Option1;
        else if (answer.equals(O2))
            Correct=Option2;
        else if (answer.equals(O3))
            Correct=Option3;
        else if (answer.equals(O4))
            Correct=Option4;
        Flag=false;
    }

    public void Click_option(View view)
    {
        Intent intent1=new Intent(this, NextPage.class);
        startActivity(intent1);
    }

    public void Option1(View view)
    {
        if(Flag==false) {
            String Optxt = Option1.getText().toString();
            if (Optxt.equals(answer))
                Option1.setBackgroundColor(Color.parseColor("#24B24A"));
            else {
                Option1.setBackgroundColor(Color.parseColor("#CC3131"));
                Correct.setBackgroundColor(Color.parseColor("#24B24A"));
            }
            Flag=true;
        }
    }

    public void Option2(View view)
    {
        if(Flag==false) {
            String Optxt=Option2.getText().toString();
            if(Optxt.equals(answer))
                Option2.setBackgroundColor(Color.parseColor("#24B24A"));
            else {
                Option2.setBackgroundColor(Color.parseColor("#CC3131"));
                Correct.setBackgroundColor(Color.parseColor("#24B24A"));
            }
            Flag=true;
        }
    }

    public void Option3(View view)
    {
        if(Flag==false) {
            String Optxt=Option3.getText().toString();
            if(Optxt.equals(answer))
                Option3.setBackgroundColor(Color.parseColor("#24B24A"));
            else {
                Option3.setBackgroundColor(Color.parseColor("#CC3131"));
                Correct.setBackgroundColor(Color.parseColor("#24B24A"));
            }
            Flag=true;
        }
    }

    public void Option4(View view)
    {
        if(Flag==false) {
            String Optxt=Option4.getText().toString();
            if(Optxt.equals(answer))
                Option4.setBackgroundColor(Color.parseColor("#24B24A"));
            else {
                Option4.setBackgroundColor(Color.parseColor("#CC3131"));
                Correct.setBackgroundColor(Color.parseColor("#24B24A"));
            }
            Flag=true;
        }
    }

}
