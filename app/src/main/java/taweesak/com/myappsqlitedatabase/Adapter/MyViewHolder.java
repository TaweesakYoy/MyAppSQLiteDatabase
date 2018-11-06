package taweesak.com.myappsqlitedatabase.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import taweesak.com.myappsqlitedatabase.R;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView tv_noti,tv_title,tv_content,tv_month,tv_day,tv_hour,tv_minute;


    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        tv_noti = itemView.findViewById(R.id.tv_noti);
        tv_title = itemView.findViewById(R.id.tv_title);
        tv_content = itemView.findViewById(R.id.tv_content);
        tv_month = itemView.findViewById(R.id.tv_month);
        tv_day = itemView.findViewById(R.id.tv_day);
        tv_hour = itemView.findViewById(R.id.tv_hour);
        tv_minute = itemView.findViewById(R.id.tv_minute);
    }
}
