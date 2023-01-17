package javacode;


//class Class11{
//	int age=40;
//	
//}
//
//class CLass12 extends Class11{
//	int age=50;
//}
//
//
//public class UpCaatingAndDownCasting {
//
//	public static void main(String[] args) {
//
//		Class11 c1=new CLass12();                //UpCasting (Creating an object for subclass and storing its address in supper class references variable)
//		System.out.println(c1.age);
//		
//		CLass12 c2=(CLass12)c1;                  //DownCasting (Storing back UpCasted variable back to subclass variable)
//	}
//
//}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class Engineering{
	String name="KLE SHESHGIRI";
	String principlename="Dr Basavraj Kategeri";
	
}

class Ec extends Engineering{
	String frndname="Shreyas";
	}

class Cs extends Engineering{
	String frndname="Amit";
}
public class UpCastingAndDownCasting {

	public static void main(String[] args) {

	    Engineering E=new Ec();         //UpCasting (Creating an object for subclass and storing its address in supper class references variable)
	    Engineering E1=new Cs();
	    
		System.out.println(E.name);
		System.out.println(E.principlename);
		
		 Ec ec=(Ec)E;                  //DownCasting (Storing back UpCasted variable back to subclass variable)
		 System.out.println("My EC friend:"+ec.frndname);
		 
		 Cs cs=(Cs)E1;
		 System.out.println("My EC friend:"+cs.frndname);
		 
	}

}