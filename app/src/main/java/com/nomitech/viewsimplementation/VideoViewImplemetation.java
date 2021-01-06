package com.nomitech.viewsimplementation;

import androidx.appcompat.app.AppCompatActivity;


import android.app.Activity;
import android.app.ProgressDialog;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class VideoViewImplemetation extends AppCompatActivity {
VideoView videoView;
MediaController mediaController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view_implemetation);
        VideoView videoView=findViewById(R.id.video);
      //  videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.fishvideo));
videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.admission);
        MediaController mediaController=new MediaController(this);
        mediaController.setAnchorView(videoView);

        videoView.setMediaController(mediaController);

    }

}
