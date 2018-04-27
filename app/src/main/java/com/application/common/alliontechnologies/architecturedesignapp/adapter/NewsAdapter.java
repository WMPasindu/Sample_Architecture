package com.application.common.alliontechnologies.architecturedesignapp.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.application.common.alliontechnologies.architecturedesignapp.R;
import com.application.common.alliontechnologies.architecturedesignapp.databinding.NewsRowBinding;
import com.application.common.alliontechnologies.architecturedesignapp.viewmodel.NewsModel;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<NewsModel> {

    private ArrayList<NewsModel> newsModels;
    private Context context;

    public NewsAdapter(@NonNull Context context, ArrayList<NewsModel> newsModelArrayList) {
        super(context, R.layout.news_row, newsModelArrayList);
        this.context = context;
        this.newsModels = newsModelArrayList;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        NewsRowBinding newsRowBinding = DataBindingUtil.inflate(layoutInflater, R.layout.news_row,parent,false);
        newsRowBinding.setNewsList(newsModels.get(position));
        return newsRowBinding.getRoot();
    }
}
