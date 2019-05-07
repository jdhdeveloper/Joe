package com.joe.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.joe.fragment.ShowFragment;
import com.joe.fragment.ShowFrgFragment;
import com.joe.joe.R;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        replaceFragment(new ShowFrgFragment());
        replaceFragment(ShowFragment.newInstance("activity","Activity是活动。有生命周期。"));
    }

    //封装一个替换fragment的方法
    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.layout_show_fragment,fragment);
        transaction.commit();
    }


}
