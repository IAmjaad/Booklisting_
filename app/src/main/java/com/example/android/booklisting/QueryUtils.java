package com.example.android.booklisting;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Amjaad on 9/9/2017.
 */

public final class QueryUtils {

    private QueryUtils() {
    }

    public static ArrayList<Books> extractBooksInfo(String jsonResponse) {

        ArrayList<Books> books = new ArrayList<>();


        try {

            JSONObject JsonResponse = new JSONObject(jsonResponse);
            JSONArray booksArray = JsonResponse.getJSONArray("items");

            for (int i=0; i< booksArray.length(); i++){
                JSONObject currentBook = booksArray.getJSONObject(i);
                JSONObject volumeInfo = currentBook.getJSONObject("volumeInfo");
                String title = volumeInfo.getString("title");
                String authors = volumeInfo.getString("authors");

                Books book = new Books(title,authors);
                books.add(book);
            }


        } catch (JSONException e) {

            Log.e("QueryUtils", "Problem parsing the books JSON results", e);
        }

        return books;
    }

}

