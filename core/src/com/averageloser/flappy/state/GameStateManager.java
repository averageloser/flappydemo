package com.averageloser.flappy.state;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;

/**
 * Created by tj on 3/23/2016.
 */
public class GameStateManager {
    private Stack<State> states;

    public GameStateManager() {
        states = new Stack();
    }

    public void push(State state) {
        states.push(state);
    }

    public void pop() {
        states.pop();
    }

    //Set a state by poping one off the stack and pushing on in its place.
    public void set(State state) {
        states.pop();
        states.push(state);
    }

    public void update(float dt) {
        states.peek().update(dt);
    }

    public void render(SpriteBatch sb) {
        states.peek().render(sb);
    }
}
