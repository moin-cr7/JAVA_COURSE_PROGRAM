package javacode;

import java.security.PublicKey;

public class EncapsulationEx {
	
	
	String name;
	int no;
	
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	
	
	public void setNo(int no) {
		this.no=no;
	}
	public int getNo() {
		return no;
	}
	
 
	public static void main(String[] args) {
		EncapsulationEx e=new EncapsulationEx();
		e.setName("Moin");
		System.out.println(e.getName());
		
		e.setNo(47);
		System.out.println(e.getNo());
		
	}

}