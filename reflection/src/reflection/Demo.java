package reflection;

public class Demo {

	private static Demo demo = new Demo();

	private Demo() {

	}

	public static Demo getInstance() {
		return demo;
	}
}
