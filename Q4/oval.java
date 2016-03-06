import java.util.Scanner;


public class oval {
    public static void main(String[] args) {
		double major = 0;//長軸
		double minor = 0;//短軸
		int count = 0;
		int i=0;
		int choose=0;
		Scanner enter = new Scanner(System.in);
		Ova []ova = new Ova[100];
		while(true)
		{
			System.out.print("長軸(-1:end):");
			major=enter.nextInt();
			if(major==-1)
			{
				break;
			}
			System.out.print("短軸:");
			minor=enter.nextInt();
			
			ova[count] = new Ova(major,minor);
			count++;
		}
		while(true)
		{
			for(i=0;i<count;i++)
			{
				System.out.println("編號"+(i+1)+":"+"長軸="+ova[i].getmajor()+"\t短軸="+ova[i].getminor());
			}
			System.out.print("選擇一編號(-1:end):");
			choose=enter.nextInt();
			if(choose==-1)
			{
				break;
			}
			if(choose>0 &&choose<=count)
			{
				System.out.println("橢圓面積 : "+ova[choose-1].area()+"\t橢圓周長 : "+ova[choose-1].perimeter());
			}
			else
			{
				System.out.println("無此編號!!!:");
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
    double Major;//長軸
    public Ova(double major,double minor)
	{
        super(minor);//短軸用繼承 r
        Major = major;
    }
    double area(){//面積
		return p*Major*r;
    }
    double perimeter()//周長
    {
        return 2*p*r+4*(Major-r);
    }
	double getmajor(){//取得長軸
		return Major;
    }
	double getminor(){//取得短軸
		return r;
    }
}