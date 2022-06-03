package LinearSearch;

class NumbersWithEvenDigits {
    public static void main (String[] args) {
        int[] arr = {-12,345,2,0,65,7896};
        int evenCounter = 0;
        for(int i: arr){
            if(evenOrNot(i)){
                evenCounter++;
            };
        }
        System.out.println(evenCounter);
    }
    static boolean evenOrNot(int num){
        // counter variable to count number of digits
        if(num < 0){
            num = num * -1;
        }
        int counter = 0;
        counter = (int) Math.log10(num) + 1;
        return counter % 2 == 0;
    }
}