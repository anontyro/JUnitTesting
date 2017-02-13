package main;

public class Student {
	
	private String name = "";
	private String grade = "";
	private int idNum;
	
	public Student(String name, String grade, int idNum){
		this.name = name;
		this.grade = grade;
		this.idNum = idNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getIdNum() {
		return idNum;
	}

	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + ", idNum=" + idNum + "]";
	}
	
	

}
