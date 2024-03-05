package projectSNDL;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =20;
		int[] numbers= {20,40,45,78,54};
		 boolean isInArray= false;
		for(int element: numbers)
		{
			if(a==element)
			{
				isInArray= true;
				break;
			}
		}
		if (isInArray)
		{
			System.out.println(" element is present");
		}
		else
		{
			System.out.println(" element is  not present");
		}
	}

}
