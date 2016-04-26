package cn.studyjamscn.s1.sj41.guofengcheng;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now);
        getSupportActionBar().setTitle("Now");
    }
}
