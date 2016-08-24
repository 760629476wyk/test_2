package testwyk;

public class Calculator {
	private static int result;
//	存储结果
	public void add(int n,int x) {
		result = x + n;
	}
	
	public void substract(int n){
		result = result - 1;
	}
	
	public void multiply(int n){
//		功能未实现
	}
	
	public void divide(int n){
		result = result / n;
	}
	
	public void suquare(int n){
		result = n * n;
	}
	
//	死循环
	public void squareRoot(int n) {
		for(;;);
	}
	
	public void  clear() {
		result = 0;
	}
	
	public int getResult() {
		return result;
	}
	
}
