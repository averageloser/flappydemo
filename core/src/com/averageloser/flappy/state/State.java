package com.averageloser.flappy.state;

import com.averageloser.flappy.FlappyDemo;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by tj on 3/23/2016.
 */
public abstract class State {

    protected OrthographicCamera cam;
    protected Vector2 mouse;
    protected GameStateManager gsm;

    protected State(GameStateManager gsm) {
        cam = new OrthographicCamera();
        cam.setToOrtho(false, FlappyDemo.WIDTH / 2, FlappyDemo.HEIGHT / 2);

        mouse = new Vector2();

        this.gsm = gsm;
    }

    public abstract void handleInput();

    public abstract void update(float dt);

    public abstract void render(SpriteBatch sb);

    public abstract void dispose();
}
