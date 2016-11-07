package com.example.dschi.myapp1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Blake on 11/6/2016.
 *
 * Purpose: Custom adapter to allow for custom ListView layouts.
 *          Currently only applies rounded_corners drawable as a background to each list item.
 *
 * Used code and examples from:
 *  https://www.javacodegeeks.com/2013/06/android-listview-background-row-style-rounded-corner-alternate-color.html
 *  http://stackoverflow.com/questions/4777272/android-listview-with-different-layouts-for-each-row
 */

public class ToDoAdapter extends ArrayAdapter {

    private ArrayList<String> list;
    private Context context;

    // Constructor
    public ToDoAdapter(Context ctx, int resource,
                       int textViewResourceId, ArrayList<String> objects) {
        super(ctx, resource, textViewResourceId, objects);
        this.list = objects;
        this.context = ctx;
    }

    public int getCount() {
        return list.size();
    }

    public String getItem(int position) {
        return list.get(position);
    }

    public long getItemId(int position) {
        return list.get(position).hashCode();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        // ViewHolder is important for caching and preventing memory leaks.
        // It prevents multiple inflations of the convertView
        String text = list.get(position);

        if (convertView == null) {

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_todo, null);

            TextView textView = (TextView) convertView.findViewById(R.id.task_title);
            viewHolder = new ViewHolder(textView);

            convertView.setTag(viewHolder);

            // Apply rounded_corners as a background to each list item (not the list as a whoel)
            convertView.setBackgroundResource(R.drawable.rounded_corners);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.getText().setText(text);

        return convertView;
    }
}
