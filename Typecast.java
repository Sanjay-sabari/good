public class Typecast {

	public static void main(String[] args) {
		
		byte   bno1 = 16;
		short  sno1 = 100;
		int    ino1 = 2457;
		long   lno1 = 65732;
		float  fno1 = 18.542f;
		double dno1 = 3279.983;
		lno1 = bno1 + lno1 + sno1;
		ino1 = (int)(ino1+lno1);   //typecast is done here
		fno1 = lno1 + fno1;
				System.out.println(lno1);
				System.out.println(ino1);
				System.out.println(fno1);


	}

}

