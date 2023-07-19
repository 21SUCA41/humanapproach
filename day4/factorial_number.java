class factorial_number{
    public static void main(String[] args) {
       int n=5;
       int fact=n;
       while(n>1){
           n--;
           fact=fact*n;
       }
       System.out.print(fact);
}
}