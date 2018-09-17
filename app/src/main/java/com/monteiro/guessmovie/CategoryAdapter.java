package com.monteiro.guessmovie;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CategoryAdapter extends BaseAdapter {

    private List<Category> list_category;
    private Activity activity;

    public CategoryAdapter(List<Category> objects, Activity activity) {
        this.list_category = objects;
        this.activity = activity;
    }

    public int getCount() {
        return list_category.size();
    }

    public Category getItem(int position) {
        return list_category.get(position);
    }

    public long getItemId(int posistion) {
        return posistion;
    }

    public View getView(int position, View v, ViewGroup parent) {
        View view;
        view = activity.getLayoutInflater().inflate(R.layout.fragment_categories, parent, false);

        Category category = list_category.get(position);

        TextView name = (TextView) view.findViewById(R.id.tv_name_category);
        ImageView image = (ImageView) view.findViewById(R.id.img_category);

        name.setText(category.getName());

        image.setImageResource(category.getImage());

        return view;
    }
}