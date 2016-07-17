package com.markhorist.murammat.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by shani on 7/17/2016.
 */
public class ProfileFeedAdapter extends RecyclerView.Adapter<ProfileFeedAdapter.ProfileViewHolder> {


    @Override
    public ProfileViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ProfileViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ProfileViewHolder extends RecyclerView.ViewHolder {

        public ProfileViewHolder(View itemView) {
            super(itemView);
        }
    }
}
