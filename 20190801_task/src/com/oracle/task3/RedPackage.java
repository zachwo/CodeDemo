package com.oracle.task3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class RedPackage {
    private double money;//红包金额
    private int peopleSum;//可抢红包人数
    private long deadline;//领取红包的截止日期
    private Random random;
    private  int current;//当前是第几个人抢红包
    private List<String[]> list;

    public RedPackage() {
    }

    public RedPackage(double money, int peopleSum) {
        this.money = money;
        this.peopleSum = peopleSum;
        current = 0;
        random = new Random();
        list = new ArrayList<>();
        deadline = System.currentTimeMillis()+24*60*60*1000;
    }

    public double getMoney() {
        return money;
    }
    public void setMoney(double money) {
        this.money = money;
    }
    public int getPeopleSum() {
        return peopleSum;
    }
    public void setPeopleSum(int peopleSum) {
        this.peopleSum = peopleSum;
    }
    public long getDeadline() {
        return deadline;
    }
    public void setDeadline(long deadline) {
        this.deadline = deadline;
    }
    public Random getRandom() {
        return random;
    }
    public void setRandom(Random random) {
        this.random = random;
    }
    public int getCurrent() {
        return current;
    }
    public void setCurrent(int current) {
        this.current = current;
    }

    /**
     * 打开红包
     * @param username 抢红包的人
     */
    public void open(String username){
        if (current<=peopleSum){
            long t = System.currentTimeMillis();
            if (t>=deadline){
                System.out.println("红包已过期");
                return;
            }else{
                //定义一个变量代表随机的钱数，需要确保每一个人至少能够抢到一分钱
                double m = 0.01;
                if (current<peopleSum){
                    if (current<peopleSum/4){
                        while (true){
                            m =Math.random()*(money-(peopleSum-current)*0.01)/10;
                            if (m>0){
                                break;
                            }
                        }
                    }else if(current>=peopleSum/4&&current<=peopleSum/2){
                        while (true){
                            m =Math.random()*(money-(peopleSum-current)*0.01)/6;
                            if (m>0){
                                break;
                            }
                        }
                    }else{
                        while (true){
                            m =Math.random()*(money-(peopleSum-current)*0.01)/4;
                            if (m>0){
                                break;
                            }
                        }
                    }
                    String s = m+"";
                    s = s.substring(0,s.indexOf(".")+3);//截取小数点后两位的钱数
                    m = Double.parseDouble(s);
                    if(m==0){
                        m=0.01;
                    }
                    money-=m;
                }else {
                    m = money;
                    String s = m+"";
                    s = s.substring(0,s.indexOf(".")+3);//截取小数点后两位的钱数
                    m = Double.parseDouble(s);
                }
                System.out.println("获取的钱数："+m);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String time = sdf.format(new Date());
                String[] strs = {username,m+"",time};
                list.add(strs);
                current++;
            }
        }else {
            System.out.println("手快有手慢无，红包已被抢光");
        }
        System.out.println("红包获取列表：");
        for (String[] s:list){
            System.out.println("用户名:"+s[0]+"\t获取的金额："+s[1]+"\t获取时间"+s[2]);
        }

    }
}
