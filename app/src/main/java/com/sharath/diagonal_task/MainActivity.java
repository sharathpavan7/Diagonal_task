package com.sharath.diagonal_task;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.gson.Gson;
import com.sharath.diagonal_task.adapter.ContentAdapter;
import com.sharath.diagonal_task.model.Item;
import com.sharath.diagonal_task.model.Response;
import com.sharath.diagonal_task.utils.Utils;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ContentAdapter contentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.content_recycler);

        String jsonStr = Utils.getJsonFromAssets(this, "CONTENTLISTINGPAGE-PAGE1.json");
        Gson gson = new Gson();
        Response response = gson.fromJson(jsonStr, Response.class);

        setAdapter(response.getPage().getContent_items().getItems());

    }

    private void setAdapter(ArrayList<Item> items) {
        contentAdapter = new ContentAdapter(this, items);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(contentAdapter);
        recyclerView.setVisibility(View.VISIBLE);
    }
}
