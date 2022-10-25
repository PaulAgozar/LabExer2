public class BloodData2 {
	
	private String bloodType;
	private String rhFactor;
	
	public BloodData2(){
		bloodType = "O";
		rhFactor = "+";
	}
	
	void setBloodType(String bloodType){
		this.bloodType = bloodType;
	}
	
	void setRhFactor(String rhFactor){
		this.rhFactor = rhFactor;
	}
	
	String getBloodType(){
		return bloodType;
	}
	
	String getRhFactor(){
		return rhFactor;
	}

	public void display(){
		System.out.print(bloodType + rhFactor + " is added to the blood bank.");
	}
}
