import java.util.Scanner;
class PrimeNo{
	public static void main(String[] args){
		int a,b;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter no to check it is prime or not:");
		a=sc.nextInt();
		boolean flag= false;
		for(b=2;b<=a/2;b++){
			if(a%b==0){
				flag=true;
				break;
			}
		}
		if(!flag){
			System.out.println(a+ " "+"is prime no");
		}
		else{
			System.out.println(a+" "+  " is not prime no");
	}
	}
}