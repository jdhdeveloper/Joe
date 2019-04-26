package com.joe.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.joe.activity.ShowActivity;
import com.joe.joe.R;

import java.util.List;

public class RyAdapter extends RecyclerView.Adapter<RyAdapter.ViewHolder> {

    private List<String> mTechnologyList;
    private Context mContext;

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView technologyName;

        public ViewHolder (View view){
            super(view);
            technologyName = view.findViewById(R.id.txt_ry_main);
        }
    }

    public RyAdapter(List<String> technologyList,Context context){
        this.mTechnologyList = technologyList;
        this.mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull final ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ry_main,parent,false);
        final ViewHolder holder = new ViewHolder(view);
        holder.technologyName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                //TODO:item监听事件
                Toast.makeText(v.getContext(),"click"+mTechnologyList.get(position),Toast.LENGTH_LONG).show();
                mContext.startActivity(new Intent(mContext,ShowActivity.class));
            }
        });
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
