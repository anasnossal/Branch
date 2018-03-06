package com.example.android.branch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void NewMethod()
    {
        int i = 2+2;
        int ii = 2+3;

        String test = "test";
        String testTWo = "test two";
    }

    public void doSomework(){
        int n = 2+2;
        int nn = 2+3;

        String t = "test";
        String tTwo = "test two";
    }
}
