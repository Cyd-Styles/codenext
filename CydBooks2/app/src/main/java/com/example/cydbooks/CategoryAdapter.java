package com.example.cydbooks;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class CategoryAdapter extends ArrayAdapter<CategoryItem> {
    public CategoryAdapter(Context context, ArrayList list) {
        super(context, 0, list);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.category_list_item, parent, false);
        CategoryItem currentCategoryItem = getItem(position);
        ImageView categoryItemImageView = convertView.findViewById(R.id.list_item_bookcover);
        TextView categoryItemTextView = convertView.findViewById(R.id.list_item_author);
        categoryItemImageView.setImageResource(currentCategoryItem.getBookCover());
        categoryItemTextView.setText(currentCategoryItem.getTitle());
        categoryItemTextView.setText(currentCategoryItem.getAuthor());

        return convertView;
    }
}


