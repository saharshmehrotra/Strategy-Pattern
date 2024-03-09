/*
Saharsh Mehrotra
22070126093
AIML B1
*/
public class Main {
  public static void main(String[] args) {
    MallardDuck mallardDuck = new MallardDuck();
    RedheadDuck redheadDuck = new RedheadDuck();
    RubberDuck rubberDuck = new RubberDuck();
    DecoyDuck decoyDuck = new DecoyDuck();

    mallardDuck.display();
    mallardDuck.performFly();
    mallardDuck.performQuack();

    redheadDuck.display();
    redheadDuck.performFly();
    redheadDuck.performQuack();

    rubberDuck.display();
    rubberDuck.performFly();
    rubberDuck.performQuack();

    decoyDuck.display();
    decoyDuck.performFly();
    decoyDuck.performQuack();
  }
}