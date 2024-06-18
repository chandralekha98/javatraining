package BrsuhUpOnClassesObjects;

class AC{
	String name;
	double price;
	int fan_speed;
		
	void acOnOrOff(int fan_speed) {
		System.out.print("AC is at Speed " + fan_speed +"\n");
	}
}
public class AirConditioner {
	
	public static void main(String[] args) {
		AC obj1=new AC();
		obj1.name="Samsung";
		obj1.price=144;
		obj1.fan_speed=0;
		obj1.acOnOrOff(obj1.fan_speed);
		
		AC obj2=new AC();
		obj2.name="Walmart";
		obj2.price=150;
		obj2.fan_speed=2;
		obj2.acOnOrOff(obj2.fan_speed);
		
		AC obj3=new AC();
		obj3.name="Costco";
		obj3.price=195;
		obj3.fan_speed=5;
		obj3.acOnOrOff(obj3.fan_speed);
		
		AC obj4=new AC();
		obj4.name="Sams Club";
		obj4.price=250;
		obj4.fan_speed=10;
		obj4.acOnOrOff(obj4.fan_speed);
	}
}
