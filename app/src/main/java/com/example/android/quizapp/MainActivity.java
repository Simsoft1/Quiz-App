package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     *
     * this method is called when the submit button is clicked
     */
    public void submitAnswer (View view){
        /**
         * defining the value for the full name edit text view.
          */

        EditText candidateName = (EditText) findViewById(R.id.candidate_name);
        /**
         * Transferring the candidate name to a string variable
         */
        String candidateNameId = candidateName.getText().toString();
        EditText question1 = (EditText) findViewById(R.id.question1_view);
        String answer1 = question1.getText().toString();
        /**
         * The following lines of code defines the radio buttons for question 2.
         */
        RadioButton question2Option1 = (RadioButton) findViewById(R.id.q2_a);
        boolean checkQuestion2Option1 = question2Option1.isChecked();
        RadioButton question2Option2 = (RadioButton) findViewById(R.id.q2_b);
        boolean checkQuestion2Option2 = question2Option2.isChecked();
        RadioButton question2Option3 = (RadioButton) findViewById(R.id.q3_c);
        boolean checkQuestion2Option3 = question2Option3.isChecked();
        /**
         * The following lines of code defines the checkboxes for question 3
         */
        CheckBox question3Option1 = (CheckBox) findViewById(R.id.q3_checkboxa);
        boolean checkQuestion3Option1 = question3Option1.isChecked();
        CheckBox question3Option2 = (CheckBox) findViewById(R.id.q3_checkboxb);
        boolean checkQuestion3Option2 = question3Option2.isChecked();
        CheckBox question3Option3 = (CheckBox) findViewById(R.id.q3_checkboxc);
        boolean checkQuestion3Option3 = question3Option3.isChecked();
        CheckBox question3Option4 = (CheckBox) findViewById(R.id.q3_checkboxd);
        boolean checkQuestion3Option4 = question3Option3.isChecked();
        /**
         * The following lines of code defines the radio buttons for question 4
         */
        RadioButton question4Option1 = (RadioButton) findViewById(R.id.q2_a);
        boolean checkQuestion4Option1 = question4Option1.isChecked();
        RadioButton question4Option2 = (RadioButton) findViewById(R.id.q2_b);
        boolean checkQuestion4Option2 = question4Option2.isChecked();
        RadioButton question4Option3 = (RadioButton) findViewById(R.id.q3_c);
        boolean checkQuestion4Option3 = question4Option3.isChecked();


        score = calculateScore(answer1, checkQuestion2Option1, checkQuestion2Option2, checkQuestion2Option3, checkQuestion3Option1,
                checkQuestion3Option2, checkQuestion3Option3, checkQuestion3Option4, checkQuestion4Option1,checkQuestion4Option2,
                checkQuestion4Option3);
        Toast.makeText(this, "Name: " + candidateNameId + "\n Your overall score in this test is: "+ score +
        "\n i.e. you score " + score/4*100 +"%", Toast.LENGTH_LONG).show();
    }

    /**
     * This method is calculates the score of the candidate
     */
    private int calculateScore ( String answer1, boolean checkQuestion2Option1,boolean checkQuestion2Option2,
                                 boolean checkQuestion2Option3, boolean checkQuestion3Option1, boolean checkQuestion3Option2,
                                 boolean checkQuestion3Option3, boolean checkQuestion3Option4, boolean checkQuestion4Option1,
                                 boolean checkQuestion4Option2, boolean checkQuestion4Option3){
        if (answer1=="4"){
            score += 1;
        }
        if (checkQuestion2Option1){
            score += 1;
        }
        if (checkQuestion3Option1 && checkQuestion3Option3 && checkQuestion3Option4){
            score += 1;
        }
        if (checkQuestion4Option2){
            score += 1;
        }

        return score;
    }
}

