package basics;

class Teacher{
	protected String designation = "Teacher";
	protected String colleageName = "MGITER";
	
//	protected String getDesignation() {
//		return designation;
//	}
//
//	protected void setDesignation(String designation) {
//		this.designation = designation;
//	}
//
//	protected String getColleageName() {
//		return colleageName;
//	}
//
//	protected void setColleageName(String colleageName) {
//		this.colleageName = colleageName;
//	}

	void study(){
		System.out.println("Teaching");
	}

public Teacher(String designation, String colleageName) {
	this.designation = designation;
	this.colleageName = colleageName;
}

}

class physicsTeacher extends Teacher{
	public physicsTeacher(String designation, String colleageName) {
		super(designation, colleageName);
		// TODO Auto-generated constructor stub
	}

	String mainSubject = "Physics";


	public String check(){
		if(designation.equals("Teacher") && colleageName.equals("MGITER")){
			return "Proper Colleage";
		}else
			return "not Proper";
	}


	@Override
	public String toString() {
		return "physicsTeacher [mainSubject=" + mainSubject + ", designation=" + designation + ", colleageName="
				+ colleageName + ", check()=" + check() + "]";
	}
	
	public void run() {
		//System.out.println("Colleage running");
		System.out.println(toString());
	}

}


public class parent_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		physicsTeacher pt = new physicsTeacher("Teacher","MGITER");
//		System.out.println(pt.colleageName);
//		System.out.println(pt.designation);
//		System.out.println(pt.mainSubject);
//		System.out.println(pt.getDesignation());
//		System.out.println(pt.getColleageName());
//		pt.study();
//		System.out.println(pt.check());
//		System.out.println(pt);
		pt.run();
		
	}

}
