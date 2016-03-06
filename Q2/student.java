import java.io.*;
import java.util.Scanner;
class student{
	public static void main(String[] args)throws Exception {
		int number=0,count=0,score=0,k=0;
		String name="",Score="";
		String student[][]=new String[100][3];
		Scanner enter = new Scanner(System.in);
		//student=new String[100][3];
		System.out.println("enter number  name  score:");
		while(number!=-1)
		{
			k=0;
			System.out.print("Number:(-1:end)");
			number=enter.nextInt();
			if(number==-1)
			{
				break;
			}
			System.out.print("Name:");
			name=enter.next();
			while(true)
			{
				try{
					System.out.print("Score:");
					score=enter.nextInt();
					if(score>=0&&score<=100)
					{
						break;
					}
					else
					{
						System.out.println("Score must between 0 to 100");
					}
				}
				catch(Exception e){
					System.out.println("Error:NumberFormatException("+e+")");
					enter.next();

				}
			}
			student[count][0]=Integer.toString(number);
			student[count][1]=name;
			student[count][2]=Integer.toString(score);
			//System.out.print(student[count][0]+" "+student[count][1]+" "+student[count][2]);
			count++;
		}
		number=0;
		while(number!=-1)
		{
			int i=0,temp=0;
			String id;
			System.out.print("enter number to search(-1:end):");
			number=enter.nextInt();
			if(number==-1)
			{
				break;
			}
			//System.out.println(count);
			for(i=0;i<count;i++)
			{
				//System.out.print(id);
				temp=Integer.valueOf(student[i][0]);
				//System.out.println(student[i][0]);
				if(number==temp)
				{
					//System.out.print("in");
					System.out.println("====================");
					System.out.println("Number\tName\tScore");
					System.out.println(student[i][0]+"\t"+student[i][1]+"\t"+student[i][2]+"\n");
				}
			}
		}
	}
}