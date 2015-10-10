package com.example.elvinkim.note;

import android.app.Activity;
import android.os.Bundle;
import android.widget.VideoView;

/**
 * Created by jinxh3 on 2015/9/30.
 */
public class AtyVideoViewer extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        VideoView vv = new VideoView(this);
        setContentView(vv);

        String path = getIntent().getStringExtra(EXTRA_PATH);

        if (path != null) {
            vv.setVideoPath(path);
        } else {
            finish();
        }
    }

    public static final String EXTRA_PATH = "path";
}
