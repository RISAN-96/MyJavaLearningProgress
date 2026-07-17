package July09;
//Java Tutorial 14: String Methods in Java
// java count from 0,1,2,3,4,5,..............


public class T14 {
    public static void main(String[] args) {
        String name = "Risan";
        System.out.println(name);
        int value = name.length();
        System.out.println(value); // character count

        String lower = name.toLowerCase();
        System.out.println(lower);
        //or
        System.out.println(name.toLowerCase());

        String upper = name.toUpperCase();
        System.out.println(upper);
        //or
        System.out.println(name.toUpperCase());

        String nonTrimmed = "       risan     ";
        System.out.println(nonTrimmed);
        String trim = nonTrimmed.trim();
        System.out.println(trim);
        //or
        System.out.println(nonTrimmed.trim());

        //substring - jei num in korbo shey num thake next word print hobe (risan/01234)
        System.out.println(name.substring(3)); //an-34
        System.out.println(name.substring(2, 5)); //san-234

        //name.replace
        System.out.println(name.replace('a', 'u')); // replace word of a string
        System.out.println(name.replace("isa", "eee"));

        //starts/end with
        System.out.println(name.startsWith("Ri")); //return true or false
        System.out.println(name.startsWith("Is")); //return true or false
        System.out.println(name.endsWith("an")); //return true or false

        //charAt
        System.out.println(name.charAt(4));
        String love = name.charAt(4) + "isa";
        System.out.println(love.toUpperCase());

        //index - returnthe index of given string
        String name1 = "Risaisan";
        System.out.println(name1.indexOf("isa"));
        System.out.println(name1.indexOf("isa", 2));

        //lastindexof  - RISAN
        System.out.println(name1.lastIndexOf("isa"));
        System.out.println(name1.lastIndexOf("isa", 1));
        // if i search anyting that is not there it will return -1

        //name.equal - case-sensitive
        System.out.println(name.equals("Risan"));
        System.out.println(name.equals(name1));

        //name.equalsIgnoreCase - case unsensitive - only match the character
        System.out.println(name.equalsIgnoreCase("RISAN"));


        //ESCAPE SIQUENCE CHARACTERS \n , \t , \' , \\ (t=tab, b=backspace, n=newline, r=carriage return, f=formfeed)
        System.out.println("I am a excape \n sequence character");
    }
}
