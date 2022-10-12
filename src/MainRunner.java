import java.util.Scanner;
public class MainRunner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //first String
        System.out.println("Enter a string!: ");
        String str1 = scan.nextLine();

        int halfString1 = str1.length()/2;
        int strLen1 = str1.length();

        //string 1 info
        System.out.println(strLen1);
        System.out.println(str1.substring(0,halfString1));
        System.out.println(str1.substring(halfString1));

        //Second String
        System.out.println("Enter another string!: ");
        String str2 = scan.nextLine();

        int halfString2 = str2.length()/2;
        int strLen2 =str2.length();

        //comparison between string 1 and string 2
        //which string is longer
        if(strLen1 == strLen2) { System.out.println("Both strings have the same length"); }
          else {
            if (strLen1 > strLen2) {
                System.out.println(str1 + " is longer");
            } else {
                System.out.println(str2 + " is longer");
            }
        }
        //checks for same sequence of characters
        if(str1.compareTo(str2) == 0) {
            System.out.println("Both strings have the exact same characters");
        } else {
            if (str1.compareTo(str2) > 0) {
                System.out.println(str1 + " is first alphabetically");
            } else {
                System.out.println(str2 + " is first alphabetically");
            }
        }



    }
}
