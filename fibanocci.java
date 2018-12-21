public class fibanocci
{
  public static void main(String[] args)
  {
   int t1=0,t2=1,t3,count=10;

   System.out.println(t1 + " " +t2);//0and1 are Printed

   for(int i=2;i<count;i++)
   {
   t3=t1+t2;
   System.out.println("The Number are " + t3);
   t1=t2;
   t2=t3;
    }

   }
}