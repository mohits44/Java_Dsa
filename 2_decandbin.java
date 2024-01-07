class Decandbin {
    public static void main(String[] args) {
         HelloWorld obj = new HelloWorld();
         System.out.println(obj.dTob(10));
    }
    int dTob(int n)
    {
        int rem;
        int i=0;
        int bin=0;
        while(n!=0)
        {
            rem=n%2;
            bin=rem*(int)Math.pow(10,i)+bin;
            n=n/2;
            i++;
        }
        return bin;
    }
}
