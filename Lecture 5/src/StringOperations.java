public class StringOperations {

    public static String reverse(String original){
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            char character = original.charAt(i);
            reversed += character;
        }

        return reversed;
    }

    public static boolean isPalindrome(String string) {
        String reversed = reverse(string);
        return string.equals(reversed);
    }

    public static void main(String[] args) {
        String original = "Reverse this sentence";
        String reversed = reverse(original);
        System.out.println(original);
        System.out.println(reversed);
        String palyndrome = "kayak";
        System.out.println(isPalindrome(palyndrome));
        String notAPalyndrome = "Nice weather";
        System.out.println(isPalindrome(notAPalyndrome));
    }

}
