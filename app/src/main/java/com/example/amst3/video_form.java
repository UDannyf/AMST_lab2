package com.example.amst3;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class video_form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_form);
        VideoView videoView =(VideoView)findViewById(R.id.videoView);
        MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);
        Uri uri=Uri.parse("android.resource://"+ getPackageName() +"/"+R.raw.video);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.start();
    }
}
