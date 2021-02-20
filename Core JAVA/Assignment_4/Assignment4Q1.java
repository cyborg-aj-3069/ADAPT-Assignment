import java.util.Scanner;
interface Func
{
	abstract double cal(double x, double y);
}
class Assignment4Q1 {
	
	Func Add = (a, b) -> a + b;
	public double addition(int num1, int num2) {
		return Add.cal(13, 5);
	}
	
	Func Sub = (a, b) -> a - b;
	public double subtraction(int num1, int num2) {
		return Sub.cal(13,5);
	}
	
	Func Mul = (a, b) -> a * b;
    public double multiplication(int num1, int num2) {
		return Mul.cal(13, 5);
	}
	
	Func Div = (a, b) -> a / b;
	public double division(double num1, double num2) {
		return Div.cal(13, 5);
	}
	
	public static void main(String[] args) {

	}
}
    
	
