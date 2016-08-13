package com.example.yan.video;

import android.app.Activity;
import android.os.Bundle;
import android.widget.VideoView;

public class Video extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //fill view from resource
        setContentView(R.layout.activity_video);
        VideoView video=(VideoView)findViewById(R.id.video);
        //Load and start the movie
        video.setVideoPath("ansen.mp4");
        video.start();
    }
}