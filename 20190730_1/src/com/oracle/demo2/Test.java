package com.oracle.demo2;

import com.oracle.demo1.Person;
import com.sun.source.tree.CatchTree;

import javax.swing.plaf.synth.ColorType;
import java.io.*;

public class Test {
    public static void main(String[] args) {
        Student stu = new Student("张三",20);
        writeObject(stu);
        readObject();

    }
    public static void writeObject(Object per){
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(new File(File.separator+"Users"+File.separator+"wangze"+File.separator+"student.txt")));

            oos.writeObject(per);

        }  catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(oos != null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void readObject(){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(new File(File.separator+"Users"+File.separator+"wangze"+File.separator+"student.txt")));
            Object obj = ois.readObject();
            if(obj instanceof Person){
                Person per = (Person)obj;
                System.out.println(per.getName()+","+per.getAge());
            }else if(obj instanceof Student){
                Student stu = (Student) obj;
                System.out.println(stu.getName()+","+stu.getAge());
            }

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
