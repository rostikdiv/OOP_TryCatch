import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Actions {
    static void mathematicAction(int [] arr,int numeric1,int numeric2){
        int sum=0;
        try{
            sum=numeric1/numeric2; // можлива генерація помилки ArithmeticException
            arr[1]=sum; //можлива генерація помилки IndexOutOfBoundsException
        } catch (ArithmeticException e){
            System.out.println("обробка ArithmeticException: " + e.getMessage());
        } catch (IndexOutOfBoundsException c){
            System.out.println("обробка IndexOutOfBoundsException: " + c.getMessage());
        }
    }
    static void showAction(String str){
        try {
            try {
                System.out.println("кількість елементів у списку "+str.length()); // можлива генерація NullPointerException
            } catch (NullPointerException e) {
                System.out.println("внутрішня обробка NullPointerException: " + e.getMessage());
            }
            char[] ch=str.toCharArray();
            System.out.println("перший елемент списку "+ch[0]);
        } catch (NullPointerException e) {
            System.out.println("обробка NullPointerException: " + e.getMessage());
        }

    }

    static void initiateParameterAction(String []arr,String str, int number){
        try{
           arr[number]=str;
        }catch (IndexOutOfBoundsException e){
            System.out.println("обробка IndexOutOfBoundsException:" +e.getMessage());
        }
        finally {
            System.out.println("робота блоку завершена");
        }
    }


}
