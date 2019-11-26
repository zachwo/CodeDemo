package com.oracle.task4;

/**
 * 4.假设一个银行的ATM机，它可以允许用户存款也可以取款。现在一个账户上有存款200元，用户A和用户B都拥有在这个账户上存款和取款的权利。用户A将存入100元，而用户B将取出50元，那么最后账户的存款应是250元。实际操作过程如下：
 * 	(1) 先进行A的存款操作：
 * 		1)	得到账户的存款数额200，耗时2s。
 * 		2)	将账户数额增加100，耗时忽略不计
 * 		3)	将新生成的账户结果300返回到ATM机的服务器上，耗时2s
 * 	(2) 再进行B的取款操作：
 * 		4)	得到增加后账户存款数额300，耗时2s。
 */
public class Test {
    public static void main(String[] args) {
        Account account = new Account(200);
        ATM atm = new ATM(account);
        PersonA a = new PersonA(atm);
        PersonB b = new PersonB(atm);

        Thread ta = new Thread(a);
        Thread tb = new Thread(b);

        ta.start();
        try {
            ta.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tb.start();
        try {
            tb.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
