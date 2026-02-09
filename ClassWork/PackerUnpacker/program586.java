class progarm586
{
    public static void main(String A[]) throws Exception
    {
        int No = 21;
        int Ans = 0;

        Ans = No^11;
        System.out.println("Encrypted Data is : " + Ans);

        Ans = Ans^11;
        System.out.println("Decrypted Data is : " + Ans);
    }
}