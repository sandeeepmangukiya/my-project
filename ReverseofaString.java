import java.util.Scanner; //import Scanner Lib

public class ReverseofaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        System.out.println("Reverse of a String is : " + ReverseofaString.reverse(str));
        } finally {
            sc.close();
        }
    }
    static String reverse(String s){
        String rev = "";
        for(int j = s.length(); j>0; --j){
            rev = rev + (s.charAt(j-1));
        }
        return rev;
    }
}
