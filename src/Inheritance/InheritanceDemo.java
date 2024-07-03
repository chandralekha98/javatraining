package Inheritance;

class Bank {
	public void m2() {
		System.out.println("m2: Grand Parent class");
	}
}

class Indian_Bank extends Bank {
	public void m3() {
	}
}

class USBank extends Bank {
	public void m4() {
	}
}

class UKBank extends Bank {
	public void m5() {
		System.out.println("m5: Parent class");
	}
}

class SBI extends Indian_Bank {
	public void m6() {
	}
}

class IndianBank extends Indian_Bank {
	public void m7() {
	}
}

class PNCBank extends Indian_Bank {
	public void m8() {
	}
}

class CitiBank extends USBank {
	public void m9() {
	}
}

class Barclays extends UKBank {
	public void m10() {
	}
}

public class InheritanceDemo {
	public static void main(String[] args) {
		Barclays obj=new Barclays();
		obj.m10();
		obj.m5();  
		obj.m2();  //Barclays can access methods of Barclays, UkBank (parentClass), and Bank (SuperParent class)
		Bank b=new Bank();
//		b.m5();   //Inheritance is Unidirectional and parent class cannot inherit child methods.
	}
}
