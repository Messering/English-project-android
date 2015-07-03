package com.example.hppavilion.english_bymessering;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.*;
import android.widget.Button;



public class MainActivity extends ActionBarActivity {
    private Button learn_words;
    private Button repeat_words;
    private Button dictionary;
    private Button reader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnClickListener lis=new OnClickListener(){
            @Override
            public void onClick(View v) {

                if (v == learn_words){
                    Intent intent = new Intent(MainActivity.this, Learn_wordsActivity.class);
                    startActivity(intent);
                }
                if (v == repeat_words){
                    Intent intent = new Intent(MainActivity.this, Repite_wordsActivity.class);
                    startActivity(intent);
                }
                if (v == dictionary){
                    Intent intent = new Intent(MainActivity.this, DictionaryActivity.class);
                    startActivity(intent);
                }
                if (v == reader){
                    Intent intent = new Intent(MainActivity.this, ReaderActivity.class);
                    startActivity(intent);
                }
            }
        };
        learn_words=(Button) findViewById(R.id.learn_words);
        learn_words.setOnClickListener(lis);
        repeat_words=(Button) findViewById(R.id.repite_words);
        repeat_words.setOnClickListener(lis);
        dictionary=(Button) findViewById(R.id.dictionary);
        dictionary.setOnClickListener(lis);
        reader=(Button) findViewById(R.id.reader);
        reader.setOnClickListener(lis);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
