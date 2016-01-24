package com.or_oz.xiny;

import android.location.Location;
import android.support.v4.util.SimpleArrayMap;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

/**
 * Created by Michael on 1/23/2016.
 */
public class XSingleton {
    private static XSingleton ourInstance = new XSingleton();

    private ArrayList<XItem> map;

    public static XSingleton getInstance() {
        return ourInstance;
    }

    private XSingleton() {
        map = new ArrayList<XItem>();

    }

    public void addItem(String name, String comments, double latitude, double longitude) {
        map.add(new XItem(name, comments, latitude, longitude));

    }

    public ArrayList<XItem> getItems(){
        return map;
    }

    public class XItem {
        String name;
        String comments;
        BitmapDescriptor icon;
        double latitude, longitude;
        Marker marker;
        int amount;

        public XItem(String name, String comments, double lat, double longi){
            this.name = name;
            this.comments = comments;
            this.latitude = lat;
            this.longitude = longi;
            this.amount = 0;

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

        public MarkerOptions getMarker(){
            return new MarkerOptions()
                    .position(new LatLng(this.latitude, this.longitude))
                    .title(this.name)
                    .snippet(this.comments)
                    .icon(this.icon);
        }

    }
}
