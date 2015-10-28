package io.keepcoding.twlocator.model;


import twitter4j.GeoLocation;

public class Tweet {


    private long id;

    private String text;

    private double latitude;

    private double longitude;


    public Tweet(long id, String text, GeoLocation location) {
        this.id = id;
        this.text = text;
        this.latitude = location.getLatitude();
        this.longitude = location.getLongitude();
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
