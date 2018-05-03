package com.example.presly.fragmentsdynamic;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
   private int check = 0;
    private Fragment fragment_red, fragment_green;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void addFragment(View view){
        //create a dynamic fragmant object:
        fragment_red = new RedFragment();
        fragment_green = new GreenFragment();
if(check == 0) {
    getSupportFragmentManager().beginTransaction().add(R.id.frameLayoutContainer, fragment_red).commit();
    check = 1;
}
else {
    getSupportFragmentManager().beginTransaction().add(R.id.frameLayoutContainer, fragment_green).commit();
    check = 0;
}

    }
}
