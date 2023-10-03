
public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// SMALL TO LARGE...
		
		byte b=10; //1 byte=8bits
		int i=20; //4 bytes
		System.out.println(i);
		System.out.println(b);
		
		// SMALL TO LARGE...
		
		float f=13.23f; //4 bytes
		double d=f; //8 bytes
		System.out.println(d);
		
		char ch='A'; // 1 byte
		int j=ch; //
		System.out.println(j);
		
		// EXPLICIT TYPE CASTING / NARROWING CASTING..
		
		// LARGE TO SMALL
		
		double dOne=10.52d; // 8 bytes
		float fOne=(float)dOne; // 4 bytes
		System.out.println(fOne);
		
	}

}
