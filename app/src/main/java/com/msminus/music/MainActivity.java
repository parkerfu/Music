package com.msminus.music;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    //add member variables here
    private SoundPool mSoundPool;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;
    //soundpool play action constant
    float leftVolum = 1.0f;
    float rightVolum = 1.0f;
    int priority = 0;
    int loop = 0;
    float rate = 1.0f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Create a new SoundPool
        mSoundPool = new SoundPool(7, AudioManager.STREAM_MUSIC, 0);
        //Load and get the IDs to identify the sounds
        mCSoundId = mSoundPool.load(getApplicationContext(), R.raw.note1_c,1);
        mDSoundId = mSoundPool.load(getApplicationContext(),R.raw.note2_d,1);
        mESoundId = mSoundPool.load(getApplicationContext(),R.raw.note3_e,1);
        mFSoundId = mSoundPool.load(getApplicationContext(),R.raw.note4_f,1);
        mGSoundId = mSoundPool.load(getApplicationContext(),R.raw.note5_g,1);
        mASoundId = mSoundPool.load(getApplicationContext(),R.raw.note6_a,1);
        mBSoundId = mSoundPool.load(getApplicationContext(),R.raw.note7_b,1);
    }

    //onclick Play method triggered by the buttons
    public void playC(View view){
        mSoundPool.play(mCSoundId,leftVolum,rightVolum,priority,loop,rate);
        Log.d("buttonclick","playC");
    }
    public void playD(View view){
        mSoundPool.play(mDSoundId,leftVolum,rightVolum,priority,loop,rate);
        Log.d("buttonclick","playD");
    }
    public void playE(View view){
        mSoundPool.play(mESoundId,leftVolum,rightVolum,priority,loop,rate);
        Log.d("buttonclick","playE");
    }
    public void playF(View view){
        mSoundPool.play(mFSoundId,leftVolum,rightVolum,priority,loop,rate);
        Log.d("buttonclick","playF");
    }
    public void playG(View view){
        mSoundPool.play(mGSoundId,leftVolum,rightVolum,priority,loop,rate);
        Log.d("buttonclick","playG");
    }
    public void playA(View view){
        mSoundPool.play(mASoundId,leftVolum,rightVolum,priority,loop,rate);
        Log.d("buttonclick","playA");
    }
    public void playB(View view){
        mSoundPool.play(mBSoundId,leftVolum,rightVolum,priority,loop,rate);
        Log.d("buttonclick","playB");
    }

}
