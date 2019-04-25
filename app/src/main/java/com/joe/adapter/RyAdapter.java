package com.joe.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.joe.bean.Technology;
import com.joe.joe.R;

import java.util.List;

public class RyAdapter extends RecyclerView.Adapter<RyAdapter.ViewHolder> {

    private List<String> mTechnologyList;

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView technologyName;

        public ViewHolder (View view){
            super(view);
            technologyName = view.findViewById(R.id.txt_ry_main);
        }
    }

    public RyAdapter(List<String> technologyList){
        mTechnologyList = technologyList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ry_main,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.technologyName.setText(mTechnologyList.get(position));
    }

    @Override
    public int getItemCount() {
        return mTechnologyList.size();
    }
}
