package com.example.dschi.myapp1;

import android.widget.TextView;

/**
 * Created by Blake on 11/6/2016.
 */

public class ViewHolder {
    public TextView text;

    // Constructor
    public ViewHolder(TextView text) {
        this.text = text;
    }

    public TextView getText() {
        return text;
    }

    public void setText(TextView text) {
        this.text = text;
    }

}