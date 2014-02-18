package org.bremsstrahlung.goml;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class MainActivity extends Activity implements Engine, Renderer {
    private static final String TAG = MainActivity.class.getSimpleName();

    Screen screen = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onResume() {
        Log.d(TAG, "onResume");
    }

    @Override
    public void onPause() {
        Log.d(TAG, "onPause");
    }

    @Override
    public Screen getStartScreen() {
        Log.d(TAG, "getStartScreen");

        return new LoadingScreen(this);
    }

    @Override
    public Screen getCurrentScreen() {
        return screen;
    }

    @Override
    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    @Override
    public Renderer getRenderer() {
        return this;
    }

    @Override
    public void onSurfaceCreated(GL10 gl10, EGLConfig eglConfig) {
        Log.d(TAG, "onSurfaceCreated");
    }

    @Override
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        Log.d(TAG, "onSurfaceChanged");
    }

    @Override
    public void onDrawFrame(GL10 gl10) {

    }
}
