package com.codestomp.di;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvMainText = findViewById(R.id.tvMainText);
        CarComponent carComponent = DaggerCarComponent.builder().modelNum(2012).engineNum(111001).build();
        carComponent.inject(this);
        // we always need to call next two functions ever time i had made an instance of this class just make @inject for methos you need
        tvMainText.append(car.testBody());
        tvMainText.append(car.testEngine());
        tvMainText.append(car.getCarCreation());

    }
}