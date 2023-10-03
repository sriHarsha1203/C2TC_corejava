
public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// a-- => Post Decrement
		
		int a=10;
		int b=20;
		++a; // a=a+1=> 10=10+1=> 11
		int c=++a + b + a--; // a=a+1 [11+1=>12] + 20 + 12 =>44
		System.out.println(c);
		
		System.out.println(a); // a=a+1 [11+1=>12] , a=a-1 12-1=>11]
		
		int d=c++ + a + b--; // a=11, b=20, c=44, d=?
		      // c=c+1 [44+1=>45] + 11 + b=b-1 [20-1=19] ===> 45+11+19=75
		System.out.println(d); //output=75
		      //  c=c+1 [44+1=>45]
		System.out.println(c); // output=45
		
		
		
	}

}
