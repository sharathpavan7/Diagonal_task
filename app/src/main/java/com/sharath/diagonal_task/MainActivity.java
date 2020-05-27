package com.sharath.diagonal_task;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.sharath.diagonal_task.adapter.ContentAdapter;
import com.sharath.diagonal_task.model.Response;
import com.sharath.diagonal_task.utils.Utils;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ContentAdapter contentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.content_recycler);

        String jsonStr = Utils.getJsonFromAssets(this, "CONTENTLISTINGPAGE-PAGE1.json");
        Log.i("data", jsonStr);

        Gson gson = new Gson();
        Response page = gson.fromJson(jsonStr, Response.class);
    }

    private void setAdapter() {
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
    }
}
