import java.util.ArrayList;
import java.util.List;

public class main5kyu
{
    public static void main(String[] args)
    {
        removNb(26);
    }

    public static List<long[]> removNb(long n)
    {
        int sumOfNumbers= (int) (n*(n+1)/2);
        long numbers[]=new long[(int) n];
        List<long[]> result=new ArrayList<>();
        System.out.println("suma= "+sumOfNumbers);
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(numbers[i]*numbers[j]+numbers[i]+numbers[j]==sumOfNumbers)
                {
                    result.add(new long[]{numbers[i], numbers[j]});
                    result.add(new long[]{numbers[j], numbers[i]});
                }
            }
        }

        if(result==null)
            return null;
        return result;
    }
}
