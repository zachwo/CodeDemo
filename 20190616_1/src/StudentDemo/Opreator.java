package StudentDemo;

import java.util.Scanner;

public class Opreator {
	private Input in = null;
	private boolean flag=true;
	private StudentOpreator so = null;
	public Opreator(){
		in = new Input(new Scanner(System.in));
		so = new StudentOpreator();
	}
	public void opreator(){
		while(flag){
			Menu.show();
			int n = in.getInt("请选择您要执行的操作：", "输入的选项的格式不正确，选项的格式应该是整数");
			switch(n){
				case 1:
					int id = in.getInt("请输入学号：", "学号的格式不正确");
					String name = in.getString("请输入姓名:");
					int age = in.getAge("请输入年龄", "年龄的格式不正确,或者是年龄的方位不正确");
					String sex = in.getSex("请输入性别:","性别的格式不正确");
					Student stu = new Student(id,name,age,sex);
					so.add(stu);
					break;
				case 2:
					Student[] stus = so.getStus();
					if(stus.length==0){
						System.out.println("当前没有学生存在");
						break;
					}
					for(Student s:stus){
						System.out.println(s);
					}
					int updateId = in.getInt("请输入要修改的学生的学号：", "学号的格式不正确");
					Student updateStu = so.getStuById(updateId);
					if(updateStu==null){
						System.out.println("学号不存在");

					}else{
						String updateName = in.getString("请输入姓名:");
						int updateAge = in.getAge("请输入年龄", "年龄的格式不正确,或者是年龄的方位不正确");
						String updateSex = in.getSex("请输入性别:","性别的格式不正确");
						updateStu = new Student(updateId,updateName,updateAge,updateSex);
						so.update(updateStu);
					}
					break;
				case 3:
					Student[] deleteStus = so.getStus();
					if(deleteStus.length==0){
						System.out.println("当前没有学生存在");
						break;
					}
					for(Student s:deleteStus){
						System.out.println(s);
					}
					int deleteId = in.getInt("请输入要删除的学生的学号：", "学号的格式不正确");
					Student deleteStu = so.getStuById(deleteId);
					if(deleteStu==null){
						System.out.println("学号不存在");

					}else{
						so.delete(deleteId);
					}
					break;
				case 4:
					Student[] StusAll = so.getStus();
					if(StusAll.length==0){
						System.out.println("当前没有学生存在");
						break;
					}
					for(Student s:StusAll){
						System.out.println(s);
					}
					break;
				case 5:
					int selectId = in.getInt("请输入要查询的学生的学号：", "学号的格式不正确");
					Student selectStu = so.getStuById(selectId);
					if(selectStu==null){
						System.out.println("当前学生不存在");
					}else{
						System.out.println(selectStu);
					}
					break;
				case 6:
					flag=false;
					System.out.println("程序退出");
					break;
				default:
					System.out.println("当前没有此选项，请重新选择");
					break;

			}

		}

	}
}
