package com.averageloser.flappy.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.averageloser.flappy.FlappyDemo;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = FlappyDemo.WIDTH;
		config.height = FlappyDemo.HEIGHT;
		config.title = FlappyDemo.TITLE;
		config.foregroundFPS = 60;

		new LwjglApplication(new FlappyDemo(), config);
	}
}
