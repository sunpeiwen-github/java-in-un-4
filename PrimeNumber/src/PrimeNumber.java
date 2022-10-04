public class PrimeNumber
{
    public static void main(String args[])
    {
        System.out.println("100-199素数有");
        loop:for (int i = 100; i <= 199; i++)
                {
                   for(int j=2;j<i/2;j++)
                   {
                      if(i%j==0)
                      {
                          continue loop;
                      }
                    }
                    System.out.printf("%4d ",i);
                }
    }
}
