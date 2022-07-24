public class InvoiceGenerator {
    private static final int COST_PER_TIME = 1;
    private static final double MIN_COST_PER_KILOMETER = 10;

    double calculateFare(double distance, int time) {
        double totalFare = distance * MIN_COST_PER_KILOMETER + time * COST_PER_TIME ;
        return totalFare;
    }
}
