class fibbonaci_no{
    public static void main(String[] args) {
        int f=0;
        int s=1;
        int n=5;
        int t=0;
        for(int i=0;i<=n;i++)
        {   
            System.out.print(f);
            t=f+s;
            f=s;
            s=t;
        }
    }
}
output

011235