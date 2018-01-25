package com.udacity.gradle.builditbigger.androidmodule;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AndroidActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android);
        Intent intent = getIntent();
        String joke = intent.getStringExtra(Intent.EXTRA_TEXT);
        TextView mTextView = (TextView)findViewById(R.id.tv_joke);
        mTextView.setText(joke);
    }
}
