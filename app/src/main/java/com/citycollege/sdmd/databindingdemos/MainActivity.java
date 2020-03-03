package com.citycollege.sdmd.databindingdemos;

import android.os.Bundle;
import android.view.View;

import com.citycollege.sdmd.databindingdemos.databinding.ActivityMainBinding;

import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Item item = getRandomItem();
                startActivity(DataActivity.getStartingIntent(MainActivity.this, item));
            }
        });
    }

    private Item getRandomItem() {
        Random rng = new Random();
        return new Item("Item " + rng.nextInt(10), rng.nextFloat());
    }
}
