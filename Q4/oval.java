import java.util.Scanner;


public class oval {
    public static void main(String[] args) {
		double major = 0;//���b
		double minor = 0;//�u�b
		int count = 0;
		int i=0;
		int choose=0;
		Scanner enter = new Scanner(System.in);
		Ova []ova = new Ova[100];
		while(true)
		{
			System.out.print("���b(-1:end):");
			major=enter.nextInt();
			if(major==-1)
			{
				break;
			}
			System.out.print("�u�b:");
			minor=enter.nextInt();
			
			ova[count] = new Ova(major,minor);
			count++;
		}
		while(true)
		{
			for(i=0;i<count;i++)
			{
				System.out.println("�s��"+(i+1)+":"+"���b="+ova[i].getmajor()+"\t�u�b="+ova[i].getminor());
			}
			System.out.print("��ܤ@�s��(-1:end):");
			choose=enter.nextInt();
			if(choose==-1)
			{
				break;
			}
			if(choose>0 &&choose<=count)
			{
				System.out.println("��ꭱ�n : "+ova[choose-1].area()+"\t���P�� : "+ova[choose-1].perimeter());
			}
			else
			{
				System.out.println("�L���s��!!!:");
			}
			System.out.println("=========================");
		}
    }
}
class Cir{
	double r=0;
	double p=3.14;
	Cir(double r){
		
		this.r=r;
	}
	double printR(){
		return this.r;
	}
	double Arc(double Angle){
		return 2*r*p*(Angle/360);
	}
	double Pie(double Angle){
		return r*r*p*(Angle/360);
	}
}
class Ova extends Cir
{
    double Major;//���b
    public Ova(double major,double minor)
	{
        super(minor);//�u�b���~�� r
        Major = major;
    }
    double area(){//���n
		return p*Major*r;
    }
    double perimeter()//�P��
    {
        return 2*p*r+4*(Major-r);
    }
	double getmajor(){//���o���b
		return Major;
    }
	double getminor(){//���o�u�b
		return r;
    }
}