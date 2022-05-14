import java.util.*;


class pattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1;
        String s2="";
        s1=sc.next();
        for(int i=s1.length()-1;i>=0;i--)
        s2=s2+s1;
        if(s1.equals(s2))
        System.out.println("pallindrome");
        else
        System.out.println("not pallindrome");
    }
}