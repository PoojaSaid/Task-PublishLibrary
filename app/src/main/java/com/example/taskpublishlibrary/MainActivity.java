package com.example.taskpublishlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.scientificcalculator.Demo;
import com.example.scientificcalculator.DemoThree;
import com.example.scientificcalculator.DemoTwo;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Demo example = new Demo();
        float addition = example.addition(2f, 10f);
        Log.d(TAG, "Addition:- "+addition);

        DemoTwo objOne = new DemoTwo();
        String isEven = objOne.evenOrOdd(12);
        Log.d(TAG,"The number is " + isEven);


        DemoThree objTwo = new DemoThree();
        Boolean status = objTwo.isPalindrome(101);
        Log.d(TAG,"Is the enter number is palindrome = " + status);

    }
}
