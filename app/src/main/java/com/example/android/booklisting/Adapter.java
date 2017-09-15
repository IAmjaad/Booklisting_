package com.example.android.booklisting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.id.list;
import static android.R.id.title;

/**
 * Created by Amjaad on 9/5/2017.
 */

public class Adapter extends ArrayAdapter<Books> {

    ArrayList<Books> list;
    Context context;

    public Adapter(Context context, ArrayList<Books> list) {

        super(context, 0, list);

        this.context=context;
        this.list = new ArrayList<Books>();
    }
//    public Adapter(ArrayList<Books> list, Context context) {
//        this.list = new ArrayList<Books>();
//        this.context = context;
//    }

    @Override
    public int getCount() {
        return list.size();

    }

    @Override
    public Books getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {



        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.books_info, parent, false);
        }

        Books currentBook = getItem(position);
        TextView title;
        title = listItemView.findViewById(R.id.bookTitle);
        title.setText(currentBook.getTitle());

        TextView author = listItemView.findViewById(R.id.bookAuthor);
        author.setText(currentBook.getAuthors());

return listItemView;

    }
}
