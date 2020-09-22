package SwitchCaseDemo;

public class SwitchCaseDemo {
	
	public static void main(String[] args) {
		
		int ch = 3;
		
		switch (ch) {
		case 1 :
			System.out.println("It's monday");
			
			break;
		case 2 :
			System.out.println("It's Tuesday");
			break;
		case 3 :
			System.out.println("It's Wednesday");
			break;
		default:
			System.out.println("invalid choice");
			break;
		}
	}

}
