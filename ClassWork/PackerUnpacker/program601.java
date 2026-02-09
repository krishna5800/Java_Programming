class progarm601
{
    public static void main(String A[]) throws Exception
    {
        String str = "A.txt 10";

        String Arr[] = str.split(" ");

        System.out.println(Arr.length);

        for(int i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);         // Now 10 is string and 10 is also string weneed to convert it to int
        }
    }
}