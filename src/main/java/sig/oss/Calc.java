public class Calc {
	private in r = 0;
	public int add(int x, int y) { //add method
		return x+y;
	}
	public int sub(int x, int y) {
		return x -y;
	}
	public void inc(int d) {
		r += d;
	}
	public int getResult() {
		return r;
	}
}
