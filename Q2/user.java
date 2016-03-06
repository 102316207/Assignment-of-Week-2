import java.io.*;

class user{
	public static void main(String[] args)throws Exception {
		String name="";
		String year="",month="",day="";
		System.out.print("enter name:");
		InputStreamReader n=new InputStreamReader(System.in);
		BufferedReader nn=new BufferedReader(n);
		name=nn.readLine();
		System.out.print("enter birthday:\n");
		System.out.print("year:");
		InputStreamReader y=new InputStreamReader(System.in);
		BufferedReader yy=new BufferedReader(y);
		year=yy.readLine();
		System.out.print("month:");
		InputStreamReader m=new InputStreamReader(System.in);
		BufferedReader mm=new BufferedReader(m);
		month=mm.readLine();
		System.out.print("day:");
		InputStreamReader d=new InputStreamReader(System.in);
		BufferedReader dd=new BufferedReader(d);
		day=dd.readLine();
		System.out.println("\n"+"name:"+name+"\t");
		year=Integer.toString(Integer.valueOf(year)-1911);
		System.out.println("birthday:"+year+"/"+month+"/"+day);
	}
}