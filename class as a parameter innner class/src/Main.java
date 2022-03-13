

class Outer{
	void methOuter()
	{
		System.out.println("Inside methOuter");
	}
	
	class Inner
	{
		void methInner(Outer ob)//passing outer class object as a parameter
		{
			ob.methOuter();
			System.out.println("Inside methInner");
		}
	}
}


public class Main {
	public static void main(String[] args) {
		Outer ob=new Outer();
		Outer.Inner inner=ob.new Inner();
		inner.methInner(new Outer());
	}
}