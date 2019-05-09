class NameInitial{

	public static void main(String[] args) {

		String name = "Alan walker";
		String [] s = name.split(" ");
		for(String a : s){
System.out.println("name initial:"+(a.charAt(0))+" ");
}
	}
}