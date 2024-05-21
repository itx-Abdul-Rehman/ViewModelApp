package com.example.viewmodelapp;

import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {

    int counter=0;

    public void increasedCounter(){
        counter++;
    }

    public int getCounter(){
        return counter;
    }
}
