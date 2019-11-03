import java.util.Scanner;

public class scanner
{
    public static void main(String[] args)
    {
        String month ;

        Scanner input = new Scanner(System.in);
        System.out.println("輸入一個月份");
        month = input.next();//input 輸入下一個東西

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
                System.out.println("輸入錯誤的月份");
        }
    }
}
