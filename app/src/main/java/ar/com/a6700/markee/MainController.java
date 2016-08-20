package ar.com.a6700.markee;

import ar.com.a6700.wanderingcherry.WanderingController;
import ar.com.a6700.wanderingcherry.WanderingCherry;

public class MainController extends WanderingController {

    public void show() {
        WanderingCherry.log("test");
        redirectTo("contact", "show");
    }
}
