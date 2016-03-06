import java.io.*;
class circle{
	public static void main(String[] args)throws Exception {
		String years="";
		double angle=0;
		int count=0;
		int i=0;
		Cir []cir = new Cir[100];
		while(true)
		{
			System.out.print("enter radius(-1:end):");
			InputStreamReader num=new InputStreamReader(System.in);
			BufferedReader n=new BufferedReader(num);
			i=Integer.valueOf(n.readLine());
			if(i==-1)
			{
				break;
			}
			else
			{
				cir[count] = new Cir(i);
				System.out.println(cir[count].printR());
				count++;
			}
		}
		for(i=0;i<count;i++)
		{
			System.out.println("½s¸¹"+(i+1)+": r = "+cir[i].printR());
		}
		while(true)
		{
			System.out.println("choose a number(-1:end):");
			InputStreamReader nu=new InputStreamReader(System.in);
			BufferedReader nn=new BufferedReader(nu);
			i=Integer.valueOf(nn.readLine());
			if(i==-1)
			{
				break;
			}
			if(i<count+1 && i>0)
			{
				System.out.println("enter angle:");
				InputStreamReader ang=new InputStreamReader(System.in);
				BufferedReader a=new BufferedReader(ang);
				angle=Double.valueOf(a.readLine());
				if(angle>0 && angle<360)
				{
					System.out.println("©·ªø:"+cir[i-1].Arc(angle));
					System.out.println("­±¿n:"+cir[i-1].Pie(angle));
				}
				else
				{
					System.out.println("wrong Angle!!!");
				}
			}
			else
			{
					System.out.println("wrong Number!!!");
			}
		}
	}
}
class Cir{
	int r=0;
	double p=3.14;
	Cir(int r){
		
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