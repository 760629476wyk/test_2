package testwyk;

public class Calculator {
	private static int result;
//	�洢���
	public void add(int n,int x) {
		result = x + n;
	}
	
	public void substract(int n){
		result = result - 1;
	}
	
	public void multiply(int n){
//		����δʵ��
	}
	
	public void divide(int n){
		result = result / n;
	}
	
	public void suquare(int n){
		result = n * n;
	}
	
//	��ѭ��
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
