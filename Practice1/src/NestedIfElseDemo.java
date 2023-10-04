
public class NestedIfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10, b=20, c=5;
				
			if(a>b) {
				if(a>c)
					System.out.println(a);
				else
					System.out.println(c); 
			}
			else {
				if(c>b)
					System.out.println(c);
				else
					System.out.println(b);
			}
			
			
			
			
			int d=30, e=10, f=7;
			
			if(d>e) {
				if(d>f)
					System.out.println(d);
				else
					System.out.println(f);
			}
			else {
				if(f>e)
					System.out.println(f);
				else
					System.out.println(e);
			}
					
	}

}
