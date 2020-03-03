package com.citycollege.sdmd.databindingdemos;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.citycollege.sdmd.databindingdemos.databinding.ActivityDataBinding;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

public class DataActivity extends AppCompatActivity {

    private static String EXTRA_ITEM = "item";

    public static Intent getStartingIntent(Context context, Item item) {
        Intent intent = new Intent(context, DataActivity.class);
        intent.putExtra(EXTRA_ITEM, item);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDataBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_data);

        Item item = (Item) getIntent().getSerializableExtra(EXTRA_ITEM);
        binding.setItem(item);
    }
}
