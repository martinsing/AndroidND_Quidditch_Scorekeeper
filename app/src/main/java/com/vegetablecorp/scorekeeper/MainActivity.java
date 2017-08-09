package com.vegetablecorp.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int scoreTeamA = 0;
    private int scoreTeamB = 0;
    private int snitch = 150;
    private int quaffle = 10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void add150ForTeamA(View v) {
        scoreTeamA += snitch;
        displayForTeamA(scoreTeamA);
    }

    public void add10ForTeamA(View v) {
        scoreTeamA += quaffle;
        displayForTeamA(scoreTeamA);
    }

    public void add1ForTeamA(View v) {
        scoreTeamA++;
        displayForTeamA(scoreTeamA);
    }

    public void subtract1ForTeamA(View v) {
        scoreTeamA--;
        displayForTeamA(scoreTeamA);
    }


    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void add150ForTeamB(View v) {
        scoreTeamB += snitch;
        displayForTeamB(scoreTeamB);
    }

    public void add10ForTeamB(View v) {
        scoreTeamB += quaffle;
        displayForTeamB(scoreTeamB);
    }

    public void add1ForTeamB(View v) {
        scoreTeamB++;
        displayForTeamB(scoreTeamB);
    }

    public void subtract1ForTeamB(View v) {
        scoreTeamB--;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Resets the scores.
     */
    public void reset(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
