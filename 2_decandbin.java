class HelloWorld {
    public static void main(String[] args) {
         HelloWorld obj = new HelloWorld();
         System.out.println(obj.dTob(10));
         System.out.println(obj.lastBit(5));
         System.out.println(obj.rightShift(5));
         obj.evenOdd(5);
         System.out.println(obj.bToD(1010));
         
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
    void evenOdd(int n)
    {
        if((n&1)==1)
        System.out.println("odd");
        else
        System.out.println("even");
    }
    // neg to bin afterwards
    
    int bToD(int n)
    {
        int i=0;
        int dec=0;
        int digit;
        while(n!=0)
        {
            digit=n%10;
            if(digit==1)
            dec=dec+(int)Math.pow(2,i);
            
            n=n/10;
              i++;
        }
        return dec;
    }
  
}
