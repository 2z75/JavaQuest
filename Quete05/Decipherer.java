public class Decipherer {
    public static void main(String[] args) {
        String message1 = "0@sn9sirppa@#?ia'jgtvryko1";
        String message2 = "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj";
        String message3 = "aopi?sedohtém@#?sedhtmg+p9l!";

        System.out.println("Message 1 déchiffré : " + decipher(message1));
        System.out.println("Message 2 déchiffré : " + decipher(message2));
        System.out.println("Message 3 déchiffré : " + decipher(message3));
    }

    public static String decipher(String message) {
    
        int keyLength = message.length() / 2;
        String subString = message.substring(5, 5 + keyLength);
        subString = subString.replace("@#?", " ");
        StringBuilder reversed = new StringBuilder(subString).reverse();

        return reversed.toString();
    }
}
