package fun.learnlife.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.os.TraceCompat;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Debug;
import android.os.SystemClock;
import android.view.View;
import android.widget.Toast;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv).setOnClickListener(this);
        cost1Secs();
        cost2Secs();
        cost3Secs();
    }

    private void cost1Secs() {
        SystemClock.sleep(1000);
    }

    private void cost2Secs() {
        SystemClock.sleep(2000);
    }

    private void cost3Secs() {
        SystemClock.sleep(3000);
    }


    @Override
    public void onClick(View v) {
        Toast.makeText(this, "start--", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "end--", Toast.LENGTH_SHORT).show();
    }
}
