package uet.oop.bomberman;

import javafx.scene.image.Image;


public class Balloom extends Enemy {

    protected int _animate = 0;

    public Balloom(int x, int y, Image img) {
        super(x, y, img, 1.0,100);
        this._ai = new AILow();

    }


    @Override
    protected void chooseSprite() {
        switch(_direction) {
            case 1:
                img = Sprite.balloom_right1.getFxImage();
                if(_moving) {
                    img = Sprite.movingSprite(Sprite.balloom_right1.getFxImage(), Sprite.balloom_right2.getFxImage(), _animate, 20);
                }
                break;
            case 3:
                img = Sprite.balloom_left1.getFxImage();
                if(_moving) {
                    img = Sprite.movingSprite(Sprite.balloom_left1.getFxImage(), Sprite.balloom_left2.getFxImage(), _animate, 20);
                }
                break;
            default:
                img = Sprite.balloom_right1.getFxImage();
                if(_moving) {
                    img = Sprite.movingSprite(Sprite.balloom_right1.getFxImage(), Sprite.balloom_right2.getFxImage(), _animate, 20);
                }
                break;
        }
    }





    //dùng để cho vào hàm chọn hình ảnh
    public void animate() {
        if (_animate > 6000) _animate = 0;
        else _animate++;
    }



    @Override
    public void kill() {
        this._alive = false;
        img = Sprite.balloom_dead.getFxImage();
        if (timedead < 0) timedead = 40;
        else timedead--;

    }

    @Override
    protected void afterKill() {
        BombermanGame.entities.remove(this);
    }


}
