package com.example.elvinkim.note;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

import java.io.File;

/**
 * Created by jinxh3 on 2015/9/30.
 */
public class AtyPhotoViewer extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ImageView iv = new ImageView(this);
        setContentView(iv);

        String path = getIntent().getStringExtra(EXTRA_PATH);

        if (path != null) {
            iv.setImageURI(Uri.fromFile(new File(path)));
        } else {
            finish();
        }
    }

    public static final String EXTRA_PATH = "path";
}
