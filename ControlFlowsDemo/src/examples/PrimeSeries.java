package examples;

public class PrimeSeries {
	
	public static void main(String[] args) {
		PrimeSeries s=new PrimeSeries();
		s.generatePrimeNumbers(50,100);
		s.generatePrimeNumbers(5000,  5500);
		
	}

	public void generatePrimeNumbers(int m, int n) {
		System.out.println("Prime numbers between "+m+" and "+n);
		for (int i = m; i < n; i++) {
			int val=i; //<--------this is done to protect the integrity of i, which you may need to alter later.
			int c=0;
			for (int j = 1; j <=val; j++) {
				if(val%j==0) {
					c++;
				}
			}
			if(c==2) {
				System.out.println(val);
			}
		}
	}
}
