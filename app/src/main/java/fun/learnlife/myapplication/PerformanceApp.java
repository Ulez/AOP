package fun.learnlife.myapplication;

import android.app.Application;
import android.os.SystemClock;
import android.util.Log;

public class PerformanceApp extends Application {
    private static final String TAG = "lcy";
    @Override
    public void onCreate() {
        super.onCreate();
        Log.e(TAG,"onCreate..");
        cost1Secs();
        cost2Secs();
        cost3Secs();
    }
    private void cost1Secs(){
        SystemClock.sleep(1000);
    }
    private void cost2Secs(){
        SystemClock.sleep(2000);
    }
    private void cost3Secs(){
        SystemClock.sleep(3000);
    }
}
