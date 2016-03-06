import java.io.*;
class operator{
	public static void main(String[] args)throws Exception {
		String number1="";
		String number2="";
		String operator="";
		int k=0;
		float temp1=0,temp2=0,totle=0;
		String ans="";
		System.out.println("enter number1:");
		InputStreamReader num1=new InputStreamReader(System.in);
		BufferedReader n1=new BufferedReader(num1);
		number1=n1.readLine();
		System.out.println("enter number2:");
		InputStreamReader num2=new InputStreamReader(System.in);
		BufferedReader n2=new BufferedReader(num2);
		number2=n2.readLine();
		System.out.println(number1+" "+number2);
		temp1=Float.valueOf(number1);
		temp2=Float.valueOf(number2);
		
		System.out.println("choose one Operator(1)+ (2)- (3)* (4)/:");
		InputStreamReader oper=new InputStreamReader(System.in);
		BufferedReader op=new BufferedReader(oper);
		operator=op.readLine();
		k=Integer.valueOf(operator);
		switch(k){
			case 1:
				totle=temp1+temp2;
				ans=String.valueOf(totle);
				System.out.println(number1+"+"+number2+"="+ans);
				break;
			case 2:
				totle=temp1-temp2;
				ans=String.valueOf(totle);
				System.out.println(number1+"-"+number2+"="+ans);
				break;
			case 3:
				totle=temp1*temp2;
				ans=String.valueOf(totle);
				System.out.println(number1+"*"+number2+"="+ans);
				break;
			case 4:
				if(temp2==0)
				{
					System.out.println("Denominator can't be 0!!");
				}
				else
				{
					totle=temp1/temp2;
					ans=String.valueOf(totle);
					System.out.println(number1+"/"+number2+"="+ans);
				}
				break;
				
			default:
				System.out.println("error!!");
		}
	}
}