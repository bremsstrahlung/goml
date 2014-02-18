package org.bremsstrahlung.goml;

/**
 * Created by wilco on 2/17/14.
 */
public interface Engine {
    public Screen getStartScreen();
    public Screen getCurrentScreen();
    public void setScreen(Screen screen);

    public Renderer getRenderer();
}
