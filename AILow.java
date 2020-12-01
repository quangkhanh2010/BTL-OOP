package uet.oop.bomberman;

import uet.oop.bomberman.AI;

public class AILow extends AI {

    @Override
    public int calculateDirection() {
        return random.nextInt(4);
    }

}