package com.example.CricketIPL;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    CardView cardView1, cardView2;
    Dialog dialog;

    Button b1,music_btn;
    MediaPlayer mp1 = new MediaPlayer();
    TextView team1txt, team2txt, heading;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        cardView1 = findViewById(R.id.cardView1);
        cardView2 = findViewById(R.id.cardView2);

        b1 = findViewById(R.id.button);
//hello
//        mp1.setAudioStreamType(AudioManager.STREAM_MUSIC);
//        String path1 = "android.resource://" + getPackageName() + "/raw/wdlbobsbeat";
//
//        Uri audioURI1 = Uri.parse(path1);
//        try {
//            mp1.setDataSource(this, audioURI1);
//            mp1.prepare();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        mp1.start();
/*
        music_btn = findViewById(R.id.music_btn);

        music_btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onClick(View v) {
                if(Objects.equals(music_btn.getBackground().getConstantState(),getResources().getDrawable(R.drawable.music_on).getConstantState())){
                    music_btn.setBackgroundResource(R.drawable.music_off);
                    mp1.pause();
                }
                else {
                    music_btn.setBackgroundResource(R.drawable.music_on);
                    mp1.start();
                }
            }
        });
*/
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this, "Future Goal !!", Toast.LENGTH_SHORT).show();
            }
        });

        /*

        mp1.setAudioStreamType(AudioManager.STREAM_MUSIC);
        String path1 = "android.resource://" + getPackageName() + "/raw/wdlbobsbeat";

        Uri audioURI1 = Uri.parse(path1);
        try {
            mp1.setDataSource(this, audioURI1);
            mp1.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }
        mp1.start();

         */

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this, "Future Goal !!", Toast.LENGTH_SHORT).show();
            }
        });


        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
//                intent.putExtra("check","1");
//                startActivity(intent);
//                finish();
                iplTeams();
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                intent.putExtra("check","2");
                startActivity(intent);
                finish();
            }
        });

    }

    private void iplTeams(){
        dialog = new Dialog(MainActivity2.this);
        dialog.setContentView(R.layout.team_selecttion);
        dialog.setCancelable(false);

        ArrayList<String> arr = new ArrayList<>();


        Button b1 = dialog.findViewById(R.id.start);
        ImageView csk = dialog.findViewById(R.id.csk);
        ImageView mi = dialog.findViewById(R.id.mi);
        ImageView dc = dialog.findViewById(R.id.dc);
        ImageView gt = dialog.findViewById(R.id.gt);
        ImageView kkr = dialog.findViewById(R.id.kkr);
        ImageView lsg = dialog.findViewById(R.id.lsg);
        ImageView pk = dialog.findViewById(R.id.pk);
        ImageView rcb = dialog.findViewById(R.id.rcb);
        ImageView rr = dialog.findViewById(R.id.rr);
        ImageView srh = dialog.findViewById(R.id.srh);

        team1txt = dialog.findViewById(R.id.team_1);
        team2txt = dialog.findViewById(R.id.team_2);
        heading = dialog.findViewById(R.id.heading);
        dialog.show();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(arr.size() == 2){
                    Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                    System.out.println(arr.get(0)+" "+arr.get(1));
                    intent.putExtra("team1",arr.get(0));
                    intent.putExtra("team2",arr.get(1));
                    intent.putExtra("check","1");
                    startActivity(intent);
                    finish();
                }else{
                    Toast.makeText(MainActivity2.this, "Select 2 teams", Toast.LENGTH_SHORT).show();
                }
            }
        });

        csk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper(csk, arr);
            }
        });

        mi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper(mi, arr);
            }
        });

        rcb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper(rcb, arr);
            }
        });

        dc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper(dc, arr);
            }
        });

        gt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper(gt, arr);
            }
        });

        kkr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper(kkr, arr);
            }
        });

        lsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper(lsg, arr);
            }
        });

        pk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper(pk, arr);
            }
        });

        rr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper(rr, arr);
            }
        });

        srh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper(srh, arr);
            }
        });

    }

    private void helper(ImageView img, ArrayList<String> arr){
        if(arr.size() == 0){
            heading.setText("Select Team 2");
            String team1 = img.getResources().getResourceEntryName(img.getId()).toUpperCase();
            img.setImageResource(R.drawable.india);
            img.setClickable(false);
            team1txt.setText(team1);
            arr.add(team1);
        }else if(arr.size() == 1){
            String team2 = img.getResources().getResourceEntryName(img.getId()).toUpperCase();
            img.setImageResource(R.drawable.india);
            img.setClickable(false);
            team2txt.setText(team2);
            arr.add(team2);
        }else{
            Toast.makeText(MainActivity2.this, "2 teams already selected", Toast.LENGTH_SHORT).show();
        }
    }

}