import java.util.*;
class Average
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        float m=s.nextFloat();
        float sum=n+m;
        float average=sum/2;
        System.out.printf(String.format("%.4f",average));
    }
}