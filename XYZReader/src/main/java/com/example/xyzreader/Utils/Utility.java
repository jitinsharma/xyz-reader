package com.example.xyzreader.Utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by jitin on 04-01-2016.
 */
public class Utility {

    public static boolean isNetworkStatusAvailable(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager != null)
        {
            NetworkInfo netInfo = connectivityManager.getActiveNetworkInfo();
            if(netInfo != null)
                if(netInfo.isConnected())
                    return true;
        }
        return false;
    }
}
