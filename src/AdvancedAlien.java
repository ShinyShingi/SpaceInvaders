import java.util.Random;

public class AdvancedAlien extends Alien {
    AdvancedAlien(int x, int y) {
        super(x, y);
    }
    int getMaxHP() {
        return level + 1;
    }
    int getSpeed() {
        Random rand = new Random();
        int speed = rand.nextInt(6-1)+1;
        return speed;
    }
    int getSpriteSize() {
        return 50;
    }
    String getSprite() {
        return "alien2.gif";
    }
    Direction getDirection(){
        return Direction.DOWN;
    }

}
