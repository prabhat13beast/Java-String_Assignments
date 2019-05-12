class SecondFrequentChar{

	public static void main(String[] args) {

		 String s = "abbbcd ggh";
         int []arr = new int[256];
         for(int i=0; i<s.length(); i++)
         	(arr[s.charAt(i)])++;
         int arr1=0, arr2=0;
         for(int i=0; i<256; i++)
         {
         	if(arr[i]>arr[arr1])
         	{
         		arr2 = arr1;
         		arr1 = i;
         	}
         	else if(arr[i]>arr[arr2] && arr[i] != arr[arr1])
         		arr2 = i;
         	
         }
         char res= (char)arr2;
         if(res != '\0')
         	System.out.println("2nd most freqent Character is:"+res);
         else
         	System.out.println("no 2nd most frequent char found!");

	}
}