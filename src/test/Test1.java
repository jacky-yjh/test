package test;


class Person{
	Person(){
		
	}
	public Person(int x){
	       System.out.println("person run"+x);
	}
}
class Son extends Person{
	public Son(int x){
		System.out.println("son run"+x); //1.¡¾  ¡¿
	}
}
	public class Test1{
		public static void main(String[] args){
			Son son  = new Son(5);
   }
}