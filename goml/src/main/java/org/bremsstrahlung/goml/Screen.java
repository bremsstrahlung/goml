package org.bremsstrahlung.goml;

/**
 * Created by wilco on 2/17/14.
 */
public abstract class Screen {
    private Engine engine;

    public Screen(Engine engine) {
        this.engine = engine;
    }

    public abstract void onResume();
    public abstract void onPause();
}
