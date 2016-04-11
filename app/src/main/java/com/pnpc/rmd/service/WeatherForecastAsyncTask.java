package com.pnpc.rmd.service;

import android.os.AsyncTask;

import com.pnpc.rmd.model.WeatherVO;

import java.net.URL;

/**
 * Created by markusmcgee on 4/11/16.
 */
public class WeatherForecastAsyncTask extends AsyncTask<URL, Void, WeatherVO> {

    @Override
    protected void onCancelled() {
        super.onCancelled();
    }

    @Override
    protected void onPostExecute(WeatherVO weatherVO) {
        super.onPostExecute(weatherVO);
    }

    @Override
    protected WeatherVO doInBackground(URL... params) {
        return null;
    }
}
