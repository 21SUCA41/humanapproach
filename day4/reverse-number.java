class reverse-number{
    public static void main(String[] args) {
        int n=1562;
        int rem=0;
        while(n>0)
        {
            rem=(rem*10)+n%10;
            n=n/10;
        }
        System.out.print(rem);
    }
}

output

2651