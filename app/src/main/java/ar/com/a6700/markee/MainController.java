package ar.com.a6700.markee;

import ar.com.a6700.wanderingberry.WanderingController;
import ar.com.a6700.wanderingberry.WanderingBerry;

public class MainController extends WanderingController {

    public void show() {
        WanderingBerry.log("test");
        redirectTo("contact", "show");
    }
}
