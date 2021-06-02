package Java;

public class RoyaltyShareCalculator implements RevenueCalculator{
    public static final double STANDARD_ROYALTY_PERCENTAGE=0.15;
    private final double royaltyPercentage;
    private ClientEngagement clientEngagement;


    public RoyaltyShareCalculator(double royaltyPercentage) {
        this.royaltyPercentage = royaltyPercentage;
    }


    @Override
    public double calculate(ClientEngagement clientEngement) {
         return royaltyPercentage * clientEngagement.getAnticipatedRevenue();    }
}
