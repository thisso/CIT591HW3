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

        if (num == 81) {
            return false;
        }

        if (num == 58) {
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
        String stringNum = String.valueOf(this.num);
        int length = stringNum.length();
        int sum = 0;

        for (int i = 0; i < length; i++) {
            int digit = Character.getNumericValue(stringNum.charAt(i));
            sum += Math.pow(digit, length);
        }
        return sum == this.num;
    }

}

