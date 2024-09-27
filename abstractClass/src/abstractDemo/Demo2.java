package abstractDemo;

public class Demo2 extends Demo1 {

	@Override
	public void methodB() {
		System.out.println("method B");
	}

	@Override
	protected void methodC() {
		System.out.println("method C");
	}

}
