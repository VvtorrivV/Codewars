import java.awt.List;
import java.io.*;
import java.lang.*;
import java.lang.reflect.Array;
import java.util.*;

public class Kata7kyu
{
    public static int nbYear(int p0, double percent, int aug, int p)
    {
        int numberOfYears=0;
        while (p0<p)
        {
            p0+=p0*percent/100+aug;
            numberOfYears++;
        }
        return numberOfYears;
    }
    public static String decode(String string)
    {
        char[] code=new char[string.length()];
        for(int i=0;i<string.length();i++)
        {
            code[i]=string.charAt(i);
        }
        string="";
        System.out.println(string);
        for(int i=0;i<code.length;i++)
        {
            if(code[i]==0)
                string+="5";
            else if(code[i]==1)
                string+="9";
            else if(code[i]==2)
                string+="8";
            else if(code[i]==3)
                string+="7";
            else if(code[i]==4)
                string+="6";
            else if(code[i]==5)
                string+="0";
            else if(code[i]==6)
                string+="4";
            else if(code[i]==7)
                string+="3";
            else if(code[i]==8)
                string+="2";
            else if(code[i]==9)
                string+="1";
        }
        string=code.toString();
        for(int i=0;i<code.length;i++)
        {
            System.out.print(string);
        }
        return string;
        //your code here
    }

    public static long overTheRoad(long address, long n) {
        ArrayList<Long> leftSideOfStreet=new ArrayList<Long>();
        ArrayList<Long> rightSideOfStreet=new ArrayList<Long>();

        for(int i=1;i<=n*2;i++)
        {
            if(i%2==0)
            {
               rightSideOfStreet.add((long) i);
            }
            else {
                leftSideOfStreet.add((long) i);
            }
        }
        Collections.sort(leftSideOfStreet,Collections.reverseOrder());
        System.out.println("Right side: "+rightSideOfStreet);
        System.out.println("Left side: "+leftSideOfStreet);
        if(address%2==0)
        {
            int indexOfAddress = rightSideOfStreet.indexOf(address);
            return leftSideOfStreet.get(indexOfAddress);
        }
        else
        {
            int indexOfAddress=leftSideOfStreet.indexOf(address);
            return rightSideOfStreet.get(indexOfAddress);
        }
    }
    public static void main(String[] args)
    {
        //overTheRoad(1,3);
        //decode("4102204351");
    }
}
