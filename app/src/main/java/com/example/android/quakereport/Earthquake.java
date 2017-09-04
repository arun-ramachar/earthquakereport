package com.example.android.quakereport;

/**
 * Represents an earthquake event
 * Created by bergs on 11/16/2016.
 */

public class Earthquake {

    /* Magnitude of the earthquake */
    private double mMagnitude;

    /* City nearest epicenter of earthquake */
    private String mLocation;

    /* unix time of the earthquake (in milliseconds)*/
    private long mTimeInMilliseconds;

    /* url for webpage with details about earthquake */
    private String mUrl;


    /**
     * Create a new com.example.android.quakereport.Earthquake object
     *
     * @param magnitude the magnitude of the earthquake
     * @param location the city nearest to the epicenter of the earthquake
     * @param time the time of the earthquake in milliseconds since epoch
     * @param url web address of USGA.gov site for this earthquake
     */
    public Earthquake(double magnitude, String location, long time, String url) {
        this.mMagnitude = magnitude;
        this.mLocation = location;
        this.mTimeInMilliseconds = time;
        this.mUrl = url;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getUrl() { return mUrl; }
}
