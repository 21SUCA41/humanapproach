class palindrome_triangle{
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=n-i;k++)
            {
                System.out.print(".");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
               
            }
            for(int l=2;l<=i;l++)
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}

opt:

...1
..212
.32123
4321234

