package javacode;

import javax.swing.event.TreeWillExpandListener;

public class StaticNonStaticBlock {
	static{
		System.out.println("Im 1st Static block, i will get execute only once");
	}
	{
		System.out.println("Im  1st Non-Static block , i will get executed whenever Object is created") ;  
	}
//	public static void main(String[] args) {
//		StaticNonStaticBlock s=new StaticNonStaticBlock();
//		new StaticNonStaticBlock();
//	}
	static{
		System.out.println("Im 2nd Static block, i will get execute only once");
	}
	{
		System.out.println("Im 2nd Non-Static block , i will get executed whenever Object is created") ;  
	}

}


/////////////////////////////                      output                //////////////////////////////////////////////////////////////
//Im 1st Static block, i will get execute only once
//Im 2nd Static block, i will get execute only once
//Im  1st Non-Static block , i will get executed whenever Object is created
//Im 2nd Non-Static block , i will get executed whenever Object is created
//Im  1st Non-Static block , i will get executed whenever Object is created
//Im 2nd Non-Static block , i will get executed whenever Object is created