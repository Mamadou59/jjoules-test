package jjoulestest;

public class ClassTwo {
	
	private String name;

	public ClassTwo(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void firstMethodSleepFor75ms() throws InterruptedException {
		Thread.sleep(75);
	}
	public void secondMethodSleepFor100ms() throws InterruptedException {
		Thread.sleep(100);
	}

}
