package departmentalStore;

public class customerdetails implements BonusPoint ,DeliveryCharge {
	private String customerName;
	private String phoneNumber;
	private String streerName;
	private double billAmount;
	private int distance;
	
	
	public customerdetails() {
		super();
	}


	public customerdetails(String customerName, String phoneNumber, String streerName, double billAmount,
			int distance) {
		super();
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.streerName = streerName;
		this.billAmount = billAmount;
		this.distance = distance;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getStreerName() {
		return streerName;
	}


	public void setStreerName(String streerName) {
		this.streerName = streerName;
	}


	public double getBillAmount() {
		return billAmount;
	}


	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}


	public int getDistance() {
		return distance;
	}


	public void setDistance(int distance) {
		this.distance = distance;
	}


	@Override
	public double deliveryCharge() {
		if (this.distance >= 25) {
			return this. distance*8;
		}
		else if (this.distance >= 15) {
			return this.distance*2;
		}
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double calculateBonusPoint() {
		if (this.billAmount >=250) {
			return this. billAmount/10;
		}
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public String toString() {
		return "customerdetails [customerName=" +  customerName +"\n" + ", phoneNumber=" + phoneNumber +"\n" + ", streerName="
				+ streerName + "\n" +", billAmount=" + billAmount +"\n" + ", distance=" + distance +"\n" + 
			 "deliveryCharge=" + deliveryCharge() +"\n" + "BonusPoint="+ calculateBonusPoint() + "\n"+"]";
	}
	
	
	
	
	
	

}
