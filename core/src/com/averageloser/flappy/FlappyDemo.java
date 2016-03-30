package com.averageloser.flappy;

import com.averageloser.flappy.state.GameStateManager;
import com.averageloser.flappy.state.MenuState;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class FlappyDemo extends ApplicationAdapter {
    public static final int WIDTH = 480;
    public static final int HEIGHT = 800;
    public static final String TITLE = "Flappy Bird";

    private SpriteBatch batch;

    private GameStateManager gsm;

    @Override
    public void create() {
        batch = new SpriteBatch();

        gsm = new GameStateManager();
        //push the menu state to the gsm stack to be shown first.
        gsm.push(new MenuState(gsm));
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        //Game rendering goes here.
        gsm.update(Gdx.graphics.getDeltaTime());
        gsm.render(batch);
    }
}
