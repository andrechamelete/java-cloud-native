package strategy;

public class Robo {
    
    private Behavior behavior;

    public void setStrategy(Behavior behavior) {
        this.behavior = behavior;
    }

    public void mover() {
        behavior.mover();
    }
}
