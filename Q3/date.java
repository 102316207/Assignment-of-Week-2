import java.io.*;
import java.util.Scanner;

class date{
	public static void main(String[] args)throws Exception {
		int year=0;
		int month=0;
		int day=0;
		int choose=0; 
		Scanner enter = new Scanner(System.in);
		
		System.out.print("年(西元):");
		year=enter.nextInt();
		System.out.print("月:");
		month=enter.nextInt();
		System.out.print("日:");
		day=enter.nextInt();
		Dat dat = new Dat(year,month,day);

		while(true)
		{
			System.out.print("(1)輸入新日期(2)檢查日期(-1)end:");
			choose=enter.nextInt();
			if(choose==1)
			{
				dat.setDate();
			}
			else if(choose==2)
			{
				System.out.println(dat.getYear()+"\t"+dat.getMonth()+"\t"+dat.getDay());
				dat.checkDate(dat.getYear(),dat.getMonth(),dat.getDay());
			}
			else if(choose==-1)
			{
				break;
			}
		}
	}
}
class Dat{
	int Year=0,Month=0,Day=0;
	Scanner enter = new Scanner(System.in);
	Dat(int y,int m,int d){
		Year=y;
		Month=m;
		Day=d;
	}
	int getYear(){
		return Year;
	}
	int getMonth(){
		return Month;
	}
	int getDay(){
		return Day;
	}
	void setDate()
	{
		try{
			System.out.print("年(西元):");
			Year=enter.nextInt();
			System.out.print("月:");
			Month=enter.nextInt();
			System.out.print("日:");
			Day=enter.nextInt();
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("輸入失敗!!\n");
			enter.next();
		}
		
	}
	void checkDate(int y,int m,int d){
		if(y>0)
		{
			if(m>0 && m<=12)
			{
				if(m==4||m==6||m==9||m==11)
				{
					if(d>0 && d<31)
					{
						System.out.println("Check is completed!!");
					}
					else
					{
						System.out.println("DAY error!!");
					}
				}
				else if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
				{
					if(d>0 && d<32)
					{
						System.out.println("Check is completed!!");
					}
					else
					{
						System.out.println("DAY error!!");
					}
				}
				else if(m==2)
				{
					if(y % 400 == 0 || (y % 4 == 0 && y % 100 != 0))
					{
						if(d<30 && d>0)//29天
						{
							System.out.println("Check is completed!!");
						}
						else
						{
							System.out.println("DAY error!!");
						}
					}
					else
					{
						if(d<29 && d>0)//28天
						{
							System.out.println("Check is completed!!");
						}
						else
						{
							System.out.println("DAY error!!");
						}
					}
				}
				else
				{
					System.out.println("DAY error!!");
				}
			}
			else
			{
				System.out.println("Month error!!");
			}
		}
		else
		{
			System.out.println("Year error!!");
		}
		System.out.println("===================");
		System.out.println("\n");
	}
}