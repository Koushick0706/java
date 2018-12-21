public class Amstrong
{
 public static void main(String[] args)
 {
  int num=371,originalnum,reminder,result=0;
  originalnum = num;

  while(originalnum!=0)
  {
   reminder = originalnum % 10;
   result += Math.pow(reminder,3);
   originalnum /= 10;
  }
  if(result==num)
  {
   System.out.println(num + " is a Amstrong Number");
  }
  else
  {
   System.out.println(num + " is not a Amstrong number");
  }
 }
}