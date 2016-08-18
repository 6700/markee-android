package ar.com.a6700.markee;

import android.os.Bundle;
import android.util.Log;

import ar.com.a6700.wanderingberry.ApplicationActivity;
import ar.com.a6700.wanderingberry.WanderingBerry;

public class MainActivity extends ApplicationActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WanderingBerry.log("Test");
    }
}
