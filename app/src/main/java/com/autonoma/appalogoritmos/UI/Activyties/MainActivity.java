package com.autonoma.appalogoritmos.UI.Activyties;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.autonoma.appalogoritmos.R;
import com.autonoma.appalogoritmos.Service.ServiceThread;

/**
 * Created by ${Mike} on 5/8/15.
 */
public class MainActivity extends BaseActiviy implements View.OnClickListener {

    public static final String TAG = MainActivity.class.getSimpleName();
    Button btn_inicar;
    Button btn_detener;
    ServiceThread serviceThread = new ServiceThread();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btn_inicar = (Button) findViewById(R.id.btn_iniciar);
        btn_detener = (Button) findViewById(R.id.btn_detener);

        btn_inicar.setOnClickListener(this);
        btn_detener.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_iniciar:
                if (serviceThread.isRun()) {

                } else {
                    if (!serviceThread.isDaemon()) {
                        serviceThread.start();
                        Log.e(TAG, "inicarSrtart");
                    }
                    serviceThread.restore();
                }

                Log.e(TAG, "inicar");
                break;
            case R.id.btn_detener:
                //serviceThread.stopThread();
                //serviceThread.stopThread();
                serviceThread.stopThread_();
                Log.e(TAG, "detener");
                break;
        }
    }
}
