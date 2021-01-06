package com.nomitech.viewsimplementation;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class gridimplement extends BaseAdapter
{
    private final String names[];
    private  final int images[];
    Context context;
    @Override
    public int getCount() {
        return 0;
    }

    public gridimplement(String[] names, int[] images, Context context) {
        this.names = names;
        this.images = images;
        this.context = context;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.singleframe,null);

        ImageView imageView=(ImageView)view.findViewById(R.id.image);
        TextView textView=(TextView)view.findViewById(R.id.text);
imageView.setImageResource(images[position]);
textView.setText(names[position]);


        return view;
    }
}
