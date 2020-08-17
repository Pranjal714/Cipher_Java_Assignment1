interface lamda{
	int test(int a,int b);
}
public class Calculator {
	public static void main(String[] args) {
		lamda add=(a,b)->(a+b);
		lamda difference=(a,b)->(a-b);
		lamda product=(a,b)->(a*b);
		lamda safeDivision=(a,b)->{
			try {
				if(b==0) {
					throw new ArithmeticException();
				}
				else {
					return a/b;
				}
			}
			catch(ArithmeticException e) {
				System.out.println("Invalid Division With Zero");
			}
			return 0;
		};
		System.out.println(add.test(100,50));
		System.out.println(difference.test(100,50));
		System.out.println(product.test(100,50));
		System.out.println(safeDivision.test(100,50));
	}
}