class main16A{
	public static void main(String[] args){
		try{
			System.out.println(10/5);
		}
        catch(ArithmeticException ae){
            System.out.println("Arithmetic Exception");
        }
		finally{
			System.out.println("Finally will always be executed");
		}
		
	}
}