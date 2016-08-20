package ar.com.a6700.wanderingberry;

import android.util.Log;

/**
 * Created by hugo on 18/08/16.
 */
public class WanderingBerry {
    public static final String DEFAULT_ACTION = "show";
    public static String APP_NAME = "Wandering Berry";
    public static final String ACTIVITY_SUFIX = "Controller";
    private static String logTag = WanderingBerry.APP_NAME + " log";
    public static void log(String text){
        Log.d(logTag, text);
    }
}
