package lib.employees;

public class OvertimeEmployee extends Employee {

	private int overtimeHours;
	private double overtimeRate;
	
	public OvertimeEmployee() {
		super();
		overtimeHours = 2;
		overtimeRate = 12;
	}
	
	public OvertimeEmployee(int overtimeHours, double overtimeRate, Name name, Date dob, Gender gender, 
			double hourlyRate, int hoursWorked, Date paymentDate) {
		
		super(name, dob, gender, hourlyRate, hoursWorked, paymentDate);
		this.overtimeHours = overtimeHours;
		this.overtimeRate = overtimeRate;
		
	}

	public OvertimeEmployee(int i, double d, int j, int k) {
		// TODO Auto-generated constructor stub
	}

	public int getOvertimeHours() {
		return overtimeHours;
	}
	
	public double getOvertimeRate() {
		return overtimeRate;
	}
	
	@Override
	public double calculatePay() {
		return (((super.getHoursWorked() - overtimeHours) * super.getHourlyRate()) + (overtimeHours * overtimeRate));
	}
	
	public void setOvertimeHours(int hours) {
		overtimeHours = hours;
	}
	
	public void setOvertimeRate(double rate) {
		overtimeRate = rate;
	}
	
	@Override
	public String toString() {
		return super.toString() + "[overtimeHours=" + overtimeHours + ", overtimeRate=" +
				overtimeRate + "]";
	}
}
