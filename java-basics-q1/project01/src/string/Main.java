package string;

public class Main {

    public static void main(String[] args) {

        String str = "Java Programming";
        int len = str.length();          // 16
        char ch = str.charAt(2);         // 'v'
        String sub1 = str.substring(5);   // "Programming"
        String sub2 = str.substring(0,4); // "Java"
        System.out.println(len);
        System.out.println(ch);
        System.out.println(sub1);
        System.out.println(sub2);

        String s1 = "Hello";
        String s2 = "hello";

        boolean eq = s1.equals(s2);             // false
        boolean eqIgnore = s1.equalsIgnoreCase(s2); // true
        int index = "Apple".indexOf("p");       // 1
        System.out.println(eq);
        System.out.println(eqIgnore);
        System.out.println(index);

        String text = "  Learn Java!  ";
        String clean = text.trim();             // "Learn Java!"
        String upper = clean.toUpperCase();     // "LEARN JAVA!"
        String fixed = clean.replace("!", "?"); // "Learn Java?"
        String con = fixed.concat(s1);
        System.out.println(clean);
        System.out.println(upper);
        System.out.println(con);

        String csv = "apple,banana,cherry";
        String[] fruits = csv.split(","); // ["apple", "banana", "cherry"]

        String message = String.join(" - ", "2026", "10", "30"); // "2026 - 10 - 30"


        String emptyStr = "";
        System.out.println(emptyStr.isEmpty()); // true

        String numStr = String.valueOf(456);     // "456"

    }

}
