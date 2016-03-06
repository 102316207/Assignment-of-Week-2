class array{
	public static void main(String[] args) {
		double array[]={1,3,5,7,9,11,13,15,17,19,21,23,25};
		double sum=0;
		int count=0;
		double average=0;
		for(double x:array){
			sum+=x;
			count++;
		}
		average=sum/count;
		System.out.println("sum="+sum);
		System.out.println("average="+average);
	}
}