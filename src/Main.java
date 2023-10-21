public class Main {
    public String reverse (String str) {

        int start = 0;
        int end = str.length() - 1;
        char[] output = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {

            if (Character.isLetter(output[start]) && Character.isLetter(output[end])) {

                char temp = output[start];
                output[start] = output[end];
                output[end] = temp;

                start++;
                end--;
            }
            else if (!Character.isLetter(output[start]) && !Character.isLetter(output[end])) {
                start++;
                end--;
            }
            else if (Character.isLetter(output[start]) && !Character.isLetter(output[end])) {
                end--;
            }
            else if (!Character.isLetter(output[start]) && Character.isLetter(output[end])) {
                start++;
            }
            if(start >= end) {
                return new String(output);
            }
        }
        throw new IllegalArgumentException("Incorrect reverse string");
    }

    public static void main(String[] args) {
        Main text = new Main();
        System.out.println(text.reverse("J@va the be$t!123"));
    }
}