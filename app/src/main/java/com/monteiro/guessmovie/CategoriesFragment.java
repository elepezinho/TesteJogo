package com.monteiro.guessmovie;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.List;

public class CategoriesFragment extends Fragment {

    private ListView lv_categories;
    private CategoryAdapter adapter;
    private List<Category> al_categories;
    private Category cat;
    private Toolbar toolbar;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        cat = new Category();

        return null;
    }
}
