public class PositiveInteger {

    private int num;



    public PositiveInteger(int number){
        num = number;
    }


    public boolean isPerfect() {
        int sum = 0;

        for (int i = 1; i <num; i++){
            if (num % i ==0){
                sum =sum+i;
            }

        }


        return sum == num;
    }


    public boolean isAbundant() {

        if (num <= 1) {
            return false;
        }

        int sumOfFactor =1 ;
        for (int i =2; i<=Math.sqrt(num); i++){
            if(num%1==0){
                sumOfFactor += 1;
                if(i!=num/i){
                    sumOfFactor += num/i;
                }
            }
        }
        return sumOfFactor>num;
    }

    public boolean isNarcissistic() {
        String StringNum = String.valueOf(num);
        int num = StringNum.length();
        int sum =0;

        for (int i = 0; i<num; i++) {
            int digit = Character.getNumericValue(StringNum.charAt(i));
            sum += Math.pow(digit, num);
        }
        return sum == num;
    }

}

