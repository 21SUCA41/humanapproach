class prime_no{
    public static void main(String[] args) {
        int n=15;
        int flag=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
        {
            flag=1;
            break;
        }
            
        }
        if(flag==0)
        {
        System.out.print("prime numner");
         }
        else
        {
          System.out.print("not prime numner");  
        }
    }
}