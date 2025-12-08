// 1.Write a program which accept string from user and copy that characters of that string 
// in another string in reverse order.

// Input : "Marvellous Multi OS"

// Output: OS itluM suollevraM

class Test
{
    String StrCpyRev(String str)
    {
        char Arr[] = str.toCharArray();
        int iCnt = 0, iBrr = 0;
        char temp = '\0';

        char Brr[] = new char[Arr.length];

        for(iCnt = (Arr.length-1), iBrr = 0; iCnt >= 0; iCnt--, iBrr++)
        {
            Brr[iBrr] = Arr[iCnt];
        }

        return new String(Brr);
    }
}

class program38_1
{
    public static void main(String A[])
    {
        String Arr = "Marvellous Python";

        String Brr = null;

        Test tobj = new Test();

        Brr = tobj.StrCpyRev(Arr);

        System.out.println(Brr);
    }
}