public class switch_demo
{
    public static void main(String[] args)
    {
        String month = "Jan";

        switch (month)
        {
            case "Jan":
                System.out.println("this is Jan");
                break;
            case "Feb":
                System.out.println("this is Feb");
                break;
            case "Mar":
                System.out.println("this is march");
                break;
            default:
                System.out.println("條件不成立");
        }
    }
}
