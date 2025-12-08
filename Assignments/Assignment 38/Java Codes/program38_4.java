// 4. Write a program which accept string from user and copy that characters of that 
// string into another string by converting all capital characters into small case.

// Input: "Marvellous Python 2"

// Output: "marvellous python 2"

class Test
{
    String StrCpySmall(String str)
    {
        char Arr[] = str.toCharArray();
        int iCnt = 0, iBrr = 0;
        char temp = '\0';

        char Brr[] = new char[Arr.length];

        for(iCnt = 0, iBrr = 0; iCnt < Arr.length; iCnt++, iBrr++)
        {
            if(Arr[iCnt] >= 'A' && Arr[iCnt] <= 'Z')
            {
                Brr[iBrr] = (char)(Arr[iCnt]+32);
            }
            else
            {
                Brr[iBrr] = Arr[iCnt];
            }
        }

        return new String(Brr);
    }
}

class program38_4
{
    public static void main(String A[])
    {
        String Arr = "Marvellous Python 2";

        String Brr = null;

        Test tobj = new Test();

        Brr = tobj.StrCpySmall(Arr);

        System.out.println(Brr);
    }
}