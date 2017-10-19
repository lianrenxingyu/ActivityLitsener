package com.example.activitylitsener;

import android.app.Activity;
import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    MyApplication myApplication = new MyApplication();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.textView).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        myApplication.setOnActivityChangeListener(new MyApplication.onActivityChangeListener() {
            @Override
            public void onActivityChange(Activity activity) {
                Log.d(activity.getLocalClassName(),activity.getCallingPackage());
            }
        });
    }

}
