package com.or_oz.xiny;

import android.location.Location;

/**
 * Created by Michael on 1/23/2016.
 */
public class XSingleton {
    private static XSingleton ourInstance = new XSingleton();

    public static XSingleton getInstance() {
        return ourInstance;
    }

    private XSingleton() {
    }

    public void addItem(String name, String comments, Location l) {

    }

    private class XItem {

    }
}
