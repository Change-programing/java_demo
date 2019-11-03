//public 表示公開的
//class表示定義一個類
//HelloWorld表示一個類名


public class HelloWorld {  //表示定義一個公開的類,起名HelloWorld


    //類體中不允許直接編寫java語句[除聲明變量之外]
    //類體[記住]
    /*
        public表示公開的
        static表示靜態的
        void表示空
        main表示方法名是main
        (String[] args) 是一個main方法的形式參數列表

        需要記住的是:
            以下的方法是一個程序的"主方法",是程序的執行入口
            是SUN公司規定的,固定編寫方式
     */

    public static void main(String[] args) { //表示定義一個公開的靜態的主方法

        //方法體
        //方法體
        //方法體
        //方法體


        //java語句[java語句以";"終止,分號必須是半形分號]
        //先記住:以下這樣的代碼的作用是向控制台輸出一段消息
        //以下的雙引號必須是半形的雙引號[是java語法的一部分]
        //java中所有的'字符串'都使用雙引號括起來
        System.out.println("Hello World!");

        //再向控制台輸出消息
        System.out.println("Hello Change!");

        //輸出中文
        System.out.println("你好,阿智!");

        //輸出中文[提醒:以下程序員兩邊的雙引號是'全形的',這裡的雙引號不是java語法的一部分,這裡的全形雙引號只是一個普通的字符串]
        System.out.println("我是一個'程序員'");

    }
}