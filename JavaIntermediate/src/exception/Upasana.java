package exception;

public class Upasana {
	public void method1() {
		int x=0;
		int y=0;
		int z=x/y;
	}
	public void method2() {method1();}
	public void method3() {method2();}
	public void method4() {method3();}
	public void method5() {method4();}

}
