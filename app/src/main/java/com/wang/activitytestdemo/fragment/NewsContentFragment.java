package com.wang.activitytestdemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wang.activitytestdemo.R;

/**
 * Created by Wongerfeng on 2018/3/22.
 */

public class NewsContentFragment extends Fragment {

    private View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = LayoutInflater.from(getContext()).inflate(R.layout.layout_news_fragment,container,false);

        return view;
    }

    public void refreshUI() {
        view.findViewById(R.id.tvContent);
        view.findViewById(R.id.tvTitle);


    }
}
