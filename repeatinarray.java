import java.util.*;
class RepeatingElement{
	public static void main(String[] args){
		
		int [] a={1,2,3,2,5,7,5};
		
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				
				if((a[i]==a[j]) && (i!=j)){
					System.out.println("Repeated elements are:"+a[j]);
				
				}
			}
		}
		}
	}