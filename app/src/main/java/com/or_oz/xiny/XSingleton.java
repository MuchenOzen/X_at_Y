package com.or_oz.xiny;

import android.location.Location;
import android.support.v4.util.SimpleArrayMap;

/**
 * Created by Michael on 1/23/2016.
 */
public class XSingleton {
    private static XSingleton ourInstance = new XSingleton();
    private SimpleArrayMap<Location, XItem> map;

    public static XSingleton getInstance() {
        return ourInstance;
    }

    private XSingleton() {
        map = new SimpleArrayMap<Location, XItem>();
    }

    public void addItem(String name, String comments, double x, double y) {

    }

    private class XItem {
        String name;
        String comments;

        double latitude, longitude;

    }
}
