package org.example;


public class Methods {
    private static StringBuilder keyString = new StringBuilder();
    private static StringBuilder output = new StringBuilder();
    private static String text1;
    private static String key1;
    public static String encrypt(String text, String key) {
        text1 = text;
        key1 = key;

        keyString = getKeyString();

        for(int i = 0; i < text.length(); i++) {
            if(!Character.isLetter(text.charAt(i))) output.append(text.charAt(i));
            else output.append((char) (((text.toUpperCase().charAt(i) + keyString.charAt(i)) % 26) + 'A'));
        }

        return output.toString();
    }

    public static String decrypt(String text, String key) {
        text1 = text;
        key1 = key;

        keyString = getKeyString();

        for(int i = 0; i < text.length(); i++) {
            if(!Character.isLetter(text.charAt(i))) output.append(text.charAt(i));
            else output.append((char) (((text.toUpperCase().charAt(i) - keyString.charAt(i) + 26) % 26) + 'A'));
        }

        return output.toString();
    }

    public static void toUpperCase(StringBuilder builder) {
        for (int i = 0; i < builder.length(); i++) {
            if (Character.isLowerCase(builder.charAt(i))) {
                builder.setCharAt(i,
                        Character.toUpperCase(builder.charAt(i)));
            }
        }
    }

    public static StringBuilder getKeyString() {

        for(int i = 0, j = 0; i < text1.length(); i++, j++) {
            if(j == key1.length()) j = 0;
            if(!Character.isLetter(text1.charAt(i))) {
                keyString.append(" ");
                j--;
            }
            else keyString.append(key1.charAt(j));
        }

        toUpperCase(keyString);

        return keyString;
    }
}
