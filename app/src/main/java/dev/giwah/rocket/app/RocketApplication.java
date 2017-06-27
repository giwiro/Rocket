package dev.giwah.rocket.app;

import android.app.Application;
import android.content.res.Configuration;

/**
 * Created by giwiro on 6/26/17.
 *
 * tutorial: https://github.com/codepath/android_guides/wiki/Understanding-the-Android-Application-Class
 * ex: Inicializar objeto contenedor de la base de datos
 */

public class RocketApplication extends Application {
    // Called when the application is starting, before any other application objects have been created.
    // Overriding this method is totally optional!
    @Override
    public void onCreate() {
        super.onCreate();
        // Required initialization logic here!
    }

    // Called by the system when the device configuration changes while your component is running.
    // Overriding this method is totally optional!
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    // This is called when the overall system is running low on memory,
    // and would like actively running processes to tighten their belts.
    // Overriding this method is totally optional!
    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }
}
