package com.jyqqhw.jnidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class JniActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jni);
        init();
    }

    private void init(){
        JniUtil jniUtil = new JniUtil();
        Log.i("WangJ", jniUtil.printJni("Hello World!"));
    }
}
