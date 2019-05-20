package com.wang.activitytestdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.wang.activitytestdemo.fragment.NewsContentFragment;

/**
 * Created by Wongerfeng on 2018/3/23.
 */

public class NewsActivity extends BaseActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_fragment);
        NewsContentFragment fragment = (NewsContentFragment) getSupportFragmentManager().findFragmentById(R.id.newsFragment);
        fragment.refreshUI();
        //替换碎片
//        mBtReplaceFrag = findViewById(R.id.btReplaceFrag);
//        mBtReplaceFrag.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                replaceFragment(new AnotherRightFragment());
//            }
//        });


    }

}
