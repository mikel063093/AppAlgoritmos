package com.autonoma.appalogoritmos.Service;


import android.util.Log;

import java.util.Random;

/**
 * Created by ${Mike} on 5/8/15.
 */
public class ServiceThread extends Thread {
    public static final String TAG = ServiceThread.class.getSimpleName();
    private boolean run = false;

    public void stopThread_() {
        run = false;
    }

    public void restore() {
        run = true;
    }

    public boolean isRun() {
        return run;
    }

    @Override
    public void run() {
        while (run) {

            createRamdon();
            if (!run) break;

        }
    }

    private void createRamdon() {
        Random r = new Random();
        int i1 = r.nextInt(80 - 65) + 65;
        Log.e(TAG, "Ramdon : " + i1);
    }
}
