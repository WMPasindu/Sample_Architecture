package com.application.common.alliontechnologies.architecturedesignapp.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.application.common.alliontechnologies.architecturedesignapp.R;
import com.application.common.alliontechnologies.architecturedesignapp.adapter.NewsAdapter;
import com.application.common.alliontechnologies.architecturedesignapp.databinding.ActivityHomeBinding;
import com.application.common.alliontechnologies.architecturedesignapp.databinding.ActivityMainBinding;
import com.application.common.alliontechnologies.architecturedesignapp.model.News;
import com.application.common.alliontechnologies.architecturedesignapp.viewmodel.NewsModel;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {


    private ActivityHomeBinding activityHomeBinding;
    private NewsModel newsModel;
    private News news;
    private ArrayList<NewsModel> newsModelArrayList;
    private NewsAdapter newsAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_home);

        activityHomeBinding = DataBindingUtil.setContentView(this, R.layout.activity_home);
        newsModel = new NewsModel();
        newsModelArrayList = newsModel.getArrayListItems();
        newsAdapter = new NewsAdapter(this, newsModelArrayList);
        activityHomeBinding.listview.setAdapter(newsAdapter);
    }
}
