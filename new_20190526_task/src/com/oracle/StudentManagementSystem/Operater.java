package com.oracle.StudentManagementSystem;

import java.util.Scanner;

public class Operater {
    private Add add;
    private Delete delete;
    private Modify modify;
    private Search search;
//    private StudentLibrary studentLibrary;
    private boolean flag = true;

    public Operater() {
        new MainMenu().show();
//        studentLibrary = new StudentLibrary();

        add = new Add();
        delete = new Delete();
        modify = new Modify();
        search = new Search();
    }

    public void choose() {
        while (flag){
            // 获取输入：
            try {
                System.out.println("请输入对应操作的数字：");
                Scanner scanner = new Scanner(System.in);
                String s = scanner.nextLine();
                int number = Integer.parseInt(s);

                // 选择
                if (number==1||number==2||number==3||number==4||number==5){
                    switch (number){
                        case 1:
                            add.action();
                            break;
                        case 2:
                            delete.action();
                            break;
                        case 3:
                            modify.action();
                            break;
                        case 4:
                            search.action();
                            break;
                        case 5:
                            System.out.println("程序关闭，欢迎下次使用");
                            flag = false;
                            break;
                    }
                }else{
                    System.out.println("无效输入，请重新操作");
                    this.choose();
                }
            }catch (NumberFormatException e){
                System.out.println("无效输入，请重新操作");
                this.choose();
            }
        }


    }


}
