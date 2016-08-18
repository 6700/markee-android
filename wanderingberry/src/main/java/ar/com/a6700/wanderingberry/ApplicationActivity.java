package ar.com.a6700.wanderingberry;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.logging.Logger;

/**
 * Created by hugo on 18/08/16.
 */
public class ApplicationActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WanderingBerry.log("Test");
    }
}
