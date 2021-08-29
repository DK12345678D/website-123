public class arr_11
{
    // string compersion
    public static void main(String[] args) 
    {
        String s1 = "kod";
        String s2 = "nest";
        String s3 = "kod" + "nest";
        String s4 = "kod" + "nest";
        String s5 = s1 + s2;
        String s6 = s1 + s2;
        if (s1 == s2)
        {
            System.out.print(" refir arr egual");
        }
        else 
        {
            System.out.print(" unegual");
        }
        System.out.println(" ");
        if (s3==(s4))
        {
            System.out.print("string are egual");
        } 
        else 
        {
            System.out.print("string are unegual");
        }
        System.out.println(" ");
        if (s5==(s6))
        {
            System.out.print("string are egual");
        }
        else
        {
            System.out.print("string are unegual");
        }
    }
}
