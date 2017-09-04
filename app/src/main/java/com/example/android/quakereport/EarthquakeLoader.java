package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

import java.util.List;

/**
 * {@link EarthquakeLoader} is a simple {@link AsyncTaskLoader} that fetches a list of earthquakes
 * from the USGS earthquake API
 */

class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {

    private static final String LOG_TAG = "EarthquakeLoader";
    /** Query url for USGS earthquake api */
    private String mUrl;

    /**
     * Create a new EarthquakeLoader
     * @param context calling context with {@link android.app.LoaderManager.LoaderCallbacks}
     *                implementation
     * @param url query address for USGS earthquake API
     */
    public EarthquakeLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    /**
     * This is on a background thread
     * @return List of earthquakes resulting from api query
     */
    @Override
    public List<Earthquake> loadInBackground() {
        Log.i(LOG_TAG, "TEST:loadInBackground() called....");
        // if mUrl is empty, return early
        if (mUrl == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of earthquakes.
        List<Earthquake> earthquakes = QueryUtils.fetchEarthQuakeData(mUrl);
        return earthquakes;
    }

    @Override
    protected void onStartLoading() {
        Log.i(LOG_TAG, "TEST:onStartLoading() called....");
        forceLoad();
    }
}
