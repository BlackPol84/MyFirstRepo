package ru.ykul.utils;

public final class StringUtils {
    private StringUtils() {}
    public static String reverse (String str) {
        if(str == null || str.isEmpty()) {
            return "";
        }

        int start = 0;
        int end = str.length() - 1;
        char[] output = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {

            if(start >= end) {
                break;
            } else if (Character.isLetter(output[start]) && Character.isLetter(output[end])) {
                char temp = output[start];
                output[start] = output[end];
                output[end] = temp;
                start++;
                end--;

            } else if (!Character.isLetter(output[start]) && !Character.isLetter(output[end])) {
                start++;
                end--;
            } else if (Character.isLetter(output[start]) && !Character.isLetter(output[end])) {
                end--;
            } else if (!Character.isLetter(output[start]) && Character.isLetter(output[end])) {
                start++;
            }
        }
        return new String(output);
    }
}
