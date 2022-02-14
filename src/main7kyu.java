import java.util.ArrayList;
import java.util.Locale;

public class main7kyu
{
    public static void main(String[] args)
    {
       // isTriangle(1,2,2);
       // maskify("12345ghb3i2675o34tg45y");
       // squareDigits(4149);
        isIsogram("moOse");
    }
    public static boolean isTriangle(int a,int b,int c)
    {
        if(a>0 && b>0 && c>0)
        {
            if(a>=b && a>=c)
            {
                if(b+c>a) {
                    return true;
                }
                else
                    return false;
            }
            else if(b>=a && b>=c)
            {
                if(a+c>b)
                    return true;
                else
                    return false;
            }
            else if(c>=a && c>=b)
            {
                if(a+b>c)
                    return true;
                else
                    return false;
            }
            else
                return false;
        }
        else
            return false;
    }
    public static String maskify(String word)
    {
        char[] charWord=new char[word.length()];
        for(int i=0;i<word.length();i++)
        {
            charWord[i]=word.charAt(i);
        }
        if(word.length()>4)
        {
            for(int i=0;i<word.length()-4;i++)
            {
                charWord[i]='#';
            }
            String string=String.valueOf(charWord);
            System.out.println(string);
            return string;
        }
        else
        {
            System.out.println(word);
            return word;
        }
    }
    public static int squareDigits(int n)
    {
        int number=n;
        String result="";
        int res;
        ArrayList<Integer> tabReversed=new ArrayList<>();
        ArrayList<Integer> intTab=new ArrayList<>();
        ArrayList<Integer> tab=new ArrayList<>();
        int i=0;
        if(number==0)
        {
            return 0;
        }
        else
        {
            while (number > 0) {
                intTab.add(number % 10);
                tab.add(intTab.get(i) * intTab.get(i));
                number = number / 10;
                i++;
            }
            for(int j=tab.size()-1;j>=0;j--)
            {
                tabReversed.add(tab.get(j));
            }
            for(int a=0;a<tabReversed.size();a++)
            {
                result+=tabReversed.get(a);
            }
            res = Integer.parseInt(result);
            System.out.println(res);
            return res;
        }
    }
    public static boolean isIsogram(String str)
    {
        boolean iso=false;
        if(str=="")
        {
            iso=true;
        }
        else
        {
            String string=str.toLowerCase();
            iso=true;
            char[] charArr=new char[str.length()];
        for(int i=0;i<str.length();i++)
        {
            charArr[i]=string.charAt(i);
            System.out.println(charArr[i]);
        }
        for(int i=0;i<charArr.length;i++)
        {
            for(int j=i+1;j<charArr.length;j++)
            {
                if(i!=j && charArr[j]==charArr[i])
                {
                    iso=false;
                    if(iso==false)
                        break;
                }
            }
        }
        }
        System.out.println(iso);
        return iso;
    }
}
