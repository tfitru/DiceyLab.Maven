import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Simulation {
    Dice dice = new Dice();
    Bins bins = new Bins(2, 12);
    Integer bin2 = 0;
    Integer bin3 = 0;
    Integer bin4 = 0;
    Integer bin5 = 0;
    Integer bin6 = 0;
    Integer bin7 = 0;
    Integer bin8 = 0;
    Integer bin9 = 0;
    Integer bin10 = 0;
    Integer bin11 = 0;
    Integer bin12 = 0;

    Integer integer;
public Simulation(Integer diceSum, Integer integer){
    this.dice = new Dice(diceSum);
    this.bins = new Bins(2, 12);
    this.integer = integer;

}

public void run() {
        Integer result = 0;
    for(int i = 0; i<this.integer; i++){
        result = dice.tossAndSum();
        bins.addBin(result);
        bins.incremetBin(result);
    }

}

public void printResults(){
    this.bin2 = bins.getBin(2);
    this.bin3 = bins.getBin(3);
    this.bin4 = bins.getBin(4);
    this.bin5 = bins.getBin(5);
    this.bin6 = bins.getBin(6);
    this.bin7 = bins.getBin(7);
    this.bin8 = bins.getBin(8);
    this.bin9 = bins.getBin(9);
    this.bin10 = bins.getBin(10);
    this.bin11 = bins.getBin(11);
    this.bin12 = bins.getBin(12);
    DecimalFormat df = new DecimalFormat("#.####");
    System.out.println("2" + ": " + this.bin2 + "  " + df.format((double)this.bin2/this.integer) + ": " + ammountOfAstriks(this.bin2) + "\n" +
            ("3" + ": " +this.bin3 + "  " + df.format((double)this.bin3/this.integer) + " " + ammountOfAstriks(this.bin3) + "\n" +
                    ("4" + ": " + this.bin4 + "  " + df.format((double)this.bin4/this.integer) + ": " + ammountOfAstriks(this.bin4) + "\n" +
                            ("5" + ": " + this.bin5 + "  " + df.format((double)this.bin5/this.integer) + ": " +ammountOfAstriks(this.bin5) + "\n" +
                                    ("6" + ": " + this.bin6 + "  " + df.format((double)this.bin6/this.integer) + ": " + ammountOfAstriks(this.bin6) + "\n" +
                                            ("7" + ": " + this.bin7 + "  " + df.format((double)this.bin7/this.integer) + ": " + ammountOfAstriks(this.bin7) + "\n" +
                                                    ("8" + ": " +this.bin8 + "  " + df.format((double)this.bin8/this.integer) + ": " + ammountOfAstriks(this.bin8) + "\n" +
                                                            "9" + ": " + this.bin9 + "  " + df.format((double)this.bin9/this.integer) + ": " + ammountOfAstriks(this.bin9) + "\n" +
                                                            "10" + ": " + this.bin10 + "  " + df.format((double)this.bin10/this.integer) + ": " + ammountOfAstriks(this.bin10) + "\n" +
                                                            ("11" + ": " + this.bin11 + "  " + df.format((double)this.bin11/this.integer) + ": " +ammountOfAstriks(this.bin11) + "\n" +
                                                                    "12" + ": " + this.bin12 + "  " + df.format((double)this.bin12/this.integer) + ": " + ammountOfAstriks(this.bin12)))))))));
}

public String ammountOfAstriks(Integer integer){
    StringBuilder str = new StringBuilder();
    for(int i = 0; i<integer; i++){
        if(i==10) {
            break;
        }
        str.append("*");
    }



    return String.valueOf(str);

}

}
