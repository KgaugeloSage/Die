import java.util.ArrayList;
import java.util.Random;

public class Die {
    private int sides;
    private ArrayList<Integer> values = new ArrayList<>();

    /**
     * @param sides
     */
    Die(int sides) {
        this.sides = sides;
        for (int i = 1; i < sides + 1; ++i) {
            values.add(i);
        }
    }

    /**
     * @param sides
     * @param probabilties
     */
    Die(int sides, int... probabilties) {
        for (int i = 0; i < probabilties.length; ++i) {
            if (probabilties[i] < 0) {
                throw new IllegalArgumentException("negative probabilities not allowed");
            }
        }
        this.sides = sides;
        setProbabilities(probabilties, sides);
    }

    /**
     * @param prbabilities
     * @param sides
     */
    private void setProbabilities(int[] prbabilities, int sides) {
        for (int i = 1; i <= sides; ++i) {
            if (i <= prbabilities.length && prbabilities[i - 1] > 1) {
                for (int j = 0; j < prbabilities[i - 1]; ++j) {
                    values.add(i);
                }
                sides = sides + (prbabilities[i - 1] - 1);
            } else if (i <= prbabilities.length) {
                values.add(i);
            }
        }
        this.sides = sides;
    }

    /**
     *
     */
    public void roll() {
        int bound = sides - 1;
        Random random = new Random();
        int randomIndex = random.nextInt(bound);
        System.out.println(values.get(randomIndex));
    }
}
