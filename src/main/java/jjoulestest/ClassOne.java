package jjoulestest;

public class ClassOne {
	
	private int x;

	public ClassOne(int x) {
		this.x = x;
	}
	
	public void firstMethodSleepFor25ms() throws InterruptedException {
		Thread.sleep(25);
	}
	public void secondMethodSleepFor50ms() throws InterruptedException {
		Thread.sleep(50);
	}
	
	public int getX() {
		return this.x;
	}

}
