package Java;

public class HourlyRateCalculator implements RevenueCalculator{
    public static final double STANDARD_HOURLY_RATE=50;
    private final double hourlyRate;
    private ClientEngagement clientEngagement;

    public HourlyRateCalculator(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }


    @Override
    public double calculate(ClientEngagement clientEngement) {
        return hourlyRate * clientEngagement.getHoursWorked();
    }
}
