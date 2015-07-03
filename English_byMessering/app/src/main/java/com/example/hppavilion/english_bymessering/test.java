package com.example.hppavilion.english_bymessering;

import android.app.ListActivity;


/**
 * Created by HP PAVILION on 04.07.2015.
 */
public class test extends ListActivity{
    protected void on() {
        String[] lessons = new String[]{"lesson 1", "lesson 2", "lesson 3",
                "lesson 4", "lesson 5", "lesson 6", "lesson 7", "lesson 8", "lesson 9",
                "lesson 10", "lesson 11", "lesson 12", "lesson 13", "lesson 14", "lesson 15"};
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(getListView().getContext(), R.layout.activity_learnwords,lessons);
        //getListView().setAdapter(adapter);
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
        //  android.R.layout.simple_list_item_1, lessons);
        // setListAdapter(adapter);
        setListAdapter(new MyAdapter(this, lessons));
    }
}
