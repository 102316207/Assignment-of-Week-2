class second{
	public static void main(String[] args) {
		int time1[]={4,23,45};
		int time2[]={13,54,23};
		int totle1=0;
		int totle2=0;
		int ans=0;
		totle1=time1[0]*3600+time1[1]*60+time1[2];
		totle2=time2[0]*3600+time2[1]*60+time2[2];
		ans=totle2-totle1;
		System.out.println(totle1);
		System.out.println(totle2);
		System.out.println(ans);
	}
}