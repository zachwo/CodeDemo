import java.sql.SQLOutput;

public class Student {
    private int number;
    private String name;
    private double mathGrade;
    private double englishGrade;
    private double computerGrade;


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(double mathGrade) {
        this.mathGrade = mathGrade;
    }

    public double getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(double englishGrade) {
        this.englishGrade = englishGrade;
    }

    public double getComputerGrade() {
        return computerGrade;
    }

    public void setComputerGrade(double computerGrade) {
        this.computerGrade = computerGrade;
    }
    //规定以后只要写有参构造方法就同时再写一个无参构造方法
    public Student(){

    }

    public Student(int number,String name, double mathGrade, double englishGrade, double computerGrade){
        this.setName(name);
        this.setNumber(number);
        this.setMathGrade(mathGrade);
        this.setEnglishGrade(englishGrade);
        this.setComputerGrade(computerGrade);
    }

    public double sum(){
        return this.mathGrade + this.englishGrade + this.computerGrade;
    }
    public double avg(){
        //return (this.mathGrade+this.englishGrade+this.computerGrade)/3;
        return this.sum()/3;
    }
    public double high(){
        /*
        double high = this.mathGrade;
        if(this.englishGrade>high){
            high = this.englishGrade;
        }
        if(this.computerGrade>high){
            high = this.computerGrade;
        }*/
        double high = Math.max(this.mathGrade, this.englishGrade);
        high = Math.max(high,this.computerGrade);
        return high;
    }
    public double low(){
        /*
        double low = this.mathGrade;
        if(this.englishGrade<low){
            low = this.englishGrade;
        }
        if(this.computerGrade<low){
            low = this.computerGrade;
        }
        return low;
        */
        double low = Math.min(this.mathGrade, this.englishGrade);
        low = Math.min(low,this.computerGrade);
        return low;
    }




    public void low(String name){
        System.out.println("这是方法重载的一个测试方法,用以证明方法重载允许返回值不同,但前提是参数列表不同");
    }
}
