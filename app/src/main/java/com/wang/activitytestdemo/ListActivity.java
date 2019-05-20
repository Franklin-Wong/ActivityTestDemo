package com.wang.activitytestdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wongerfeng on 2018/3/21.
 */

public class ListActivity extends AppCompatActivity {

    private List<String> mStringList = new ArrayList<>();
    private RecyclerView mRecyclerView;
    private MyRecyclerViewAdapter mAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        initView();
        initData();

    }

    private void initView() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //纵向
//        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        //横向
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        //表格

        StaggeredGridLayoutManager gridLayoutManager =
                new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);


        mRecyclerView = findViewById(R.id.recyclerView);
//        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setLayoutManager(gridLayoutManager);

    }

    private void initData() {
        for (int i = 0;i<30;i++){
            mStringList.add("这是第" + i +"行");
        }

        mAdapter = new MyRecyclerViewAdapter(mStringList);
        mRecyclerView.setAdapter(mAdapter);
    }

}
