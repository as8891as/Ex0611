package com.example.ex0611;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Switch sw;
    RadioButton rB1, rB2, rB3, rB4;
    ConstraintLayout cL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sw = findViewById(R.id.sw);
        rB1 = findViewById(R.id.rB1);
        rB2 = findViewById(R.id.rB2);
        rB3 = findViewById(R.id.rB3);
        rB4 = findViewById(R.id.rB4);
        cL = findViewById(R.id.main);
    }

    public void ManuelChange(View view) {
        if (!sw.isChecked())
        {
            if (rB1.isChecked())
            {
                cL.setBackgroundColor(Color.WHITE);
            }
            else if (rB2.isChecked())
            {
                cL.setBackgroundColor(Color.RED);
            }
            else if (rB3.isChecked())
            {
                cL.setBackgroundColor(Color.GREEN);
            }
            else
            {
                cL.setBackgroundColor(Color.BLUE);
            }
        }
    }
}