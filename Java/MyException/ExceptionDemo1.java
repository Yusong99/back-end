package MyException;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        try {
            String[] arr = new String[3];
            System.out.println(arr[3]);
            // 此处出现了异常，程序就会在这里创建一个ArrayIndexOutOfBoundsException对象
            // new ArrayIndexOutOfBoundsException()
            // 拿着这个对象到catch的小括号中对比，看括号中的变量是否可以接收这个对象
            // 当catch里面所有的代码执行完毕，继续执行try...catch体系下面的其他代码
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("索引越界了");
        }
    }
}