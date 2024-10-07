import java.util.Random;

public class Needle {

    private Random generator;
    public Needle() {
        generator = new Random();
    }

    public double runExperiment(int totalDrops) {

        int hits = 0;
        for (int i =0;i<=totalDrops;i++){
            double y_low = generator.nextDouble()*2;
            double alpha = generator.nextDouble()*Math.PI;
            double y_high = y_low +Math.sin(alpha);

            if (y_high>= 2){
                hits=hits+1;
            }
        }


        return (double) totalDrops/hits;
    }

    /*public static void main(String[] args){
        Needle needle = new Needle();
        int totalDrops = 10000000;

        double result = needle.runExperiment(totalDrops);
        System.out.println(result);

    }*/
}

