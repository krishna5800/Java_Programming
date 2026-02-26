import java.util.*;

class program800
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Amount = 0;

        float DiscountAmount = 0.0f;

        String Membership_Type = null;

        System.out.println("Enter purchase amount : ");
        Amount = sobj.nextInt();

        System.out.println("Enter type of membership : (Premium/Regular)");
        Membership_Type = sobj.next();

        if(Amount < 0 || 
                        ((Membership_Type.equalsIgnoreCase("Regular") == false) && 
                        (Membership_Type.equalsIgnoreCase("Premium") == false))
        )
        {
            System.out.println("Invalid Input");
            return;
        }

        if(Amount > 5000)           // 20%
        {
            DiscountAmount = (float)Amount * 0.80f;
        }
        else if(Amount > 2000)      // 10%
        {
            DiscountAmount = (float)Amount * 0.90f;
        }
        else                        // 0%
        {
            DiscountAmount = Amount;
        }

        if(Membership_Type.equals("Premium") == true)
        {
            DiscountAmount = DiscountAmount - (DiscountAmount * 0.05f);
        }

        System.out.println("Original Amount : " + Amount);
        System.out.println("Total Discount : " + (Amount-DiscountAmount));
        System.out.println("Final Payable Amount : " + DiscountAmount);
    }
}