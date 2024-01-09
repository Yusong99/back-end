package APIs;

// 如果一个接口里面没有抽象方法，表示当前的接口是一个标记性接口
// 现在cleanable表示一旦实现来那么当前类的对象就可以被克隆
public class CloneDemo1 implements Cloneable{
    private int id;
    private String username;
    private String password;
    private String path;

    public CloneDemo1(){};

    public String toString() {
        return id + username + password + path;
    }
    public CloneDemo1(int id, String username, String password, String path){
        this.id = id;
        this.username = username;
        this.password = password;
        this.path = path;
    };

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
