package com.nomitech.viewsimplementation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class avfCustomAdapter extends BaseAdapter  {
    Context context;
    int[] images;
    String[] names;
    LayoutInflater inflter;

    public avfCustomAdapter(Context Applicationcontext, int[] images, String[] names) {
        this.context=Applicationcontext;
        this.images=images;
        this.names=names;
        inflter=(LayoutInflater.from(Applicationcontext));

    }

    @Override
    public int getCount() {
        return names.length;
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
    public View getView(int position, View view, ViewGroup parent) {

        view=inflter.inflate(R.layout.avflist_item, null);

        TextView textView=(TextView) view.findViewById(R.id.names);
        ImageView imageView=(ImageView) view.findViewById(R.id.images);

        textView.setText(names[position]);
        imageView.setImageResource(images[position]);


        return view;
    }
}
