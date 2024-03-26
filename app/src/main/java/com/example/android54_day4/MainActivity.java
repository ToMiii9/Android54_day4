package com.example.android54_day4;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends Activity {

    private ListView listView;
    private FeedAdapter Adapter;
    private ArrayList<FeedItem> feedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listView = findViewById(R.id.list_item_feed);
        feedList = new ArrayList<>();
        // Add data to feedList (e.g., populate from API or database)

        // Create and set adapter
        FeedAdapter adapter = new FeedAdapter(this, feedList);
        listView.setAdapter((ListAdapter) Adapter);
    }
}
