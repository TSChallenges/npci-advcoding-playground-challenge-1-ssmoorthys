class StockPortfolio {
	// TODO: Add necessary fields for stock details
	private String symbol;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getBuyingPrice() {
		return buyingPrice;
	}

	public void setBuyingPrice(double buyingPrice) {
		this.buyingPrice = buyingPrice;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public double getHighestPrice() {
		return highestPrice;
	}

	public void setHighestPrice(double highestPrice) {
		this.highestPrice = highestPrice;
	}

	private int quantity;
	private double buyingPrice;
	private double currentPrice;
	private double highestPrice;

	// TODO: Initialize stock details
	public StockPortfolio(String symbol, int quantity, double buyingPrice) {
		this.symbol = symbol;
		this.quantity = quantity;
		this.buyingPrice = buyingPrice;
		this.currentPrice = buyingPrice;
		this.highestPrice = buyingPrice;
	}

	// TODO: Update current market price
	public void updatePrice(double newPrice) {

		if (newPrice < 0){
			System.out.println("Price cannot be zero");

		}else{
			currentPrice = newPrice;
			if (newPrice > highestPrice)
				highestPrice = newPrice;
		}
		

	}

	// TODO: Calculate total profit or loss
	public double calculateProfit() {
		double profit = (currentPrice - buyingPrice) * quantity;
		return profit;
	}

	// TODO: Calculate current total value of holdings
	public double getCurrentValue() {
			return currentPrice * quantity;
	}
}
