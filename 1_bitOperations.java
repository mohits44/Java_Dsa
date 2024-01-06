class Operations{
    int or(int a,int b)
    {
        return a|b;
    }
     int xor(int a,int b)
    {
        return a^b;
    }
     int nnot(int a)
    {
        return ~a;
    }
    int and(int a,int b)
    {
        return a&b;
    }
    int leftShiftByOne(int a)
    {
        return a<<1;
    }
    int rightShiftByOne(int a)
    {
        return a>>1;
    }
}
class bitOperations{
    public static void main(String[] args) {
       Operations op=new Operations();
       System.out.println(op.leftShiftByOne(5));
    }
}
