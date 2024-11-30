public class Main {
    public static void main(String[] args) {
        // Test Case 1: Stock Analysis
        StockPortfolio stock = new StockPortfolio("BPCL",5,10.0);
        System.out.println("Inital Price >>"+ stock.getCurrentPrice());
        stock.updatePrice(20);
        System.out.println("Highest Price >>"+ stock.getHighestPrice());
        System.out.println("Proft >>>"+stock.calculateProfit());
        System.out.println("Current Value>>>"+stock.getCurrentValue());
    }
}
