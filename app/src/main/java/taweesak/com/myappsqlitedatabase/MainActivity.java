package taweesak.com.myappsqlitedatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import taweesak.com.myappsqlitedatabase.Adapter.MyAdapter;
import taweesak.com.myappsqlitedatabase.MyData.MyModel;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    MyAdapter adapter;
    ArrayList<MyModel> myModels=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //recycler
        rv= (RecyclerView) findViewById(R.id.myRecyclerView);

        //SET ITS PROPS
        rv.setLayoutManager(new LinearLayoutManager(this));

        //ADAPTER
        adapter=new MyAdapter(this,myModels);

        rv.setAdapter(adapter);
    }
}
