package com.example.activitylitsener;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/**
 * Created by 恋人星宇 on 2017/10/19.
 */

public class MyApplication extends Application {
    private onActivityChangeListener onActivityChangeListener ;
    @Override
    public void onCreate() {
        super.onCreate();
        registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {

            }

            @Override
            public void onActivityStarted(Activity activity) {

            }

            @Override
            public void onActivityResumed(Activity activity) {
                onActivityChangeListener.onActivityChange(activity);
            }

            @Override
            public void onActivityPaused(Activity activity) {

            }

            @Override
            public void onActivityStopped(Activity activity) {

            }

            @Override
            public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

            }

            @Override
            public void onActivityDestroyed(Activity activity) {

            }
        });
    }
    public interface onActivityChangeListener{
        void onActivityChange(Activity activity);
    }
    public void setOnActivityChangeListener(onActivityChangeListener listener){
        this.onActivityChangeListener = listener;
    }
}
