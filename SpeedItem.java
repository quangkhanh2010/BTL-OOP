package uet.oop.bomberman;

import javafx.scene.image.Image;
import uet.oop.bomberman.Item;

import java.awt.*;

public class SpeedItem extends Item {
    public SpeedItem(int x, int y, Image img) {
        this.x = x;
        this.y = y;
        this.img = img;
        this.rectangle = new Rectangle(x ,y , (int) img.getWidth(), (int) img.getHeight());
    }

    @Override
    public boolean collision(Rectangle rec) {
        return super.collision(rec);
    }

    @Override
    public void afterCollision() {
        super.afterCollision();
    }

    @Override
    public void update() {

    }
}
