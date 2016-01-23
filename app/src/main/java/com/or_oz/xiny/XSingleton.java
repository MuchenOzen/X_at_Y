package com.or_oz.xiny;

import android.location.Location;
import android.support.v4.util.SimpleArrayMap;

import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

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

    public void addItem(String name, String comments, double latitude, double longitude) {

    }

    private class XItem {
        String name;
        String comments;
        BitmapDescriptor icon;
        double latitude, longitude;

        public XItem(String name, String comments, double lat, double longi){
            this.name = name;
            this.comments = comments;
            this.latitude = lat;
            this.longitude = longi;

            switch(name){
                case "Police":
                    icon = BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN);
                    break;
                case "Food":
                    icon = BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE);
                    break;
                default:
                    icon = BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET);
                    break;
            }
        }

    }
}
