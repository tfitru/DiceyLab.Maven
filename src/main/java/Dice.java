import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Dice {

    Integer integer;
    Random rand = new Random();
    Integer sum;

    public Dice() {
        this.integer = Integer.MAX_VALUE;
        this.sum = Integer.MAX_VALUE;
    }

    public Dice(Integer integer) {
        this.integer = integer;
    }


    public Integer tossAndSum() {
        if(this.integer==2) {
            Integer sum1 = rand.nextInt(7-1)+1;
            Integer sum2 = rand.nextInt(7-1)+1;
            return this.sum = sum1 + sum2;
        }
        return null;
    }


}






//    public void roll() {
//        value = randomGenerator.nextInt(sides) + 1;
//        history[value-1]++;
//    }
//
//
//    // Gets the value of the die
//    public int getValue() {
//        return value;
//    }
//
//    // Tell us how many sides the die has
//    public int getSides() {
//        return sides;
//    }
//
//    // Reset the history of this die
//    public void restHistory() {
//        history = new int[sides];
//    }
//
//    public int getHistoryVlaue(int side) {
//        if (side >= 1 && side <= this.sides) {
//            return history[side - 1];
//        }
//        throw new IllegalArgumentException("Invalid side: This die doesn't have that side.");
//    }
//
//        public String getHistogram() {
//            StringBuilder builder = new StringBuilder();
//            builder.append(String.format("%s\n%s\n\n", "Histogram of Die", "--------------"));
//
//
//            for(int i =0; i<sides; i++) {
//                builder.append(String.format("%-4d", i+1));
//                builder.append(":");
//
//
//                for(int j = 0; j < history[i]; j++) {
//                    builder.append("*");
//
//                }
//                builder.append("\n");
//            }
//            return builder.toString();
//
//        }



