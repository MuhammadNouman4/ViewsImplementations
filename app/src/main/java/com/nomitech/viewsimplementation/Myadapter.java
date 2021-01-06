package com.nomitech.viewsimplementation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Myadapter extends RecyclerView.Adapter<Myadapter.MyAdapterView> {
    Context context;
    String data1[],data2[],data3[];
    int[] imgview;

    public Myadapter(Context context, String[] data1, String[] data2, String[] data3, int[] imgview) {
        this.context = context;
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        this.imgview = imgview;
    }

    @NonNull
    @Override
    public MyAdapterView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
       View view = inflater.inflate(R.layout.rvmyadapter, parent, false);

        return new MyAdapterView(view);
    }



    @Override
    public void onBindViewHolder(@NonNull MyAdapterView holder, int position) {
        holder.textname.setText(data1[position]);
        holder.textdesc.setText(data2[position]);
        holder.textprice.setText(data3[position]);
        holder.RVimage.setImageResource(imgview[position]);

    }



    @Override
    public int getItemCount() {
        return imgview.length;
    }



    public class MyAdapterView extends RecyclerView.ViewHolder{
        TextView textname,textdesc,textprice;
        ImageView RVimage;
        public MyAdapterView(@NonNull View itemView) {
            super(itemView);
            textname=itemView.findViewById(R.id.textviewTitle);
            textdesc=itemView.findViewById(R.id.textviewDesc);
            textprice=itemView.findViewById(R.id.textviewPrice);
            RVimage=itemView.findViewById(R.id.rvimageview);


        }
    }
}
