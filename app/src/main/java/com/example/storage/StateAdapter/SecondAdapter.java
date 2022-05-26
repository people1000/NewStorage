package com.example.storage.StateAdapter;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.storage.Database.DatabaseAdapter;
import com.example.storage.Database.DatabaseHelper;
import com.example.storage.R;

import java.util.List;

public class SecondAdapter extends ArrayAdapter<Post_inSecondAdapter> {

    private LayoutInflater inflater;
    private int layout;
    private List<Post_inSecondAdapter> posts;

    public SecondAdapter(Context context, int resource, List<Post_inSecondAdapter> posts) {
        super(context, resource, posts);
        this.posts = posts;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }
    public View getView(int position, View convertView, ViewGroup parent) {

        View view=inflater.inflate(this.layout, parent, false);

        ImageView imgView = view.findViewById(R.id.img);
        TextView nameView = view.findViewById(R.id.name);
        TextView dateView = view.findViewById(R.id.date);

        Post_inSecondAdapter post = posts.get(position);

//        imgView.setImageResource(post.getImg());
        nameView.setText(post.getName());
        dateView.setText(post.getDate());

        return view;
    }
}
