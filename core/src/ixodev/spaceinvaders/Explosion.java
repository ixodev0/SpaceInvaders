package ixodev.spaceinvaders;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import static ixodev.spaceinvaders.Constants.*;

public class Explosion {

    Texture texture;
    private int timer;
    private boolean end;


    public Explosion(int x, int y) {
        texture = new Texture(Gdx.files.internal(EXPLOSION_TEXTURE));
        timer = 0;
        end = false;
    }

    public void update() {
        timer++;

        if(timer >= EXPLOSION_MAX_TIMER) {
            end = true;
        }
    }

    public int getTimer() {
        return timer;
    }

    public void dispose() {
        texture.dispose();
    }
}
