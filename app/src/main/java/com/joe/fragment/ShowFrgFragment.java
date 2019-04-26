package com.joe.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.joe.joe.R;

public class ShowFrgFragment extends Fragment {
    private TextView txtShow;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_show_fg,container,false);
        txtShow = view.findViewById(R.id.txt_show_fragment);
        txtShow.setText("Fragment的动态创建分为5步：\n1.创建待添加的碎片实例。\n" +
                "2.获取FragmentManager,在活动中可以直接通过调用getSupportFragmentManager()方法得当。\n" +
                "3.开启一个事务，通过调用beginTransaction()方法开启。\n" +
                "4.向容器内添加或替换碎片，一般使用replace（）方法实现，需要传入容器的id和待添加的碎片实例。\n" +
                "5.提交事务，调用commit()方法来完成。\n"+
                "代码：\n"+"ShowFrgFragment fragment = new ShowFrgFragment();\n" +
                "        FragmentManager fragmentManager = getSupportFragmentManager();\n" +
                "        FragmentTransaction transaction = fragmentManager.beginTransaction();\n" +
                "        transaction.replace(R.id.layout_show_fragment,fragment);\n" +
                "        transaction.commit();");
        return view;
    }
}
