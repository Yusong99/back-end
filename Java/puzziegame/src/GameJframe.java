import javax.swing.*;
import java.awt.*;

public class GameJframe extends JFrame {
    // JFrame 界面，窗体
    // 子类也表示界面窗体
    // 以后游戏相关的所有逻辑都写在这个类

    public GameJframe() throws HeadlessException {
        // ctrl + alt + m
        initFrame();
        initMenu();
        // 让界面显示出来，建议写在后面
        this.setVisible(true);
    }

    private void initMenu() {
        // init menu
        JMenuBar jMenuBar = new JMenuBar();
        // 创建菜单的选项
        JMenu functionJMenu = new JMenu("function");
        JMenu aboutJMenu = new JMenu("about us");

        // 创建选项下面的条目对象
        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登陆");
        JMenuItem closeItem = new JMenuItem("关闭游戏");

        JMenuItem accountItem = new JMenuItem("公众号");

        // 将每一个选项下面的条目添加到选项中
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);
        aboutJMenu.add(accountItem);

        // 将菜单里面的两个选项添加到菜单中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        // 给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initFrame() {
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
    }
}
