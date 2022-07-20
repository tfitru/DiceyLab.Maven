import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class DiceTest {


    @Test
    public void tossAndSumTest() {
        Random rand = new Random(2);
        Integer expectedInt = rand.nextInt();
        Dice dice = new Dice(expectedInt);

        Integer actualSum = dice.tossAndSum();

        Assert.assertEquals(expectedInt, actualSum);

    }




}
