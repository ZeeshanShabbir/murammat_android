package com.markhorist.murammat.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.markhorist.murammat.R;

/**
 * Created by shani on 7/17/2016.
 */
public class FeaturedIssues extends RecyclerView.Adapter<FeaturedIssues.FeaturedViewHolder> {


    @Override
    public FeaturedViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.featured_xml, parent, false);
        return new FeaturedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FeaturedViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public static class FeaturedViewHolder extends RecyclerView.ViewHolder {

        public FeaturedViewHolder(View itemView) {
            super(itemView);
        }
    }
}
