public class Test {
    public static void main(String[] args) {
        Student stu = new Student(1,"赵四",81,99,90);
        double sum = stu.sum();
        double avg = stu.avg();
        double high = stu.high();
        double low = stu.low();

        System.out.println();
        stu.low("Test");
        System.out.println();

        System.out.println("总分："+sum+"\n平均分："+avg+"\n最高分:"+high+"\n最低分："+low);
    }
}
