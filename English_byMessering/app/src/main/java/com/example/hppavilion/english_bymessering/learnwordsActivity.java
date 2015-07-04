package com.example.hppavilion.english_bymessering;

import android.app.ActionBar;
import android.app.ListActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class learnwordsActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     // setContentView(R.layout.activity_learnwords);

        String[] lessons = new String[] { "lesson 1", "lesson 2", "lesson 3",
                "lesson 4", "lesson 5", "lesson 6", "lesson 7", "lesson 8", "lesson 9",
                "lesson 10", "lesson 11", "lesson 12", "lesson 13", "lesson 14", "lesson 15" };
       //ArrayAdapter<String> adapter = new ArrayAdapter<String>(getListView().getContext(), R.layout.activity_learnwords,lessons);
        //getListView().setAdapter(adapter);
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
              //  android.R.layout.simple_list_item_1, lessons);
       // setListAdapter(adapter);
        setListAdapter(new MyAdapter(this, lessons));


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_learnwords, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
