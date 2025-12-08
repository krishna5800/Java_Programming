// Write a program which accepts a string from user and check it contains vowel or not.

import java.util.*;

class Test 
{
    boolean Difference(String str)
    {
        char Arr[] = str.toCharArray(); 
        int iCnt  = 0; 
        boolean bAns =  false;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)       
        {
            if(Arr[iCnt] == 'A' ||Arr[iCnt] == 'E' ||Arr[iCnt] == 'I' ||Arr[iCnt] == 'O' ||Arr[iCnt] == 'U' ||
           Arr[iCnt] == 'a' ||Arr[iCnt] == 'e' ||Arr[iCnt] == 'i' ||Arr[iCnt] == 'o' ||Arr[iCnt] == 'u')
            {
                bAns = true;
                break;
            }
        }

        return bAns;
    }
}

class program35_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet = false;

        System.out.println("Enter String : ");
        String Arr = sobj.nextLine();

        Test tobj = new Test();

        bRet = tobj.Difference(Arr);

        if(bRet == true)
        {
            System.out.println("It has Vowels");
        }
        else
        {
            System.out.println("It has no Vowels");
        }
    }
}