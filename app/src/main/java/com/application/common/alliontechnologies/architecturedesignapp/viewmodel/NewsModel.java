package com.application.common.alliontechnologies.architecturedesignapp.viewmodel;

import com.application.common.alliontechnologies.architecturedesignapp.model.News;

import java.util.ArrayList;

public class NewsModel {

    private String header;
    private String description;

    public NewsModel() {
    }

    public NewsModel(News news) {
        this.header = news.header;
        this.description = news.description;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<NewsModel> getArrayListItems(){

        ArrayList<NewsModel> newsModelArrayList = new ArrayList<>();
        NewsModel newsModel = new NewsModel(new News("Hello","World"));
        newsModelArrayList.add(newsModel);
        return newsModelArrayList;
    }
}
