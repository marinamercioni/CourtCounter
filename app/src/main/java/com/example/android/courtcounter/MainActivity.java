package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int scoreForTeamA=0;
    int scoreForTeamB=0;

    /**
     *
     * Display the given score for Team A.
     */
    public void displayForTeamA(int scoreForTeamA)
    {
        TextView scoreView=(TextView)findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreForTeamA));
    }



    public void threePointsA(View view)
    {

        scoreForTeamA=scoreForTeamA+3;
        displayForTeamA(scoreForTeamA);
    }


    public void twoPointsA(View view)
    {
        scoreForTeamA=scoreForTeamA+2;
        displayForTeamA(scoreForTeamA);
    }


    public void freeThrowA(View view)
    {
        scoreForTeamA=scoreForTeamA+1;
        displayForTeamA(scoreForTeamA);
    }





    /**
     *
     * Display the given score for Team B.
     */

    public void displayForTeamB(int scoreForTeamB)
    {
        TextView scoreView=(TextView)findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreForTeamB));
    }



    public void threePointsB(View view)
    {

        scoreForTeamB=scoreForTeamB+3;
        displayForTeamB(scoreForTeamB);
    }

    public void twoPointsB(View view)
    {
        scoreForTeamB=scoreForTeamB+2;
        displayForTeamB(scoreForTeamB);
    }


    public void freeThrowB(View view)
    {
        scoreForTeamB=scoreForTeamB+1;
        displayForTeamB(scoreForTeamB);
    }



    public void reset(View view)
    {
        scoreForTeamA=0;
        scoreForTeamB=0;
        displayForTeamA(0);
        displayForTeamB(0);



    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }


}
