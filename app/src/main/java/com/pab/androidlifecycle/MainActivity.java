package com.pab.androidlifecycle;

import static android.widget.Toast.LENGTH_LONG;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { // bLOK CODE ONCREATE()
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onStart() {
        super.onStart();
        Toast.makeText(this, "Posisi lagi start nih  nih", LENGTH_LONG).show();
    }

    public void onStop() {
        super.onStop();
        Toast.makeText(this, "Posisi lagi stop  nih", LENGTH_LONG).show();
    }

    public void onResume() {
        super.onResume();
        Toast.makeText(this, "Posisi lagi Resume  nih", LENGTH_LONG).show();

    }

    public void onPause() {
        super.onPause();
        Toast.makeText(this, "Posisi lagi pause  nih", LENGTH_LONG).show();

    }

    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Posisi udah hancur  nih", LENGTH_LONG).show();

    }


}