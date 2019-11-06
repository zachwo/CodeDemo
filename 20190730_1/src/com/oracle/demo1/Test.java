package com.oracle.demo1;

import com.sun.jdi.ObjectReference;

import java.io.*;

public class Test {
    public static void main(String[] args) {
//    per.setName("李四");
//    per.setAge(19);
    //Person per = new Person("王五",20);
    //writePerson(per);
    readPerson();
    }

    /**
     * 对象的写出
     * @param per
     */
    public static void writePerson(Person per){
        ObjectOutputStream oos = null;
        //往一个文件里输出
        try {
            oos = new ObjectOutputStream(new FileOutputStream(new File(File.separator+"Users"+ File.separator+"wangze"+File.separator+"a.txt")));
            oos.writeObject(per);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(oos!=null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 对象的读取
     */
    public static void readPerson(){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(File.separator+"Users"+ File.separator+"wangze"+File.separator+"a.txt"));
            Person per = (Person)ois.readObject();
            System.out.println(per.getName()+","+per.getAge());
        } catch (FileNotFoundException e){
           e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(ois != null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
//Users/wangze/OneDrive/甲骨文oracle/20190730-对象序列化/20190730-1