package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class F_RecyclerView_Adapter extends RecyclerView.Adapter< F_RecyclerView_Adapter.MyViewHolder> {

    Context context;
    ArrayList<FruitsModel> fruitsModels;
   public F_RecyclerView_Adapter(Context context, ArrayList<FruitsModel>fruitsModels){
this.context=context;
this.fruitsModels=fruitsModels;
   }
    @NonNull
    @Override
    public F_RecyclerView_Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.recycler_view_row,parent,false);
        return new F_RecyclerView_Adapter.MyViewHolder(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull F_RecyclerView_Adapter.MyViewHolder holder, int position) {

       holder.txtName.setText(fruitsModels.get(position).getFruitName());
       holder.txtPrice.setText(fruitsModels.get(position).getFruitPrice());
       holder.img.setImageResource(fruitsModels.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return fruitsModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView txtName,txtPrice;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.imageView);
            txtName=itemView.findViewById(R.id.txT);
            txtPrice=itemView.findViewById(R.id.txT2);


        }
    }
}
