class CopyArray{
	public static void main(String[] args){
		int [] a={1,2,3,4,5};
		int [] b=new int[a.length];
		System.out.println("Contents of array a");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
			b[i]=a[i];
			}
				System.out.println("\nContents of array b");
		for(int i=0;i<b.length;i++){
			System.out.print(b[i]+" ");
		}
	}
}