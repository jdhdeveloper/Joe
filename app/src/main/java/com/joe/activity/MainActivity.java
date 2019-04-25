package com.joe.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.joe.adapter.RyAdapter;
import com.joe.bean.Technology;
import com.joe.joe.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> mTechnologyList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initTechnology();
        RecyclerView mRv = findViewById(R.id.rv_main);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRv.setLayoutManager(layoutManager);
        RyAdapter adapter = new RyAdapter(mTechnologyList);
        mRv.setAdapter(adapter);
    }

    //初始化技术列表数据，后期修改为用户可自由增加
    public void initTechnology(){
        mTechnologyList = new ArrayList<>();
        mTechnologyList.add("TextView");
        mTechnologyList.add("Button");
        mTechnologyList.add("EditText");
        mTechnologyList.add("TextView");
        mTechnologyList.add("TextView");
        mTechnologyList.add("TextView");
        mTechnologyList.add("TextView");
        mTechnologyList.add("TextView");
        mTechnologyList.add("TextView");
        mTechnologyList.add("TextView");
        mTechnologyList.add("TextView");
        mTechnologyList.add("TextView");
    }
}
