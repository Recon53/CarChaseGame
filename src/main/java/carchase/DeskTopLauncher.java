package carchase;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;


public class DeskTopLauncher {
    public static void main(String[] arg) {
        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
        config.setTitle("Car Chase Game");
        config.setWindowedMode(800, 600); // Width: 800, Height: 600
        config.setForegroundFPS(60);
        config.useVsync(true);

        new Lwjgl3Application(new CarChaseGame(), config);
    }
}