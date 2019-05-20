package com.wang.activitytestdemo;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wongerfeng on 2018/3/21.
 *
 */

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder>{
    private static final String TAG = "MyRecyclerViewAdapter";

    private List<String> mStringList = new ArrayList<>();

    public MyRecyclerViewAdapter(List<String> stringList) {
        mStringList = stringList;
    }
    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        public ViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        //处理子view点击事件
        viewHolder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "onClick: ----textView");

            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyRecyclerViewAdapter.ViewHolder holder, int position) {
        String s = mStringList.get(position);
        holder.textView.setText(s);
    }

    @Override
    public int getItemCount() {
        return mStringList.size();
    }
}
