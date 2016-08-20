package ar.com.a6700.wanderingberry;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Logger;

/**
 * Created by hugo on 18/08/16.
 */
public abstract class WanderingController extends AppCompatActivity {

    public boolean redirectTo(String controller, String action)
    {
        try {
            Class toRedirect = null;
            String controllerName = controller.substring(0, 1).toUpperCase() + controller.substring(1).toLowerCase();
            toRedirect = Class.forName(this.getClass().getPackage().getName() + "." + controllerName + WanderingBerry.ACTIVITY_SUFIX);
            Intent intent = new Intent(this, toRedirect);
            intent.putExtra("controller", controller);
            intent.putExtra("action", action);
            startActivity(intent);
            return true;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        executeAction(getAction());
    }

    public String getAction(){
        if(getParams() != null){
            return getParams().getString("action", "show");
        }
        return WanderingBerry.DEFAULT_ACTION;
    }

    public Bundle getParams()
    {
        Bundle extras = getIntent().getExtras();
        return extras;
    }

    private void executeAction(String action){
        WanderingBerry.log("View '" + getViewId() + "' Loaded");
        setContentView(getViewId());
        try {
            this.getClass().getMethod(action).invoke(this);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
    private int getViewId()
    {
        Resources res = getResources();
        int id = res.getIdentifier(getViewName(), "layout", getApplicationContext().getPackageName());
        return id;
    }

    public void log (String string) {
        WanderingBerry.log(string);
    }

    private String getViewName()
    {
        WanderingBerry.log(getClassName().replace(WanderingBerry.ACTIVITY_SUFIX, "").toLowerCase() + "_" + getAction());
        return getClassName().replace(WanderingBerry.ACTIVITY_SUFIX, "").toLowerCase() + "_" + getAction();
    }

    private String getClassName(){
        return getClass().getSimpleName();
    }
}
