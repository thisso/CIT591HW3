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


    public boolean isAbundant(int n) {
        if (n <= 1) {
            return false;
        }

        int sumOfFactor =1 ;
        for (int i =2; i<=Math.sqrt(n); i++){
            if(n%1==0){
                sumOfFactor += 1;
                if(i!=n/i){
                    sumOfFactor += n/i;
                }
            }
        }
        return sumOfFactor>n;
    }

    public boolean isNarcissistic(int number) {
        String StringNum = String.valueOf(number);
        int num = StringNum.length();
        int sum =0;

        for (int i = 0; i<num; i++) {
            int digit = Character.getNumericValue(StringNum.charAt(i));
            sum += Math.pow(digit, num);
        }
        return sum == number;
    }

}

