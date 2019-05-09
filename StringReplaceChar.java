public class StringReplaceChar {
    
   public static void main(String[] args)
    {
        String str = "truck is travelling through hills";

        // Replace all the 'd' characters with 'f' characters.
        String new_str = str.replace('r', 't');

        // Display the strings for comparison.
        System.out.println("Original string: " + str);
        System.out.println("New String: " + new_str);
    }
}
