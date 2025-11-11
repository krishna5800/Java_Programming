// Write a program to calculate the power of number using loop.

class Logic
{
    int calculatePower(int iNo1, int iNo2)
    {
        int i = 0;
        int iPower = 1;

        for(i = 1; i <= iNo2; i++)
        {
            iPower = iNo1*iPower;
        }

        return iPower;
    }
}

class program19_5
{
    public static void main(String A[])
    {
        int iRet = 0;

        Logic lobj = new Logic();
        iRet = lobj.calculatePower(2,5);

        System.out.println(iRet);
    }
}


// OR

// import java.math.*;

// class Logic
// {
//     double calculatePower(double dNo1, double dNo2)
//     {
//         double dPower = 0.0f;

//         dPower = Math.pow(dNo1, dNo2);

//         return dPower;
//     }
// }

// class program19_5
// {
//     public static void main(String A[])
//     {
//         double dRet = 0.0f;

//         Logic lobj = new Logic();
//         dRet = lobj.calculatePower(2.0,5.0);

//         System.out.println(dRet);
//     }
// }