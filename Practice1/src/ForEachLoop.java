
public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,20,30,40,50};
		for(int temp:a)
		{
			System.out.println(temp);
			System.out.println("----------------------");
		}
		
		int b[]= {20,30,50,60,40};
		for(int temp:b) {
			System.out.println(temp);
		}
		System.out.println("-------------------");
		String s[]= {"Hello","Welcome","to","C2TC","Program"};
		for(String temp:s)
			System.out.println(temp);
	}

}
