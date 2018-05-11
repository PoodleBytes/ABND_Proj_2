package com.example.android.abnd_proj_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * *        2018-May-11
 * PoodleBytes
 * <p>
 * Project 2 - Basketball Court Counter
 * Used project from Android Basics as basis
 * <p>
 * activity_main.xml done from scratch using ConstraintLayout
 * <p>
 * Happy with Java code pretty-much untouched
 * <p>
 * <p>
 * <p>
 * QUESTIONS
 * Does constraintView make this a 'responsive UI'?
 * How do I autosize the textSize
 * Do I have to do both portrait & landscape views?
 */


public class MainActivity extends AppCompatActivity {

    // Track score
    public static int SCOREA = 0;
    public static int SCOREB = 0;
    TextView tvScoreA;
    TextView tvScoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvScoreA = findViewById(R.id.tvScoreA);
        tvScoreB = findViewById(R.id.tvScoreB);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        // Save the user's current game state
        outState.putInt("SCORE_A", SCOREA);
        outState.putInt("SCORE_B", SCOREB);

        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        SCOREA = savedInstanceState.getInt("SCORE_A");
        SCOREB = savedInstanceState.getInt("SCORE_B");
        displayA(SCOREA);
        displayB(SCOREB);
    }

    //  add points to A
    public void addPointA(int n) {
        SCOREA = SCOREA + n;
        displayA(SCOREA);
    }

    //  +1 for A
    public void addOneA(View v) {
        addPointA(1);
    }

    //  +2 for A
    public void addTwoA(View v) {
        addPointA(2);
    }

    //  +3 for A
    public void addThreeA(View v) {
        addPointA(3);
    }

    //  add points to B
    public void addPointB(int n) {
        SCOREB = SCOREB + n;
        displayB(SCOREB);
    }

    //  +1 for B
    public void addOneB(View v) {
        addPointB(1);
    }

    public void addTwoB(View v) {
        addPointB(2);
    }

    //  +3 for B
    public void addThreeB(View v) {
        addPointB(3);
    }

    //update team B score
    public void displayA(int score) {
        tvScoreA.setText(String.valueOf(score));
    }

    //update team B score
    public void displayB(int score) {
        tvScoreB.setText(String.valueOf(score));
    }

    //reset
    public void reset(View v) {
        SCOREA = 0;
        SCOREB = 0;
        displayA(SCOREA);
        displayB(SCOREB);
    }

}