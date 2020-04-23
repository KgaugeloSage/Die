import java.util.ArrayList;

/**
 *
 */
public class DiceFactory implements SuperClass {
    private static ArrayList<Integer> values ;
    private static int sides;

    /**
     *
     * @param sides
     */
    DiceFactory(int sides) {
        values = new ArrayList<>();
        this.sides = sides;
    }

    @Override
    public void makeDie() {
        for (int i = 1; i <= sides; ++i) {
            values.add(i);
        }
        System.out.println("Die : " + values);
    }
}
