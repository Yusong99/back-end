package ObjectOriented.HeiMa;

public class Java02 {
    public static void main(String[] args) {
        GirlFriend flx = new GirlFriend("flx");
        System.out.println(flx.getName());
        flx.setName("flx01");
        System.out.println(flx.getName());
    }
}

class GirlFriend {
    private String name;
    GirlFriend(String name) {
        this.name = name;
    }
    // 对于每一个私有化的成员变量，都要提供get和set方法
    // set方法: 给成员变量赋值
    // get方法: 对外提供成员变量的值

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
