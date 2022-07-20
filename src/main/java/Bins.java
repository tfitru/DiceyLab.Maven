import java.util.ArrayList;
import java.util.List;

public class Bins {
    Integer integer;
    Integer integer1;
    Integer count2,count3,count4,count5,count6,count7,count8,count9,count10,count11,count12;
    List<Integer> sumHold = new ArrayList<>(12);

    public Bins(Integer integer, Integer integer1){
        this.integer = integer;
        this.integer1 = integer1;
        this.count2 = 0;
        this.count3 = 0;
        this.count4 = 0;
        this.count5 = 0;
        this.count6 = 0;
        this.count7 = 0;
        this.count8 = 0;
        this.count9 = 0;
        this.count10 = 0;
        this.count11 = 0;
        this.count12 = 0;
    }

    public void addBin(Integer integer){
        this.sumHold.add(integer);
    }

    public Integer getBin(Integer integer){
        if(integer==2){
            return count2;
        } else if(integer==3){
            return count3;
        } else if (integer==4){
            return count4;
        } else if (integer==5){
            return count5;
        } else if (integer==6){
            return count6;
        } else if (integer==7){
            return count7;
        } else if (integer==8){
            return count8;
        } else if (integer==9){
            return count9;
        } else if (integer==10) {
            return count10;
        } else if (integer==11){
            return count11;
        }else if (integer==12){
            return count12;
        }
        return this.sumHold.get(integer);
    }

    public void incremetBin(Integer integer){
        for(int i = 0; i<this.sumHold.size(); i++){
            if(i<=0){
            switch (integer) {
                case 2:
                    count2++;
                    break;
                case 3:
                    count3++;
                    break;
                case 4:
                    count4++;
                    break;
                case 5:
                    count5++;
                    break;
                case 6:
                    count6++;
                    break;
                case 7:
                    count7++;
                    break;
                case 8:
                    count8++;
                    break;
                case 9:
                    count9++;
                    break;
                case 10:
                    count10++;
                    break;
                case 11:
                    count11++;
                    break;
                case 12:
                    count12++;
                    break;
            }

            } else break;
        }

    }





}
