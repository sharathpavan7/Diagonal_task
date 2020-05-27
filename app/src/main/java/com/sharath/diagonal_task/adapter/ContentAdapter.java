package com.sharath.diagonal_task.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.sharath.diagonal_task.R;
import com.sharath.diagonal_task.model.Item;

import java.util.ArrayList;

public class ContentAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<Item> items;
    private LayoutInflater layoutInflater;

    public ContentAdapter(Context context, ArrayList<Item> items) {
        this.items = items;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        final Item item = items.get(position);

        TextView titleTxt = ((ItemViewHolder) holder).getTitle_txt();
        titleTxt.setText(item.getName());

        ImageView itemImg = ((ItemViewHolder) holder).getItem_img();
        Glide.with(itemImg.getContext())
                .load(getDrawable(item.getPoster_image()))
                .placeholder(R.drawable.placeholder_for_missing_posters)
                .into(itemImg);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    private int getDrawable(String poster) {
        switch (poster) {
            case "poster1.jpg":
                return R.drawable.poster1;
            case "poster2.jpg":
                return R.drawable.poster2;
            case "poster3.jpg":
                return R.drawable.poster3;
            case "poster4.jpg":
                return R.drawable.poster4;
            case "poster5.jpg":
                return R.drawable.poster5;
            case "poster6.jpg":
                return R.drawable.poster6;
            case "poster7.jpg":
                return R.drawable.poster7;
            case "poster8.jpg":
                return R.drawable.poster8;
            case "poster9.jpg":
                return R.drawable.poster9;
            default:
                return R.drawable.placeholder_for_missing_posters;
        }
    }

    private static class ItemViewHolder extends RecyclerView.ViewHolder {

        private ImageView item_img;
        private TextView title_txt;

        ItemViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public ImageView getItem_img() {
            if (item_img == null) {
                item_img = itemView.findViewById(R.id.item_img);
            }
            return item_img;
        }

        public TextView getTitle_txt() {
            if (title_txt == null) {
                title_txt = itemView.findViewById(R.id.title_txt);
            }
            return title_txt;
        }
    }
}
