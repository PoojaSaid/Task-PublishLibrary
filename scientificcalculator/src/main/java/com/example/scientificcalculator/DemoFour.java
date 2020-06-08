package com.example.scientificcalculator;

import android.util.Log;

public class DemoFour {
    private static final String TAG = "DemoFour" ;

    public void isArmstrong(int num){
        int  originalNum, remainder, result = 0;

        originalNum = num;

        while (originalNum != 0) {
            // remainder contains the last digit
            remainder = originalNum % 10;

            result += remainder * remainder * remainder;

            // removing last digit from the orignal number
            originalNum /= 10;
        }

        if (result == num)
            Log.d(TAG,"%d is an Armstrong number." + num);

        else
            Log.d(TAG,"%d is an Armstrong number." + num);


    }
}
