import strategy.*;

public class App {
    public static void main(String[] args) throws Exception {
        Behavior normal = new NormalBehavior();
        Behavior defense = new DefenseBehavior();

        Robo robo = new Robo();
        robo.setStrategy(normal);

        robo.mover();

        robo.setStrategy(defense);

        robo.mover();
    }
}
