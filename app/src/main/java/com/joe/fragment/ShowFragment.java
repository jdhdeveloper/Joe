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

/**
 * 用作只是进行文本展示的fragment
 */
public class ShowFragment extends Fragment {

    private TextView txtContent;

    /**
     * framgent如果直接写带参数的构造函数是会报错的
     * @param category
     * @return
     */
    public static ShowFragment newInstance(String category,String content){
        ShowFragment showFragment = new ShowFragment();
        Bundle bundle = new Bundle();
        bundle.putString("category",category);
        bundle.putString("content",content);
        showFragment.setArguments(bundle);
        return showFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Bundle bundle = getArguments();
        String category = bundle.getString("category");
        View view = null;
        if (category.equals("activity")){
             view = inflater.inflate(R.layout.fragment_show_activity,container,false);
        }else {
             view = inflater.inflate(R.layout.fragment_show,container,false);
        }
        txtContent = view.findViewById(R.id.txt_show_fragment);
        txtContent.setText(bundle.getString("content"));
        return view;
    }
}
