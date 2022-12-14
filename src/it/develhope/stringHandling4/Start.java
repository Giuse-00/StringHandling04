package it.develhope.stringHandling4;

public class Start {

    public static void main(String[] args) {

        String veryLongString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        String newVeryLongString = veryLongString.replaceAll("um", "HUM");

        String sub1 = newVeryLongString.substring(0, newVeryLongString.indexOf("aliquip"));
        String sub2 = newVeryLongString.substring(newVeryLongString.indexOf("aliquip"));

        System.out.println(sub1.trim());
        System.out.println(sub2.trim());

        boolean x = sub1.contains("est");
        boolean y = sub2.contains("est");

        boolean result = x ^ y;
        System.out.println(result);
    }
}
