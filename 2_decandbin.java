class Decandbin {
    public static void main(String[] args) {
         HelloWorld obj = new HelloWorld();
         System.out.println(obj.dTob(10));
         System.out.println(obj.lastBit(5));
         System.out.println(obj.rightShift(5));
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
     int lastBit(int n)
    {
        return n&1;
    }
    int rightShift(int n)
    {
        n=n>>1;
        return n;
    }
}
