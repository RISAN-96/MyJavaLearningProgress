package July10.July9;
//Java Practice Questions on Strings: Practice Set on Java Strings (Must Solve!)

public class T15_PP_C3 {
    public static void main(String[] args) {
//      Q1: Write a java program to convert a string to lowercase;
        String a = "MY NAME IS RISAN";
        System.out.println(a.toLowerCase());

//      Q2: Write a java program to replace spaces with underscore;
        String b = "MY NAME IS RISAN";
        System.out.println(b.replace(" ", "_"));

//      Q3: Write a java program to fill in a letter template which looks like below
//                letter = "Dear <|name|>, Thanks a lot";
//                replace <|name|>, with a string (Some name);
        String name = "Risan";
        System.out.println("Dear "+ name + ", " + "Thanks a lot");

        String letter = "Dear <|name|>, Thanks a lot";
        letter= letter.replace("<|name|>", "Risan");
        System.out.println(letter);

//      Q4: Write a Java program to detect double & triple spaces in a string;
        String c = "This string contains double  &   triple spaces";
        System.out.println(c.indexOf("  ")); //TRUE
        System.out.println(c.indexOf("   ")); //TRUE



//      Q5: Write a java program to format the following letter using escape sequence characters;
//                letter = "Dear Risan, This Java course is nice, Thanks"

        String letter1 = "Dear Risan,\n\tThis Java course is nice.\nThanks!";
        System.out.println(letter1);
    }
}
