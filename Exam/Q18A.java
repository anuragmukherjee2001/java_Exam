class Parent{
	int i=10;
	{
		m1();
		System.out.println("Parent class Non-Static(Instance) Block");
	}
	Parent(){
		System.out.println("Parent Class Constructor");
	}
	public static void main(String[] args){
		Parent p=new Parent();
		System.out.println("Parent Class main() Method");
	}
	void m1(){
		System.out.println(j);
	}
	int j=20;
}
class Child extends Parent{
	int x=100;
	{
		m2();
		System.out.println("Child class First Non Static (Instance) Block");
	}
	Child(){
		System.out.println("Child class Constrauctor");
	}
	public static void main(String[] arg){
		Child c=new Child();
		System.out.println("Child class Main() Method");
	}
	void m2(){
		System.out.println(y);
	}
	{
		System.out.println("Child class Second non Static (Instance) Method");
	}
	int y=200;
}