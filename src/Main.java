

public class Main {
    public static void main(String[] args) {
        System.out.println("\nробота першого метода\n");
        int a,b;
        int [] arr=new int[3];
        a=5;
        b=4;
        Actions.mathematicAction(arr,a,b);// виклик без вийнятком

        b=0;
        Actions.mathematicAction(arr,a,b);// виклик з вийнятком ArithmeticException

        b=3;
        arr=new int[0];
        Actions.mathematicAction(arr,a,b);// виклик з вийнятком IndexOutOfBoundsException
        System.out.println("\nробота другого метода\n");

        String str="sepip";
        Actions.showAction(str);// виклик без вийнятків

        str=null;
        Actions.showAction(str);// виклик з вийнятками NullPointerException у внутрішньому Try Catch блоці і NullPointerException у зовнішньому блоці

        System.out.println("\nробота третього метода\n");

        String[] array=new String[4];
        str="wpev";
        Actions.initiateParameterAction(array,str,2);// виклик без вийнятків
        Actions.initiateParameterAction(array,str,7);// виклик з вийнятком IndexOutOfBoundsException

    }
}