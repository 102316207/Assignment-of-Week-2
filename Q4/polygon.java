import java.util.Scanner;
import java.lang.*;
import java.math.*;
class polygon{
	public static void main(String[] args){
		Scanner enter = new Scanner(System.in);
		int count=0;
		int i=0;
		int choose=0;
		double temp1=0,temp2=0,temp3=0,big=0;
		Shape []poly = new Shape[100];
		while(true)
		{
			System.out.print("(1)圓形(2)橢圓(3)矩形(4)三角形(-1)end:");
			choose=enter.nextInt();
			if(choose==-1){
				break;
			}
			else
			{
				if(choose==1){
					while(true)
					{
						System.out.print("半徑:");
						temp1=enter.nextInt();
						if(temp1>=0)
						{
							poly[count] = new Circle(temp1);
							count++;
							break;
						}
						else
						{
							System.out.print("無效半徑!!!");
						}
					}
				}
				else if(choose==2){
					while(true)
					{
						System.out.print("長軸:");
						temp1=enter.nextInt();
						if(temp1>=0)
						{
							break;
						}
						else
						{
							System.out.print("無效長軸!!!");
						}
					}
					while(true)
					{
						System.out.print("短軸:");
						temp2=enter.nextInt();
						if(temp2>=0)
						{
							poly[count] = new Oval(temp1,temp2);
							count++;
							break;
						}
						else
						{
							System.out.print("無效短軸!!!");
						}
					}
				}
				else if(choose==3){
					while(true)
					{
						System.out.print("長:");
						temp1=enter.nextInt();
						if(temp1>=0)
						{
							break;
						}
						else
						{
							System.out.print("無效長!!!");
						}
					}
					while(true)
					{
						System.out.print("寬:");
						temp2=enter.nextInt();
						if(temp2>=0)
						{
							poly[count] = new Rectangle(temp1,temp2);
							count++;
							break;
						}
						else
						{
							System.out.print("無效寬!!!");
						}
					}
				}
				else if(choose==4){
					while(true)
					{
						while(true)
						{
							System.out.print("邊1:");
							temp1=enter.nextInt();
							if(temp1>=0)
							{
								break;
							}
							else
							{
								System.out.print("無效邊1!!!");
							}
						}
						while(true)
						{
							System.out.print("邊2:");
							temp2=enter.nextInt();
							if(temp2>=0)
							{
								break;
							}
							else
							{
								System.out.print("無效邊2!!!");
							}
						}
						while(true)
						{
							System.out.print("邊3:");
							temp3=enter.nextInt();
							if(temp3>=0)
							{
								break;
							}
							else
							{
								System.out.print("無效邊3!!!");
							}
						}
						if(temp1>temp2)
						{
							big=temp1;
						}
						else
						{
							big=temp2;
						}
						if(big<temp3)
						{
							big=temp3;
							if(big>temp1+temp2)
							{
								System.out.println("error!!! "+big+" > "+temp1+" + "+temp2);
							}
							else
							{
								poly[count] = new Triangle(temp1,temp2,temp3);
								count++;
								break;
							}
						}
						else
						{
							if(big==temp2)
							{
								if(big>temp1+temp2)
								{
									System.out.println("error!!! "+big+" > "+temp1+" + "+temp3);
								}
								else
								{
									poly[count] = new Triangle(temp1,temp2,temp3);
									count++;
									break;
								}
							}
							else
							{
								if(big>temp2+temp3)
								{
									System.out.println("error!!! "+big+" > "+temp2+" + "+temp3);
								}
								else
								{
									poly[count] = new Triangle(temp1,temp2,temp3);
									count++;
									break;
								}
							}
						}
					}					
				}
			}
		}
		for(i=0;i<count;i++)
		{
			poly[i].show();
		}
	}
}
abstract class Shape {
    abstract double area();
    abstract void show();
}
class Circle extends Shape{ 		//圓形
	double R=0;
	double p=3.14;
	Circle(double r){
		
		this.R = r;
	}
	double area(){
		return R*R*p;
	}
	void show(){
		System.out.println("圓形:"+this.area());
	}
}
class Oval extends Shape{ 			//橢圓形
	double Major;//長軸
	double Minor;//短軸
	double p=3.14;
    public Oval(double major,double minor)
	{
        Minor = minor;//短軸
        Major = major;//長軸
    }
    double area(){//面積
		return p*Major*Minor;
    }
	void show(){
		System.out.println("橢圓形:"+this.area());
	}
}
class Rectangle extends Shape{ 		//矩形
	double Length ;//長
	double Width ;//寬
	Rectangle(double length,double width){
		Length = length;
		Width = width;
	}
	double area(){
		return Length*Width;
	}
	void show(){
		System.out.println("矩形:"+this.area());
	}
}
class Triangle extends Shape{ 			//三角形
	double Side1;//邊1
	double Side2;//邊2
	double Side3;//邊3
	double s;//半周長
	double temp;
	Triangle(double side1,double side2,double side3){
		
		Side1 = side1;
		Side2 = side2;
		Side3 = side3;
	}
	double area(){
		s=(Side1+Side2+Side3)/2;
		temp=s*(s-Side1)*(s-Side2)*(s-Side3);
		return Math.sqrt(temp);
	}
	void show(){
		System.out.println("三角形:"+this.area());
	}
}