package com.example.android.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class Electrical extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_electrical, container, false);

        Button resetButton = (Button) rootView.findViewById(R.id.resetButton);
        resetButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // create new Intent to return to home page
                Intent resetIntent = new Intent(getActivity(), Electrical.class);
                startActivity(resetIntent);
            }
        });


        Button submitButton = (Button) rootView.findViewById(R.id.submitQuiz);
        submitButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // get the status of the correct answer for question 1
                RadioButton answerToOne = (RadioButton) rootView.findViewById(R.id.q1CorrectAnswer);
                boolean hasCheckedQ1 = answerToOne.isChecked();

                // get the status of the correct answer for question 2
                RadioButton answerToTwo = (RadioButton) rootView.findViewById(R.id.q2CorrectAnswer);
                boolean hasCheckedQ2 = answerToTwo.isChecked();


                // get the status of the checkbox for question 3_1 (Correct answer)
                CheckBox firstAnswerToThree = (CheckBox) rootView.findViewById(R.id.q3Answer1);
                boolean hasCheckedQ3One = firstAnswerToThree.isChecked();

                // get the status of the checkbox for question 3_2 (Wrong answer)
                CheckBox secondAnswerToThree = (CheckBox) rootView.findViewById(R.id.q3Answer2);
                boolean hasCheckedQ3Two = secondAnswerToThree.isChecked();

                // get the status of the checkbox for question 3_3 (Correct answer)
                CheckBox thirdAnswerToThree = (CheckBox) rootView.findViewById(R.id.q3Answer3);
                boolean hasCheckedQ3Three = thirdAnswerToThree.isChecked();

                // get the status of the checkbox for question 3_4 (Wrong answer)
                CheckBox fourthAnswerToThree = (CheckBox) rootView.findViewById(R.id.q3Answer4);
                boolean hasCheckedQ3Four = fourthAnswerToThree.isChecked();

                // get the value entered for question 4
                EditText getQ4Answer = (EditText) rootView.findViewById(R.id.q4CorrectAnswer);
                String hasEnteredQ4 = getQ4Answer.getText().toString().toUpperCase();

                // call method that calculates score

                int Score = scoreKepper(hasCheckedQ1, hasCheckedQ2, hasCheckedQ3One, hasCheckedQ3Two, hasCheckedQ3Three, hasCheckedQ3Four, hasEnteredQ4);


                Toast.makeText(getActivity(), "Your Score is " + Score + "%" + "\nThanks for your Time !!!!", Toast.LENGTH_SHORT).show();

            }


        });

        return rootView;

    }



//
    private int scoreKepper (boolean isCheckedQ1, boolean isCheckedQ2, boolean isCheckedQ3One, boolean isCheckedQ3Two, boolean isCheckedQ3Three, boolean isCheckedQ3Four, String checkedQ4){

        int totalScore = 0 ;

        if(isCheckedQ1){
            totalScore += 25;
        }

        if(isCheckedQ2){
            totalScore += 25;
        }

        if(isCheckedQ3One && isCheckedQ3Three && !(isCheckedQ3Two || isCheckedQ3Four)){
            totalScore += 25;
        }

        if(checkedQ4.equals("VOLTAGE")){
            totalScore += 25;
        }

        return totalScore;
    }


}






