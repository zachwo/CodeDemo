package com.oracle.international_Program;

        import java.text.MessageFormat;
        import java.util.Locale;
        import java.util.ResourceBundle;

public class Test {
    public static void main(String[] args) {
        //注意： properties文件一定要直接放在src文件夹下

        Locale china = new Locale("zh","CN");
        Locale america = new Locale("en","US");
        Locale france = new Locale("fr","FR");

        //ResourceBundle.getBundle内的参数会自动按照 "baseName_(locale对象内的)language_(locale对象内的)country"进行拼接寻找properties文件
        ResourceBundle rb1 = ResourceBundle.getBundle("message",china);
        //也可以直接放properties文件名：ResourceBundle rb1 = ResourceBundle.getBundle("message_zh_CN");
        String str1 =  rb1.getString("info");
        System.out.println("中文："+str1);
        //properties文件里的{0}为占位符，结合Message.format()方法实现动态处理文本
        System.out.println("中文："+MessageFormat.format(str1,"张三"));
        System.out.println();
        ResourceBundle rb2 = ResourceBundle.getBundle("message",america);
        String str2 =  rb2.getString("info");
        System.out.println("英文："+str2);
        System.out.println("英文："+MessageFormat.format(str2,"李四","一二三","ABC"));
        System.out.println();
        ResourceBundle rb3 = ResourceBundle.getBundle("message",france);
        String str3 =  rb3.getString("info");
        System.out.println("法文："+str3);
        System.out.println("法文："+MessageFormat.format(str3,"王武"));
    }
}
