package com.talaat_nwegaa.footballscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAGoals;
    int teamBGoals;
    int teamAShotsOnGoal;
    int teamBShotsOnGoal;
    int teamAFreeKicks;
    int teamBFreeKicks;
    int teamACornerKicks;
    int teamBCornerKicks;
    int teamAOffsides;
    int teamBOffsides;
    int teamAThrowIn;
    int teamBThrowIn;
    int teamAFouls;
    int teamBFouls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void incGoalsOfTeamA(View v) {
        teamAGoals += 1;
        displayTeamAGoals(teamAGoals);
    }

    public void incGoalsOfTeamB(View v) {
        teamBGoals += 1;
        displayTeamBGoals(teamBGoals);
    }

    public void incShotsOfTeamA(View v) {
        teamAShotsOnGoal += 1;
        displayTeamAShots(teamAShotsOnGoal);
    }

    public void incShotsOfTeamB(View v) {
        teamBShotsOnGoal += 1;
        displayTeamBShots(teamBShotsOnGoal);
    }
    public void incFreeKicksOfTeamA(View v) {
        teamAFreeKicks += 1;
        displayTeamAFreeKicks(teamAFreeKicks);
    }
    public void incFreeKicksOfTeamB(View v) {
        teamBFreeKicks += 1;
        displayTeamBFreeKicks(teamBFreeKicks);
    }
    public void incCornerKicksOfTeamA(View v) {
        teamACornerKicks += 1;
        displayTeamACornerKicks(teamACornerKicks);
    }
    public void incCornerKicksOfTeamB(View v) {
        teamBCornerKicks += 1;
        displayTeamBCornerKicks(teamBCornerKicks);
    }
    public void incOffsidesOfTeamA(View v) {
        teamAOffsides += 1;
        displayTeamAOffsides(teamAOffsides);
    }
    public void incOffsidesOfTeamB(View v) {
        teamBOffsides += 1;
        displayTeamBOffsides(teamBOffsides);
    }
    public void incThrowInOfTeamA(View v) {
        teamAThrowIn += 1;
        displayTeamAThrowIn(teamAThrowIn);
    }
    public void incThrowInOfTeamB(View v) {
        teamBThrowIn += 1;
        displayTeamBThrowIn(teamBThrowIn);
    }
    public void incFoulsOfTeamA(View v) {
        teamAFouls += 1;
        displayTeamAFouls(teamAFouls);
    }
    public void incFoulsOfTeamB(View v) {
        teamBFouls += 1;
        displayTeamBFouls(teamBFouls);
    }

    public void displayTeamAGoals(int goals) {
        TextView goalsView = (TextView) findViewById(R.id.team_a_goals);
        goalsView.setText(String.valueOf(goals));
    }

    public void displayTeamBGoals(int goals) {
        TextView goalsView = (TextView) findViewById(R.id.team_b_goals);
        goalsView.setText(String.valueOf(goals));
    }

    public void displayTeamAShots(int shots) {
        TextView shotsView = (TextView) findViewById(R.id.team_a_shots_on_goal);
        shotsView.setText(String.valueOf(shots));
    }

    public void displayTeamBShots(int shots) {
        TextView shotsView = (TextView) findViewById(R.id.team_b_shots_on_goal);
        shotsView.setText(String.valueOf(shots));
    }
    public void displayTeamAFreeKicks(int freeKicks) {
        TextView freeKicksView = (TextView) findViewById(R.id.team_a_free_kicks);
        freeKicksView.setText(String.valueOf(freeKicks));
    }
    public void displayTeamBFreeKicks(int freeKicks) {
        TextView freeKicksView = (TextView) findViewById(R.id.team_b_free_kicks);
        freeKicksView.setText(String.valueOf(freeKicks));
    }
    public void displayTeamACornerKicks(int cornerKicks) {
        TextView cornerKicksView = (TextView) findViewById(R.id.team_a_corner_kicks);
        cornerKicksView.setText(String.valueOf(cornerKicks));
    }
    public void displayTeamBCornerKicks(int cornerKicks) {
        TextView cornerKicksView = (TextView) findViewById(R.id.team_b_corner_kicks);
        cornerKicksView.setText(String.valueOf(cornerKicks));
    }
    public void displayTeamAOffsides(int offsides) {
        TextView offsidesView = (TextView) findViewById(R.id.team_a_offsides);
        offsidesView.setText(String.valueOf(offsides));
    }
    public void displayTeamBOffsides(int offsides) {
        TextView offsidesView = (TextView) findViewById(R.id.team_b_offsides);
        offsidesView.setText(String.valueOf(offsides));
    }
    public void displayTeamAThrowIn(int throwIn) {
        TextView throwInView = (TextView) findViewById(R.id.team_a_throw_in);
        throwInView.setText(String.valueOf(throwIn));
    }
    public void displayTeamBThrowIn(int throwIn) {
        TextView throwInView = (TextView) findViewById(R.id.team_b_throw_in);
        throwInView.setText(String.valueOf(throwIn));
    }
    public void displayTeamAFouls(int fouls) {
        TextView foulsView = (TextView) findViewById(R.id.team_a_fouls);
        foulsView.setText(String.valueOf(fouls));
    }
    public void displayTeamBFouls(int fouls) {
        TextView foulsView = (TextView) findViewById(R.id.team_b_fouls);
        foulsView.setText(String.valueOf(fouls));
    }
    public void resetall(View v){
         teamAGoals=0;
         teamBGoals=0;
         teamAShotsOnGoal=0;
         teamBShotsOnGoal=0;
         teamAFreeKicks=0;
         teamBFreeKicks=0;
         teamACornerKicks=0;
         teamBCornerKicks=0;
         teamAOffsides=0;
         teamBOffsides=0;
         teamAThrowIn=0;
         teamBThrowIn=0;
         teamAFouls=0;
         teamBFouls=0;
        displayTeamAGoals(teamAGoals);
        displayTeamBGoals(teamBGoals);
        displayTeamAShots(teamAShotsOnGoal);
        displayTeamBShots(teamBShotsOnGoal);
        displayTeamAFreeKicks(teamAFreeKicks);
        displayTeamBFreeKicks(teamBFreeKicks);
        displayTeamACornerKicks(teamACornerKicks);
        displayTeamBCornerKicks(teamBCornerKicks);
        displayTeamAOffsides(teamAOffsides);
        displayTeamBOffsides(teamBOffsides);
        displayTeamAThrowIn(teamAThrowIn);
        displayTeamBThrowIn(teamBThrowIn);
        displayTeamAFouls(teamAFouls);
        displayTeamBFouls(teamBFouls);

    }
}
