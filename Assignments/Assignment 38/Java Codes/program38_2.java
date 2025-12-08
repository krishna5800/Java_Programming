// 2. Write a program which accept string from user and copy that characters of that string 
// into another string by removing all white spaces.

// Input:   "Marvel lous Pyth on"
// Output:  MarvellousPython

class Test
{
    String StrCpyX(String str)
    {
        char Arr[] = str.toCharArray();
        int iCnt = 0, iBrr = 0;
        char temp = '\0';

        char Brr[] = new char[Arr.length];

        for(iCnt = 0, iBrr = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] != ' ')
            {
                Brr[iBrr] = Arr[iCnt];
                iBrr++;
            }
        }

        return new String(Brr);
    }
}

class program38_2
{
    public static void main(String A[])
    {
        String Arr = "Marvel lous Pyth on";

        String Brr = null;

        Test tobj = new Test();

        Brr = tobj.StrCpyX(Arr);

        System.out.println(Brr);
    }
}