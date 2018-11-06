package taweesak.com.myappsqlitedatabase.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import taweesak.com.myappsqlitedatabase.MyData.MyModel;
import taweesak.com.myappsqlitedatabase.R;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder>{

    Context mContext;
    ArrayList<MyModel> myModels;

    public MyAdapter(Context mContext, ArrayList<MyModel> myModels) {
        this.mContext = mContext;
        this.myModels = myModels;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //VIEW OBJ FROM XML
        View v= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_list_item,null);
        //holder
        MyViewHolder holder=new MyViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        myViewHolder.tv_title.setText(" Demo");

    }

    @Override
    public int getItemCount() {
        //return myModels.size();
        return 10;
    }
}
