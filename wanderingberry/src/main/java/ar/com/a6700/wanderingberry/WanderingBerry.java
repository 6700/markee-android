package ar.com.a6700.wanderingberry;

import android.util.Log;

/**
 * Created by hugo on 18/08/16.
 */
public class WanderingBerry {
    public static String APP_NAME = "Wandering Berry";
    private static String logTag = WanderingBerry.APP_NAME + " log";

    public static void log(String text){
        Log.d(logTag, text);
    }
}
