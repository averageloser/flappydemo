package com.averageloser.flappy.sprites;

import com.averageloser.flappy.FlappyDemo;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by tj on 3/25/2016.
 */
public class Bird {
    private Vector2 position;
    private Vector2 velocity;
    private Texture texture;
    private static final int GRAVITY = -15;

    public Bird(int x, int y) {
        position = (new Vector2(x, y));

        velocity = new Vector2(0,0);

        texture = new Texture("bird.png");
    }

    public void update(float dt) {
        if (position.y > 0) {
            velocity.add(0, GRAVITY);
        }
        velocity.scl(dt);

        position.add(0, velocity.y);

        velocity.scl(1 / dt);

        if (position.y > (FlappyDemo.HEIGHT / 2) - texture.getHeight()) {
            position.y = (FlappyDemo.HEIGHT / 2) - texture.getHeight();
        }

        if (position.y < 0) {
            position.y = 0;
        }
    }

    public Vector2 getPosition() {
        return position;
    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }


    public Texture getTexture() {
        return texture;
    }

    public void setTexture(Texture texture) {
        this.texture = texture;
    }

    public void jump() {
        velocity.y = 250;
    }

    public void dispose() {
        texture.dispose();
    }
}
