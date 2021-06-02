package Java;

import java.util.Arrays;
import java.util.List;

import static Java.FixedFeeCalculator.STANDARD_FEE;

public class Main {


    private static Object ClientEngagement;

    public static void main(String[] args) {

        final List<ClientEngagement> engements= Arrays.asList(
                new ClientEngagement("Mert burger",40,40_000),
                new ClientEngagement("Mert toast",30,40000),
                new ClientEngagement("Mert rentaCar",25,1000),
                new ClientEngagement("Mert kiziloglu",10,2000)
        );
        System.out.println("Fixed fee");
        RevenueCalculator calculator=new FixedFeeCalculator(STANDARD_FEE);
        double total=0;
        for(ClientEngagement clientEngement:engements){

            total+=calculator.calculate(clientEngement);
        }
        System.out.println("Total : "+total);
    }
}
