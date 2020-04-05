package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        MobileAds.initialize(this, "ca-app-pub-7012362107398471~4836450987");
        AdView adView = (AdView)findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().addTestDevice("33BE2250B43518CCDA7DE426D04EE231").build();
        adView.loadAd(adRequest);
        */
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeForTeamA(View view){
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoForTeamA(View view){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void addOneForTeamA(View view){
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeForTeamB(View view){
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoForTeamB(View view){
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void addOneForTeamB(View view){
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
