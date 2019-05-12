public class FirstNonRepeatingCharacter {

    final static String str = "cascade stsdf fg";

    public static void main(String[] args) {

        char[] charArr = str.toCharArray();

        for (int i = 0; charArr.length > i; i++) {
            int count = 0;
            for (int j = 0; charArr.length > j; j++) {
                if (charArr[i] == charArr[j]) {
                    count++;
                }
            }
            if (count == 1){
                System.out.println("First Non Repeating Character is: " + charArr[i]);
                break;
            }
        }

    }
}