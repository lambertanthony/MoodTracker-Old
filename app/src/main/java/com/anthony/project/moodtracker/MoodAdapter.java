package com.anthony.project.moodtracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MoodAdapter extends RecyclerView.Adapter<MoodAdapter.UserViewHolder> {
    Context mContext;
    List<Mood> moodList;

    public MoodAdapter(Context mContext, List<Mood> moodList) {
        this.mContext = mContext;
        this.moodList = moodList;
    }

    @NonNull
    @Override
    public MoodAdapter.UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.mood_item,parent,false);

        return  new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MoodAdapter.UserViewHolder holder, int position) {
        Mood mood = moodList.get(position);
        holder.icon.setImageResource(mood.getMoodState());


    }

    @Override
    public int getItemCount() {
        return moodList.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        ImageView icon;

        //Layout container;
        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            icon = itemView.findViewById(R.id.moodState);

        }
    }
}
