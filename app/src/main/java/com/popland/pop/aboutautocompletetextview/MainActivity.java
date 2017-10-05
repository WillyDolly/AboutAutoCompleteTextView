package com.popland.pop.aboutautocompletetextview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<suggestion> arrlSugg;
    ArrayList<String> arrlten;
    AutoCompleteTextView actv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrlSugg = new ArrayList<>();
        arrlten = new ArrayList<>();
        actv = (AutoCompleteTextView)findViewById(R.id.actv);

        arrlSugg.add(new suggestion(R.mipmap.ic_launcher,"banana"));
        arrlSugg.add(new suggestion(R.mipmap.ic_launcher,"baloon"));
        arrlSugg.add(new suggestion(R.mipmap.ic_launcher,"Bamboo"));
        arrlSugg.add(new suggestion(R.mipmap.ic_launcher, "Lemon"));
        arrlSugg.add(new suggestion(R.mipmap.ic_launcher, "Monkey"));
        arrlSugg.add(new suggestion(R.mipmap.ic_launcher, "Lion"));
      //  CustomListAdapterr listAdapter = new CustomListAdapterr(this,R.layout.custom_search,arrlSugg);
        for(int i=0;i<arrlSugg.size();i++){
            arrlten.add(arrlSugg.get(i).ten);
        }
        actv.setAdapter(new ArrayAdapter(this,R.layout.search_suggestion,arrlten));
    }

}
