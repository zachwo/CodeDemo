package StudentDemo;

import java.util.Scanner;

public class Input {

	private Scanner scan;
	public Input(Scanner scan){
		this.scan=scan;
	}
	public String getString(String info){
		System.out.println(info);
		String str = scan.nextLine();
		return str;
	}
	public int getInt(String info,String error){
		String str = getString(info);
		while(!str.matches("\\d+")){
			System.out.println(error);
			str = getString(info);
		}
		int number = Integer.parseInt(str);
		return number;
		
		
	}
	public int getAge(String info,String error){
		String str = getString(info);
		boolean flag = true;
		int number = 0;
		while(flag){
			while(!str.matches("\\d+")){
				System.out.println(error);
				str = getString(info);
			}
			number = Integer.parseInt(str);
			if(number>=17&&number<=23){
				flag=false;
			}else{
				System.out.println(error);
				str = getString(info);
			}
		}
		
		
		return number;
		
		
	}
	public String getSex(String info,String error){
		System.out.println(info);
		String str = scan.nextLine();
		while(!str.matches("[男女]")){
			System.out.println(error);
			str = scan.nextLine();
		}
		return str;
	}
	
}
