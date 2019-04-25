package com.joe.activity;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.joe.joe.R;

public class WelcomeActivity extends AppCompatActivity {

    private TextView txtTitle;
    private int count = 0;
    private String arr[] = {"不","要","放","弃","坚","持","到","底"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        txtTitle = findViewById(R.id.txt_title);
        //写一个计时器，把数组中的字展示完，跳转到MainActivity
        CountDownTimer timer = new CountDownTimer(arr.length*1000+100,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                Log.i("welcomeActivity","count:"+count);
                txtTitle.setText(arr[count]);//把开场的字，轮换展示
                txtTitle.setTextSize(18+count*8);
                count++;
                if(count>arr.length-1)count=0;//防止出现数组下标越界
            }

            @Override
            public void onFinish() {
                //跳转到MainActivity
                Intent intent = new Intent(WelcomeActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        }.start();

    }
}
