package com.sharath.diagonal_task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.sharath.diagonal_task.model.Response;
import com.sharath.diagonal_task.utils.Utils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String jsonStr = Utils.getJsonFromAssets(this, "CONTENTLISTINGPAGE-PAGE1.json");
        Log.i("data", jsonStr);

        Gson gson = new Gson();
        Response page = gson.fromJson(jsonStr, Response.class);
    }


}
