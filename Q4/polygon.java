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
			System.out.print("(1)���(2)���(3)�x��(4)�T����(-1)end:");
			choose=enter.nextInt();
			if(choose==-1){
				break;
			}
			else
			{
				if(choose==1){
					while(true)
					{
						System.out.print("�b�|:");
						temp1=enter.nextInt();
						if(temp1>=0)
						{
							poly[count] = new Circle(temp1);
							count++;
							break;
						}
						else
						{
							System.out.print("�L�ĥb�|!!!");
						}
					}
				}
				else if(choose==2){
					while(true)
					{
						System.out.print("���b:");
						temp1=enter.nextInt();
						if(temp1>=0)
						{
							break;
						}
						else
						{
							System.out.print("�L�Ī��b!!!");
						}
					}
					while(true)
					{
						System.out.print("�u�b:");
						temp2=enter.nextInt();
						if(temp2>=0)
						{
							poly[count] = new Oval(temp1,temp2);
							count++;
							break;
						}
						else
						{
							System.out.print("�L�ĵu�b!!!");
						}
					}
				}
				else if(choose==3){
					while(true)
					{
						System.out.print("��:");
						temp1=enter.nextInt();
						if(temp1>=0)
						{
							break;
						}
						else
						{
							System.out.print("�L�Ī�!!!");
						}
					}
					while(true)
					{
						System.out.print("�e:");
						temp2=enter.nextInt();
						if(temp2>=0)
						{
							poly[count] = new Rectangle(temp1,temp2);
							count++;
							break;
						}
						else
						{
							System.out.print("�L�ļe!!!");
						}
					}
				}
				else if(choose==4){
					while(true)
					{
						while(true)
						{
							System.out.print("��1:");
							temp1=enter.nextInt();
							if(temp1>=0)
							{
								break;
							}
							else
							{
								System.out.print("�L����1!!!");
							}
						}
						while(true)
						{
							System.out.print("��2:");
							temp2=enter.nextInt();
							if(temp2>=0)
							{
								break;
							}
							else
							{
								System.out.print("�L����2!!!");
							}
						}
						while(true)
						{
							System.out.print("��3:");
							temp3=enter.nextInt();
							if(temp3>=0)
							{
								break;
							}
							else
							{
								System.out.print("�L����3!!!");
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
class Circle extends Shape{ 		//���
	double R=0;
	double p=3.14;
	Circle(double r){
		
		this.R = r;
	}
	double area(){
		return R*R*p;
	}
	void show(){
		System.out.println("���:"+this.area());
	}
}
class Oval extends Shape{ 			//����
	double Major;//���b
	double Minor;//�u�b
	double p=3.14;
    public Oval(double major,double minor)
	{
        Minor = minor;//�u�b
        Major = major;//���b
    }
    double area(){//���n
		return p*Major*Minor;
    }
	void show(){
		System.out.println("����:"+this.area());
	}
}
class Rectangle extends Shape{ 		//�x��
	double Length ;//��
	double Width ;//�e
	Rectangle(double length,double width){
		Length = length;
		Width = width;
	}
	double area(){
		return Length*Width;
	}
	void show(){
		System.out.println("�x��:"+this.area());
	}
}
class Triangle extends Shape{ 			//�T����
	double Side1;//��1
	double Side2;//��2
	double Side3;//��3
	double s;//�b�P��
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
		System.out.println("�T����:"+this.area());
	}
}