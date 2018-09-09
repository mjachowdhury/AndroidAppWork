package com.example.mohammed.soccerscoretrackingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Global variable to hold score
    int goalTeamA = 0;
    int goalTeamB = 0;
    int redCardA = 0;
    int redCardB = 0;
    int yellowCardA = 0;
    int yellowCardB = 0;
    int foulA = 0;
    int foulB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * THis method will increase 1 points for team a
     * and calling displayGoalForTeamA method
     *
     * @param view
     */
    public void goalTeamA(View view) {
        goalTeamA = goalTeamA + 1;
        displayGoalForTeamA(goalTeamA);
    }

    /**
     * THis method will increase 1 points for team a
     * and calling displayRCForTeamA method
     *
     * @param view
     */
    public void rcTeamA(View view) {
        redCardA = redCardA + 1;
        displayRCForTeamA(redCardA);
    }

    /**
     * THis method will increase 1 points for team a
     * and calling displayYCForTeamA method
     *
     * @param view
     */
    public void ycTeamA(View view) {
        yellowCardA = yellowCardA + 1;
        displayYCForTeamA(yellowCardA);
    }

    /**
     * THis method will increase 1 points for team a
     * and calling displayFoulForTeamB method
     *
     * @param view
     */

    public void foulTeamA(View view) {
        foulA = foulA + 1;
        displayFoulForTeamA(foulA);
    }


    /**
     * These are display method
     *
     * @param score
     */
    public void displayGoalForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRCForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_rc);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYCForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yc);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * THis method will increase 1 points for team b
     * and calling displayGoalForTeamB method
     *
     * @param view
     */

    public void goalTeamB(View view) {
        goalTeamB = goalTeamB + 1;
        displayGoalForTeamB(goalTeamB);
    }

    /**
     * THis method will increase 1 points for team b
     * and calling displayRCForTeamB method
     *
     * @param view
     */
    public void rcTeamB(View view) {
        redCardB = redCardB + 1;
        displayRCForTeamB(redCardB);
    }

    /**
     * THis method will increase 1 points for team b
     * and calling displayYCForTeamB method
     *
     * @param view
     */
    public void ycTeamB(View view) {
        yellowCardB = yellowCardB + 1;
        displayYCForTeamB(yellowCardB);
    }

    /**
     * THis method will increase 1 points for team b
     * and calling displayFoulForTeamB method
     *
     * @param view
     */
    public void foulTeamB(View view) {
        foulB = foulB + 1;
        displayFoulForTeamB(foulB);
    }

    /**
     * This are display method for all the button
     *
     * @param score
     */

    public void displayGoalForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRCForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_rc);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYCForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yc);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Score reset method
     * first score will set 0 for both team
     * second calling display method
     *
     * @param view
     */
    public void resetScore(View view) {
        goalTeamA = 0;
        goalTeamB = 0;
        redCardA = 0;
        redCardB = 0;
        yellowCardA = 0;
        yellowCardB = 0;
        foulA = 0;
        foulB = 0;
        displayGoalForTeamA(goalTeamA);
        displayGoalForTeamB(goalTeamB);
        displayRCForTeamA(redCardA);
        displayRCForTeamB(redCardB);
        displayYCForTeamA(yellowCardA);
        displayYCForTeamB(yellowCardB);
        displayFoulForTeamA(foulA);
        displayFoulForTeamB(foulB);
    }

}

