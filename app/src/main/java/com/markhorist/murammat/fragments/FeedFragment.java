package com.markhorist.murammat.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.markhorist.murammat.R;
import com.markhorist.murammat.adapter.FeaturedIssues;

/**
 * Created by shani on 7/16/2016.
 */
public class FeedFragment extends Fragment {
    RecyclerView recyclerView;
    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_feed, container, false);
        initUi();
        return view;
    }

    private void initUi() {
        recyclerView = (RecyclerView) view.findViewById(R.id.featured);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        FeaturedIssues featuredIssues = new FeaturedIssues();
        recyclerView.setAdapter(featuredIssues);
    }
}
