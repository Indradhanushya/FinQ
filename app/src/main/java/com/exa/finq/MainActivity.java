package com.exa.finq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;

import com.exa.finq.adapter.StaggeredAdapter;
import com.exa.finq.model.GridItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private StaggeredGridLayoutManager gaggeredGridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_staggered_view);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        gaggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
        recyclerView.setLayoutManager(gaggeredGridLayoutManager);

        List<GridItem> gaggeredList = getListItemData();

        StaggeredAdapter rcAdapter = new StaggeredAdapter(MainActivity.this, gaggeredList);
        recyclerView.setAdapter(rcAdapter);
    }

    @Override
    public void onClick(View view) {

    }

    private List<GridItem> getListItemData() {
        List<GridItem> listViewItems = new ArrayList<GridItem>();
        listViewItems.add(new GridItem("Alkane", R.drawable.slide1));
        listViewItems.add(new GridItem("Ethane", R.drawable.slide2));
        listViewItems.add(new GridItem("Alkyne", R.drawable.slide3));
        listViewItems.add(new GridItem("Benzene", R.drawable.slide1));
        listViewItems.add(new GridItem("Amide", R.drawable.slide2));
        listViewItems.add(new GridItem("Amino Acid", R.drawable.slide3));
        listViewItems.add(new GridItem("Phenol", R.drawable.slide1));
        listViewItems.add(new GridItem("Carbonxylic", R.drawable.slide2));
        listViewItems.add(new GridItem("Nitril", R.drawable.slide3));
        listViewItems.add(new GridItem("Ether", R.drawable.slide1));
        listViewItems.add(new GridItem("Ester", R.drawable.slide2));
        listViewItems.add(new GridItem("Alcohol", R.drawable.slide3));

        return listViewItems;
    }
}
