package com.example.calendar;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class EditProfile extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
    }


    public void onSaveButtonClick(View view){
        finish();
    }
    public void onExitButtonClick(View view){
        finish();
    }

}
