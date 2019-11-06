package StudentDemo;

public class StudentOpreator {

	private Student[] stus = null;
	private int index;
	public StudentOpreator(){
		stus = new Student[0];
		index=0;
	}
	public void add(Student stu){
		int id = stu.getId();
		Student s = getStuById(id);
		if(s==null){
			if(index>=stus.length){
				Student[] newStu = new Student[stus.length+1];
				for(int i=0;i<stus.length;i++){
					newStu[i] = stus[i];
				}
				newStu[newStu.length-1] = stu;
				index++;
				stus = newStu;
				
			}else{
				stus[index] = stu;
				index++;
			}
			
		}else{
			System.out.println("当前学号以存在");
		}
		
	}
	public void update(Student stu){
		int id = stu.getId();
		for(int i=0;i<stus.length;i++){
			if(stus[i].getId()==id){
				stus[i] = stu;
				break;
			}
			
		}
	}
	public void delete(int id){
		int deleteIndex=0;
		for(int i=0;i<stus.length;i++){
			if(stus[i].getId()==id){
				deleteIndex = i;
				break;
			}
		}
		Student[] newStu = new Student[stus.length-1];
		for(int i=0;i<stus.length;i++){
			if(i<deleteIndex){
				newStu[i] = stus[i];
			}else if(i>deleteIndex){
				newStu[i-1] = stus[i];
				
			}
			
		}
		stus = newStu;
		
	}
	public Student getStuById(int id){
		Student stu = null;
		for(Student s:stus){
			if(s.getId()==id){
				stu=s;
				break;
			}
		}
		return stu;
	}
	public Student[] getStus(){
		return stus;
	}
	
	
}
