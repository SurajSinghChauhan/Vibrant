package com.example.vibrant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

public class VibRant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vib_rant);


        Button vibrate_btn = findViewById(R.id.vibrate_btn);

        final Vibrator vibrator= (Vibrator) getSystemService(VIBRATOR_SERVICE);

        vibrate_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    if (Build.VERSION.SDK_INT >= 26) {
                        vibrator.vibrate(VibrationEffect.createOneShot(200, VibrationEffect.DEFAULT_AMPLITUDE));
                    } else {
                        vibrator.vibrate(200);
                    }
                }
        });


    }
}
