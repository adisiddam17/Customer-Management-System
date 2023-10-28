package enums;

public enum ServicePlan {
	SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);
	
	private double planCharges;
	private ServicePlan(double planCharges)
	{
		this.planCharges=planCharges;
	}
	
	public String toString()
	{
		return "SERVICE PLAN : "+name()+"  PRICE : "+planCharges;
	}
	
	public double getPlanCharges()
	{
		return planCharges;
	}
	
	public void setPlanCharges(double plan)
	{
		this.planCharges=plan;
	}
	
}
