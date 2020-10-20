package whiteboardsolutions.Ch01ArraysandStrings.Q9StringRotation;

public class StringRotation {

    public static boolean isRotatedString(String actualString, String rotatedString) {
        String combinedString = actualString + actualString;
        return combinedString.contains(rotatedString);
    }

    public static void main(String[] args) {
        boolean isRotated = isRotatedString("Dhiraj", "ajDhir");
        System.out.println("isRotated = " + isRotated);
        System.out.println("isRotated = " + isRotatedString("asdf", "fdas"));
    }
}
