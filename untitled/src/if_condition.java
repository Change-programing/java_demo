public class if_condition
{
    public static void main(String[] args) {
        int num=-10;
        if (num>0)
        {
            System.out.println("this is num>0");
        }
        else  if (num>0 && num<10)
        {
            System.out.println("num>0 and num<10");
        }
        else if (num<0)
        {
            System.out.println("num<0");
        }
        else
        {
            System.out.println("皆不成立");
        }
    }
}
