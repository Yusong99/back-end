import javax.swing.*;
import java.awt.*;

public class GameJframe extends JFrame {
    // JFrame 界面，窗体
    // 子类也表示界面窗体
    // 以后游戏相关的所有逻辑都写在这个类

    public GameJframe() throws HeadlessException {
        // 设置界面的宽高
        this.setSize(400, 400);
        // 标题
        this.setTitle("title");
        // 设置界面置顶
        this.setAlwaysOnTop(true);
        // set in the center
        this.setLocationRelativeTo(null);
        // set how to close the app
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 可见性
        this.setVisible(true);

        // init menu
        JMenuBar jMenuBar = new JMenuBar();
        // 创建菜单的选项
        JMenu functionJMenu = new JMenu("function");
        JMenu aboutJMenu = new JMenu("about us");

    }
}
