class StringCompareLexicographically{

	public static void main(String[] args) {

		String s1="abc";
		String s2="abc";
		
		int res= s1.compareTo(s2);
		if(res == 0)
		{
			System.out.println("both are equal");
		}else if(res < 0)
		{
			System.out.println(res);

		}else
		System.out.println(res);
	}
}