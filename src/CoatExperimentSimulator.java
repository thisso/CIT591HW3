

public class CoatExperimentSimulator {

    private int numberOfPeople;

    public CoatExperimentSimulator(int numPpl) {
        numberOfPeople = numPpl;
    }

    public int numPplWhoGotTheirCoat(int[] permutation) {


        int peopleWhoGotCoats = 0;

        for(int i = 0; i<numberOfPeople; i++){
            if(permutation[i]==i+1){
                peopleWhoGotCoats++;
            }
        }

        return peopleWhoGotCoats;
    }



    public int[] simulateCoatExperiment(int iterations) {
        return null;
    }

    public double answerToQuestionOne(int[] results) {
        return 0.0;
    }

    public double answerToQuestionTwo(int[] results) {
        return 0.0;
    }

    public static void main(String[] args) {
        // Create an instance of CoatExperimentSimulator
        CoatExperimentSimulator simulator = new CoatExperimentSimulator(20);  // 10 people

        for (int i = 0; i < 20; i++) {
            int[] dummyPermutation = new int[20];  // This won't be used, but we need to pass it
            int result = simulator.numPplWhoGotTheirCoat(dummyPermutation);
            System.out.println("Test " + (i+1) + ": Number of people who got their coat: " + result);
        }
    }
}



