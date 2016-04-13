package com.pnpc.rmd;

import android.app.ActionBar;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pnpc.rmd.model.DataVO;
import com.pnpc.rmd.model.WeatherVO;

/**
 * Created by markusmcgee on 4/12/16.
 */
public class WeatherForecastRecyclerAdapter extends RecyclerView.Adapter<WeatherForecastRecyclerAdapter.ViewHolder> {

    private DataVO data;

    public WeatherForecastRecyclerAdapter(DataVO data) {
        this.data = data;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView mTextView;
        public ViewHolder(View v) {
            super(v);
            mTextView = (TextView) v;
        }
    }

    protected void setData(DataVO data){
        this.data = data;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view  = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);
        ViewGroup.LayoutParams params = view.getLayoutParams();

        //Set views size and params and such.

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Log.d("debug", data.getTemperature().get(position).toString());
        holder.mTextView.setText(data.getTemperature().get(position).toString());
    }


    @Override
    public int getItemCount() {
        return data.getWeather().size();
    }
}
