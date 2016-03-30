package com.averageloser.flappy.state;

import com.averageloser.flappy.sprites.Bird;
import com.averageloser.flappy.sprites.Tube;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by tj on 3/24/2016.
 */
public class PlayState extends State {
    private Bird bird;
    private Texture bg;
    private Tube topTube, bottomTube;

    protected PlayState(GameStateManager gsm) {
        super(gsm);

        bird = new Bird(50,100);

        bg = new Texture("bg.png");

        topTube = new Tube(150);

        bottomTube = new Tube(150);
    }

    @Override
    public void handleInput() {
        if (Gdx.input.justTouched()) {
            bird.jump();
        }
    }

    @Override
    public void update(float dt) {
        handleInput();

        bird.update(dt);
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.setProjectionMatrix(cam.combined);
        sb.draw(bg, cam.position.x - (cam.viewportWidth / 2), cam.position.y - (cam.viewportHeight / 2));
        sb.draw(topTube.getTopTube(), topTube.getPosTopTube().x, topTube.getPosTopTube().y);
        sb.draw(bottomTube.getBottomTube(), bottomTube.getPosBottomTube().x, bottomTube.getPosBottomTube().y);
        sb.draw(bird.getTexture(), bird.getPosition().x, bird.getPosition().y);
        sb.end();
    }

    @Override
    public void dispose() {
        bird.dispose();
    }
}
