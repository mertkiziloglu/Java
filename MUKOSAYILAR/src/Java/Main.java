package Java;

public class Main {

    public static void main(String[] args) {
        //28 --> 1,2,4,7,14 (divide)
        //1+2+4+7+14=28 this is perfectnumber

        int number = 5;
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == number) {
            System.out.println("perfect number.");
        } else
            System.out.println("Not perfect");
    }
}
