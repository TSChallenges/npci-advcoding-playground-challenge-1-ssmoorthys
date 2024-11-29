public class Main {
    public static void main(String[] args) {
        // Test Case 1: Stock Analysis
        StockPortfolio stock = new StockPortfolio("BPCL", 10, 150.0);
        System.out.println("Inital Price >>"+ stock.getCurrentPrice());
        stock.updatePrice(160.0);
        System.out.println("Highest Price >>"+ stock.getHighestPrice());
        System.out.println(stock.calculateProfit());
        System.out.println(stock.getCurrentValue());
    }
}
