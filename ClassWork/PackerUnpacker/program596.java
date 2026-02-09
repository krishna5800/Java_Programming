class progarm596
{
    public static void main(String A[]) throws Exception
    {
        String str = "Marvellous     ";

        System.out.println("Data : " + str);
        System.out.println("Length : " + str.length());

        str = str.trim();       // Removes all white spaces from last of string

        System.out.println("Data : " + str);
        System.out.println("Length : " + str.length());
    }
}