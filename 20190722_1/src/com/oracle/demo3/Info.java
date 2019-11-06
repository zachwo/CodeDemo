package com.oracle.demo3;

public class Info {
    private String title;
    private String content;

    private boolean flag=true;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 考虑如何解决重复拿取问题
     * 实现：生产者生产一个，消费者拿走一个
     * 想办法定义一个变量，这个变量代表当前应该进行的状态
     * 如果是生产者状态的情况下，就让生产者运行、消费者停止；如果切换到消费状态的情况下，就让生产者停止，消费者运行
     *
     * 解决方法：使用Object类中的wait()&notify方法 ——> 令指定的线程等待&唤醒等待的线程
     *
     * setInfo一旦被调用，则意味着生产者正在运行；getInfo被调用，则意味着消费者正在运行
     * 定义一个boolean类型的变量flag，默认值为true,true的时候就认为生产者正在运行
     *
     * 如果此时在调用setInfo的时候发现flag为flase,即本应消费者正在运行但实际为生产者正在运行，令生产者等待，从而消费者线程开始运行
     * 消费者运行结束之后，使用notify()方法唤醒正在等待的生产者线程
     * 在调用getInfo的时候发现flag为true同理
     *
     * 生产者生产结束应立即将flag设为flase，同理消费者消费结束应立即将flag设为true
     * @param content
     */
    public synchronized void setInfo(String title,String content){
//～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～//
        if(this.flag==false){   //表明此时应该是消费者正在运行，但实际为生产者正在运行
            try {
                super.wait();   //父类Object中的方法
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～//
        this.setTitle(title);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setContent(content);

//～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～//
        super.notify();
        flag = false;
//～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～//

    }

    public synchronized void getInfo(){
//～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～//
        if(this.flag==true){
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～//
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.getTitle()+": "+this.getContent());
//～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～//
        super.notify();//消费者运行结束后唤醒生产者线程
        flag = true;
//～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～～//
    }
}
