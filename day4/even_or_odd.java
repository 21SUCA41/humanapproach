import java.util.Scanner;
class even_odd{
    public static void main(String[] args) {
    Scanner o=new Scanner(System.in);
    System.out.print("enter a number:");
    int n=o.nextInt();
    if(n%2==0)
        System.out.print("even no");
    else
        System.out.print("odd");
        
    }
}