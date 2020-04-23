public class Main {
    public static void main(String[] args) {
        Die dieDodgy6 = new Die(6, 1, 1, 1, 1, 1, 2);
        dieDodgy6.roll();

        // we can create a perfectly fair die like this

        Die dieFair6 = new Die(6, 1, 1, 1, 1, 1, 1);
        dieFair6.roll();

        // this is equivalent to

        Die die6 = new Die(6);
        die6.roll();

        //Dice factory

        SuperClass die20 = new DiceFactory(20);
        die20.makeDie();

        SuperClass anotherDie6 = new DiceFactory(6);
        anotherDie6.makeDie();

    }
}
