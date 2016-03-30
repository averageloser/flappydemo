package com.averageloser.flappy.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

import java.util.Random;

/**
 * Created by tj on 3/26/2016.
 */
public class Tube {
    private Texture topTube;
    private Texture bottomTube;;
    private Vector2 posTopTube;
    private Vector2 posBottomTube;
    private Random rand;

    private final static int FLUCTUATION = 130, TUBE_GAP = 100, LOWEST_OPENING = 120;

    public Tube(float x) {
        setTopTube(new Texture("toptube.png"));

        setBottomTube(new Texture("bottomtube.png"));

        rand = new Random();

        reposition(x);
    }

    public Vector2 getPosTopTube() {
        return posTopTube;
    }

    public Vector2 getPosBottomTube() {
        return posBottomTube;
    }

    public Texture getTopTube() {
        return topTube;
    }

    public void setTopTube(Texture topTube) {
        this.topTube = topTube;
    }

    public Texture getBottomTube() {
        return bottomTube;
    }

    public void setBottomTube(Texture bottomTube) {
        this.bottomTube = bottomTube;
    }

    public void reposition(float x) {
        posTopTube = new Vector2(x, rand.nextInt(FLUCTUATION) + TUBE_GAP + LOWEST_OPENING);

        posBottomTube = new Vector2(x, posTopTube.y - TUBE_GAP - bottomTube.getHeight());
    }
}
