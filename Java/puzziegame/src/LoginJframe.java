import javax.swing.*;
import java.awt.*;

public class LoginJframe extends JFrame {
    public LoginJframe() throws HeadlessException {
        // 在创建界面的时候就写入宽高等
        this.setSize(300,300);
        this.setTitle("Login");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
