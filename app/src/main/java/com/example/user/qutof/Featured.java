package com.example.user.qutof;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.bartoszlipinski.recyclerviewheader.RecyclerViewHeader;
import com.example.user.qutof.Adapters.RecyclerViewAdapter;
import com.example.user.qutof.Pojos.RecyclerPojo;
import com.example.user.qutof.Recycler.RecyclerDecorations;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by USER on 09-01-16.
 */
public class Featured extends Activity {

    private GridLayoutManager glm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.featured_layout);


        List<RecyclerPojo> rowListItem=getAllItemList();

        glm=new GridLayoutManager(Featured.this,2);
        RecyclerView rv= (RecyclerView) findViewById(R.id.recycler_View);
        rv.addItemDecoration(new RecyclerDecorations(this));
        rv.setHasFixedSize(true);
        rv.setLayoutManager(glm);

        RecyclerViewHeader header= (RecyclerViewHeader) findViewById(R.id.header);
        header.attachTo(rv, true);

        RecyclerViewAdapter rca=new RecyclerViewAdapter(rowListItem, Featured.this);
        rv.setAdapter(rca);

    }

    private List<RecyclerPojo> getAllItemList() {

        List<RecyclerPojo> allItems = new ArrayList<>();
        allItems.add(new RecyclerPojo("ABHAYA FASHION", "Extra 30%", R.drawable.demo2));
        allItems.add(new RecyclerPojo("ABHAYA FASHION", "Extra 30%", R.drawable.demo2));
        allItems.add(new RecyclerPojo("ABHAYA FASHION", "Extra 30%", R.drawable.demo2));
        allItems.add(new RecyclerPojo("ABHAYA FASHION", "Extra 30%", R.drawable.demo2));
        allItems.add(new RecyclerPojo("ABHAYA FASHION", "Extra 30%", R.drawable.demo2));
        allItems.add(new RecyclerPojo("ABHAYA FASHION", "Extra 30%", R.drawable.demo2));
        allItems.add(new RecyclerPojo("ABHAYA FASHION", "Extra 30%", R.drawable.demo2));
        allItems.add(new RecyclerPojo("ABHAYA FASHION", "Extra 30%", R.drawable.demo2));
        return allItems;
    }
}
