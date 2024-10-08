public class CoatExperimentSimulator {

    private int numberOfPeople;

    public CoatExperimentSimulator(int numPpl) {
        numberOfPeople = numPpl;
    }

    public int numPplWhoGotTheirCoat(int[] permutation) {
        int count = 0;
        for (int i = 0; i < permutation.length; i++) {
            if (permutation[i] == i + 1) {
                count=count+1;
            }
        }
        return count;
    }

    public int[] simulateCoatExperiment(int iterations) {
        int[] results = new int[iterations];
        for (int i = 0; i < iterations; i++) {
            int[] perm = RandomOrderGenerator.getRandomOrder(numberOfPeople);
            results[i] = numPplWhoGotTheirCoat(perm);
        }
        return results;
    }

    public double answerToQuestionOne(int[] results) {
        int zeroCount = 0;
        for (int i = 0; i < results.length; i++) {
            if (results[i] == 0) {
                zeroCount++;
            }
        }
        return (double) zeroCount / results.length;
    }

    public double answerToQuestionTwo(int[] results) {
        int sum = 0;
        for (int i = 0; i < results.length; i++) {
            sum += results[i];
        }
        return (double) sum / results.length;
    }

    public static void main(String[] args) {

        int numberOfPeople = 100;
        int iterations = 100000;


        CoatExperimentSimulator simulator = new CoatExperimentSimulator(numberOfPeople);

        // Run simulation
        int[] results = simulator.simulateCoatExperiment(iterations);

        // results
        double probabilityZero = simulator.answerToQuestionOne(results);
        double averageReturned = simulator.answerToQuestionTwo(results);

        System.out.println("Coat Experiment Simulation Results:");
        System.out.println("Number of people: " + numberOfPeople);
        System.out.println("Number of iterations: " + iterations);
        System.out.println("Probability of 0 people getting their coats: " + probabilityZero);
        System.out.println("Average number of people who got their coats: " + averageReturned);
        System.out.println(results.length);


    }
}