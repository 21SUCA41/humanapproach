public class armstrong_no{

     public static void main(String []args){
    int n=1634;  
    int rem=0;
    int ams=0;
    int m=n;
    do{
        rem=n%10;
        ams=ams+(rem*rem*rem*rem);
        n=n/10;
    }while(n>0);
    if(ams==m){
   System.out.print("ams number");
    }
    else
    System.out.print("not ams");
}
}
   