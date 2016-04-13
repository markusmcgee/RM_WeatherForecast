package com.pnpc.rmd;

import android.app.ActionBar;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.pnpc.rmd.model.DataVO;
import com.pnpc.rmd.model.WeatherVO;

/**
 * Created by markusmcgee on 4/12/16.
 */
public class WeatherForecastRecyclerAdapter extends RecyclerView.Adapter<WeatherForecastRecyclerAdapter.ViewHolder> {

    private WeatherVO data;

    public WeatherForecastRecyclerAdapter(WeatherVO data) {
        this.data = data;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView dayOfWeekText;
        public TextView forecastText;
        public TextView temperatureText;
        public ViewHolder(View v) {
            super(v);
            dayOfWeekText = (TextView) v.findViewById(R.id.day_of_week);
            forecastText = (TextView) v.findViewById(R.id.forecast);
            temperatureText = (TextView) v.findViewById(R.id.temperature);
        }
    }

    protected void setData(WeatherVO data){
        this.data = data;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.weather_forecast_view, parent, false);
        RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) view.getLayoutParams();

        view.getLayoutParams().width = parent.getWidth();
        view.getLayoutParams().height = parent.getHeight();

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.dayOfWeekText.setText(data.getTime().getStartPeriodName().get(position).toString());
        holder.forecastText.setText(data.getData().getWeather().get(position).toString());
        holder.temperatureText.setText(data.getData().getTemperature().get(position).toString());
    }


    @Override
    public int getItemCount() {
        return data.getData().getWeather().size();
    }
}
