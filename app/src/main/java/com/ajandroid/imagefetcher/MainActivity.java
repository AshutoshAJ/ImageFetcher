package com.ajandroid.imagefetcher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goButtonClicked(View view) {
        Random random = new Random();
        int choice = random.nextInt(4);
        switch (choice) {
            case 0:
                Intent intent0 = new Intent(this, ImageActivity0.class);
                Log.i("Choice", choice+"");
                startActivity(intent0);
                break;
            case 1:
                Intent intent1 = new Intent(this, ImageActivity1.class);
                Log.i("Choice", choice+"");
                startActivity(intent1);
                break;
            case 2:
                Intent intent2 = new Intent(this, ImageActivity2.class);
                Log.i("Choice", choice+"");
                startActivity(intent2);
                break;
            case 3:
                Intent intent3 = new Intent(this, ImageActivity3.class);
                Log.i("Choice", choice+"");
                startActivity(intent3);
                break;
            default:
                Intent intent = new Intent(this, ImageActivity0 .class);
                Log.i("Choice", choice+"");
                startActivity(intent);
                break;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity();
    }
}