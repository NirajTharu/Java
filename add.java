
class add {

    public int add(int a , int b)
    {
      return a+b;
    }
    public double add(double p, double q)
    {
     return p+q;
    }
    public int add(int c, int d, int e)
    {
      return c+d+e;
    }
    public static void main(String []args)
{
    add demo= new add();
    System.out.println(demo.add(2,4,4));
    System.out.println(demo.add(2, 4));
    System.out.println(demo.add(3.3,34.23));
}
}
