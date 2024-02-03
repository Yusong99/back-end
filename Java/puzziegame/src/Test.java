package puzziegame.src;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        // 创建一个游戏的主界面
        // JFrame 可以看做一个JavaBean类描述界面，有宽高两个属性，行为
        JFrame gameJframe = new JFrame();
        gameJframe.setSize(300, 300);
        gameJframe.setVisible(true);

        // 创建一个登陆界面
        JFrame loginJframe = new JFrame();
        loginJframe.setSize(300,300);
        loginJframe.setVisible(true);

        // 创建一个注册界面
        JFrame registerJframe = new JFrame();
        registerJframe.setSize(300, 300);
        registerJframe.setVisible(true);


    }
}
