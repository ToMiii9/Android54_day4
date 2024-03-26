package com.example.android54_day4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class UserAdapter extends ArrayAdapter<FeedItem> {

    private ArrayList<FeedItem> feedList;
    private Context context;

    public UserAdapter(Context context, ArrayList<FeedItem> feedList) {
        super(context, R.layout.activity_main2, feedList);
        this.context = context;
        this.feedList = feedList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.activity_main2, parent, false);

        ImageView imageView = rowView.findViewById(R.id.imageView);
        TextView textViewTitle = rowView.findViewById(R.id.textViewTitle);
        TextView textViewDescription = rowView.findViewById(R.id.textViewDescription);

        FeedItem item = feedList.get(position);

        // Set data to the views
        imageView.setImageResource(item.getImageResource());
        textViewTitle.setText(item.getUsername());
        textViewDescription.setText(item.getDescription());

        return rowView;
    }
}
