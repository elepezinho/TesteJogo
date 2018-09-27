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
    private  TextView name;
    private ImageView image;
    private TextView level;
    private Category category;
    private View view;

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

        view = activity.getLayoutInflater().inflate(R.layout.fragment_categories, parent, false);
        category = list_category.get(position);

        name = (TextView) view.findViewById(R.id.tv_name_category);
        image = (ImageView) view.findViewById(R.id.img_category);
        level = (TextView) view.findViewById(R.id.txv_level);

        name.setText(category.getName());
        image.setImageResource(category.getImage());
        if(category.getLevel()>category.getTotal()){
            level.setText(category.getLevel()-1+"/"+category.getTotal());
        } else level.setText(category.getLevel()+"/"+category.getTotal());

        return view;
    }
}