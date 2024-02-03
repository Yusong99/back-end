package InetAddressdemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyInetAddressDemoi
{
    /*
    * InetAddress getByName 确定主机名称的IP地址，主机名称可以是机器 名称也可以是IP地址
    * getHostName 获取此IP地址的主机名
    * getHostAddress 返回文本显示中的IP地址字符串*/
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("172.0.0.1");
        System.out.println(address);
    }
}
