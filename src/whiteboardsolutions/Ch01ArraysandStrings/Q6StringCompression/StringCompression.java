package whiteboardsolutions.Ch01ArraysandStrings.Q6StringCompression;

public class StringCompression {

    public static String getStringCompression(String str) {

        char[] array = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        int counter = 1;

        for(int i = 0; i < str.length(); i++) {

            if(i+1 >= str.length() || array[i] != array[i+1]) {
                sb.append(array[i]).append(counter);
                counter = 0;
            }
            counter++;
        }

        String compressed = sb.toString();
        return compressed.length() < str.length() ? compressed : str;

    }

    public static int countCompressedLength(String str) {
        char[] array = str.toCharArray();
        int counter = 1;
        int compressLength = 0;

        for(int i = 0; i < str.length(); i++) {

            if(i + 1 >= str.length() || array[i] != array[i+1]) {
                compressLength += 1 + String.valueOf(counter).length();
                counter = 0;
            }
            counter++;
        }

        return compressLength;

    }

    public static void main(String[] args) {
        String compressed = getStringCompression("abbbcccdefggggg");
        System.out.println("compressed = " + compressed);
        System.out.println("compressed Length = " + countCompressedLength("abbbcccdefggggg"));
        System.out.println("compressed Length = " + compressed.length());
    }

}
