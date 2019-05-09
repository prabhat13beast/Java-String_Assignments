public class StringContainsCharSequence {

    public static void main(String[] args)
    {
        String str1 = "PHP Exercises and Python Exercises";
        String str2 = "and";
        System.out.println("Original String: " + str1);
        System.out.println("contains specified char sequence:" + str2);
        System.out.println(str1.contains(str2));
    }
}
