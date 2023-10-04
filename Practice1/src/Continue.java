
public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=10;
		for(i=1;i<=10;i++) {
			if(i==5)
				continue;
			System.out.println(i);
		}
		
		System.out.println("-----------------------");
		
		
		for(int j=1;j<=10;j++) {
			if(j==8)
				continue;
			System.out.println(j);
		}

	}

}
