package strategy;

public class DefenseBehavior implements Behavior {
    
    @Override
    public void mover() {
        System.out.println("mover-se defensivamente");
    }
}
