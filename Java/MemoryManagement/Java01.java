package MemoryManagement;

public class Java01 {
    public static void main(String[] args) {// 栈内存
        // 栈：方法运行时的内存，比如main方法运行，进入方法栈中执行
        // 堆：存储对象或者数组，new来创建，都存储在堆内存中
        // 方法区：存储可以运行的class文件
        int[] arr = new int[2]; // 堆内存，变量在栈内存中储地址
        System.out.println(arr); // 数组在堆内存的中地址
        System.out.println(arr[0]);
        arr[0] = 11; // 将数组第一个值赋值为11（堆内存）

        int[] arr2 = new int[2];
        System.out.println(arr2);

        //总结：只要是new出来的一定是在堆里面开辟了一个小空间（有地址值）
        //     如果多次new，那么在堆里面有多个小空间，每个小空间中都有各自的数据

        // 两个数组指向同一个空间的内存图
        int[] arr1 = {11, 22};
        int[] arr3 = arr1;
        System.out.println(arr1[0]);
        System.out.println(arr3[0]);
        /*
        * 当两个数组指向同一个小空间时，其中一个数组对小空间中的值发生了改变，那么其他数组再次访问的时候
        * 都是修改之后的结果了*/
    }
}
