package entities;

public class OutsourceEmployee extends Employee {
	
	private Double addtionalCharge;
	
	public OutsourceEmployee() {		
	}

	public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double addtionalCharge) {
		super(name, hours, valuePerHour);
		this.addtionalCharge = addtionalCharge ;
		this.setAddtionalCharge(addtionalCharge);
	}

	public Double getAddtionalCharge() {
		return this.addtionalCharge += addtionalCharge * 1.1;
	}

	public void setAddtionalCharge(Double addtionalCharge) {
		
	}
	
	@Override
	public Double payment() {
		Double payment = hours * valuePerHour;
		payment = payment + (addtionalCharge * 1.1);
		return payment;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.getName() + " - $ " + payment() + "\n");
		//sb.append(" - $ ");
		//b.append(payment());
		return sb.toString();
	}
}
