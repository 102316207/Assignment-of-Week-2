import java.io.*;
class year{
	public static void main(String[] args)throws Exception {
		String years="";
		int year=0;
		int count=0;
		System.out.print("enter year:");
		InputStreamReader num=new InputStreamReader(System.in);
		BufferedReader n=new BufferedReader(num);
		years=n.readLine();
		year=Integer.valueOf(years);
		while(year!=0)
		{
			if ((year%400==0)||(year%4==0&&year%100!=0))
			{
				years=String.valueOf(year);
				System.out.print(years+" | ");
				count++;
			}
			if(count==10)
			{
				System.out.print("\n");
				count=0;
			}
			year--;
		}
	}
}