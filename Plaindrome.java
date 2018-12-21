public class Plaindrome
{
public static void main(String[] args)
{
 int num=141,revnumber=0,originalnum,reminder;
 originalnum=num;
 
 while(num!=0)
 {
  reminder = num % 10;
  revnumber = revnumber * 10 + reminder;
  num /=10;
 }

if(originalnum==revnumber)
{
  System.out.println(originalnum + " is a plaindrome");
}
else
{
  System.out.println(originalnum + " is not a plaindrome");
}
}
}