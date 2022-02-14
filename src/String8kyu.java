
public class String8kyu
{
    public static String repeatStr(final int repeat, final String string)
    {
        String repeated="";
        for (int i = 0; i < repeat; i++)
        {
            repeated+=string;
        }
        return repeated;
    }
    public static long[] powersOfTwo(int n)
    {

        long[] tab=new long[n];
        for(int i=0;i<n;i++)
        {
            tab[i]= (long) Math.pow(2,i);
            System.out.println(tab[i]);
        }
        return tab;
    }
    public static String remove(String str)
    {
        int lengthOfString=str.length();
        String result="";
        result=str.substring(1,lengthOfString-1);
        System.out.println(result);
        return result;
    }

    public static String multiTable(String number)
    {
        String result="";
        for(int i=1;i<=10;i++)
        {
            result+="${i} * ${number} = ${i*number}\n";
        }
        return result;
    }
    static String greet(String name, String owner) {
        if(name==owner)
        {
            System.out.println("Hello boss");
            return "Hello boss";
        }
        else
        {
            System.out.println("Hello guest");
            return "Hello guest";
        }
    }
    public static void main(String[] args)
    {
        greet("Maria","Maria");
    }
}
