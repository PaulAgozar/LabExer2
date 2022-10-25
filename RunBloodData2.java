import java.util.Scanner;

public class RunBloodData2 {
    public static void main(String[] args) {
    	String input1;
    	String input2;
    	String d;
    	BloodData2 bd2;
    	
		Scanner SC = new Scanner(System.in);
	
		System.out.print("Enter blood type: ");
		input1 = SC.nextLine();
		
		System.out.print("Enter the Rhesus factor (+ or -): ");
		input2 = SC.nextLine();
		
		d = input1 + input2;
		
		if(d.isEmpty()){
			bd2 = new BloodData2();
			bd2.display();
		}
		
		else if (d.equals("A+") || d.equals("A-") || d.equals("AB+") || d.equals("AB-") 
				|| d.equals("O+") || d.equals("O-") || d.equals("B+") || d.equals("B-")){
			bd2 = new BloodData2();
			bd2.setBloodType(input1);
			bd2.setRhFactor(input2);
			bd2.display();
		}
	
		else{
			System.out.print("Invalid Input");
		}
		
		SC.close();
		
    }
}
