
public class TradeInVehicle extends Vehicle {
	
	private float TradeinValue;
	private String condition;
	
	public TradeInVehicle(String serialno, String name, String model, int year, String manufac, float baseCost,
			Vehicle.SoldStatus status, float Tradeinval, String condition) {
		super(serialno, name, model, year, manufac, baseCost, status);
		this.setTradeinValue(Tradeinval);
		this.setCondition(condition);
	}

	public float getTradeinValue() {
		return TradeinValue;
	}

	public void setTradeinValue(float tradeinValue) {
		TradeinValue = tradeinValue;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}
	
}
