package com.example.yan.audio;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;

public class Audio extends AppCompatActivity {
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        int resId;
        switch(keyCode)
        {
            case KeyEvent.KEYCODE_DPAD_UP:
                resId=R.raw.a;
                break;
            case KeyEvent.KEYCODE_DPAD_DOWN:
                resId=R.raw.a;
                break;
            case KeyEvent.KEYCODE_DPAD_LEFT:
                resId=R.raw.a;
                break;
            case KeyEvent.KEYCODE_DPAD_RIGHT:
                resId=R.raw.a;
                break;
            case KeyEvent.KEYCODE_DPAD_CENTER:
            case KeyEvent.KEYCODE_ENTER:
                resId=R.raw.a;
                break;
            case KeyEvent.KEYCODE_A:
                resId=R.raw.a;
                break;
            case KeyEvent.KEYCODE_S:
                resId=R.raw.a;
                break;
            case KeyEvent.KEYCODE_D:
                resId=R.raw.a;
                break;
            case KeyEvent.KEYCODE_F:
                resId=R.raw.a;
                break;
            default:
                return super.onKeyDown(keyCode,event);
        }
        //Release any resources from previous Mediaplayer
        if(mp!=null)
        {
            mp.release();
        }
        //Create a new Mediaplayer to play this sound
        mp=MediaPlayer.create(this,resId);
        mp.start();
        // Indicate this key was handled
        return true;
    }
}

























