class Test{
	public static void  main(String [] args){
		C c=new C();
		c.m1();
        P p=new P();
        p.m1();
	}
}

class P{
	int a;
	int b;
	static{
		System.out.println("P class block1");
	}
	void m1(){
		System.out.println("P class m1()");
	}
	static{
		System.out.println("P class block 2");
	}	

	static{
		System.out.println("P class block3");
	}
	
}

class C extends P{
	static{
		System.out.println("C class block1");
	}
	static{
		System.out.println("C class block2");
	}
	void m1(){
		System.out.println("C class m1()");
	}
	static{
		System.out.println("C class block3");
	}
}

