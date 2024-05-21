package com.example.viewmodelapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;

import com.example.viewmodelapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

   ActivityMainBinding activityMainBinding;
  MyViewModel myViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        myViewModel=new ViewModelProvider(this).get(MyViewModel.class);
        activityMainBinding.counter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myViewModel.increasedCounter();
               activityMainBinding.result.setText(myViewModel.getCounter()+"");
            }
        });
        activityMainBinding.result.setText(myViewModel.getCounter()+"");
    }
}