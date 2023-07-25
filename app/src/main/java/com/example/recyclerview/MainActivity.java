package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<FruitsModel> FruitsModels = new ArrayList<>();
    int[] FruitsImages={R.drawable.img,R.drawable.img_1,R.drawable.img_2,R.drawable.img_3,R.drawable.img_4,R.drawable.img_5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView=findViewById(R.id.MyRecyclerView);

        setFruitsModels();
        F_RecyclerView_Adapter adapter= new F_RecyclerView_Adapter(this,FruitsModels);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    private void setFruitsModels(){
        String[] fruitsName=getResources().getStringArray(R.array.fruits_name);
        String[] fruitsPrice=getResources().getStringArray(R.array.fruits_price);

                for (int i=0; i<fruitsName.length;i++){
                    FruitsModels.add(new FruitsModel(fruitsName[i],fruitsPrice[i],FruitsImages[i]));
                }
    }
}