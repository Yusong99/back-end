package ObjectOriented.HeiMa.ExtendDemo;

public class Java03 {
    public static void main(String[] args) {
        // 父类方法不满足子类需求就需要进行方法的重写
        // 使用@Override注解，类似注释
        // 方法的重写本质就是覆盖了虚方法表中的方法
        // 重写方法的名称、形参列表必须与父类中的一致
        // 子类重写父类方法时，访问权限必须大于等于父类
        // 返回值类型子类必须小于等于父类
        // 私有方法，静态方法不能被重写
        Erz e = new Erz();
    }
}
class Father{
    void fn(){
        System.out.println(1);
    }
}
class Erz extends Father{
    @Override
    void fn() {
        super.fn(); // 直接调用父类的方法，表示是在父类的基础上添加
        // 如果不需要父类的方法就直接不写
        System.out.println(2);
    }
}
