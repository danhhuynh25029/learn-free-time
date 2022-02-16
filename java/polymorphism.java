class polymorphism{
	public static void main(String[] args){
		Bank a = new ACB();
		Bank b = new BIDV();
		a.run();
		b.run();
	}
}
class Bank{
	void run(){
		System.out.println("running");
	}
}
class ACB extends Bank{
	@Override
	public void run(){
		System.out.println("ACB");
	}
}
class BIDV extends Bank{
	@Override
	public void run(){
		System.out.println("BIDV");
	}
}
