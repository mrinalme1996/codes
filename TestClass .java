import java.util.*;
class TestClass 
{
    public static void main(String args[] ) throws Exception 
    {
        Scanner sc=new Scanner(System.in);
       
        int q=sc.nextInt();
        for(int i=0;i<q;i++)
        {
            int money=sc.nextInt(); 
            fun10(money);
            if(fun10(money)==1)
            {
                System.out.println("Yes");
            }
            else 
            {
            fun20(money);
            if(fun20(money)==1)
            {
                System.out.println("Yes");
            }
            else
            System.out.println("No");
            }
        }
    }
    public static int  fun10(int money)
{

   if( money==1||money==0)
   {
       return 1;

   }
   else if(money>=10)
   {
       return fun10( money-10);
   }
   else
       return 0;
}
public static int  fun20(int money)
{

   if( money==1||money==0)
   {
       return 1;

   }
   else if(money>=20)
   {
       return fun20( money-20);
   }
   else
       return 0;
}
           
}
