import java.util.Arrays;

public class main6kyu
{
    public static void main(String[] args)
    {
        //int[] arr={1,2,5,4,3};
        //sortTheOdd(arr);
    }
    public static int[] sortTheOdd(int[] array)
    {
        int[] odds;
        int a=0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]%2!=0)
            {
                a++;
            }
        }
        odds=new int[a];
        int pom=0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]%2!=0)
            {
                odds[pom]=array[i];
                pom++;
            }
        }
        Arrays.sort(odds);
        pom=0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]%2==0)
            {
                array[i]=array[i];
            }
            else
            {
                array[i]=odds[pom];
                pom++;
            }
        }
        return array;
    }
    public static String whoLikesIt(String[] names)
    {
        int lengthOfTable=names.length;
        String string="";
        if(lengthOfTable==0)
        {
            string="no one likes this";
            System.out.println("no one likes this");
            return string;
        }
        else if(lengthOfTable==1)
        {
            string=names[0]+" likes this";
            System.out.println(string);
            return string;
        }
        else if(lengthOfTable==2)
        {
            string=names[0]+" and "+names[1]+" like this";
            System.out.println(string);
            return string;
        }
        else if(lengthOfTable==3)
        {
            string=names[0]+", "+names[1]+" and "+names[2]+" like this";
            System.out.println(string);
            return string;
        }
        else
        {
            String size=String.valueOf(lengthOfTable-2);
            string=names[0]+", "+names[1]+" and "+size+" others like this";
            System.out.println(string);
            return string;
        }
    }
}
