
public class EducationInheritApp {

	public static void main(String[] args) {
		   Educated elev = new Educated("Cretu Gheorghe",(byte)12 ,7.55f, (byte)6);  
	       elev.printInfo();
	       Pupil p = new Pupil("Robu Daniel","College of Computer Science", (byte)12, 8.80f,(byte)18);
	       p.printInfo();
           Student student = new Student ("Soimu Alexandru","ASEM","Contability",(byte)5,(byte)25);
		   student.printInfo();
		   Master master = new Master("Medvedev Oleg","UTM","IT Specialist",(byte)30,(byte)3);
		   master.printInfo();
	}
}
class Educated{
    //Properties
	 String fullname;     
     byte   age;         
     float  average_grade; 
     byte   level;
	//constructor
    public Educated() {}
    public Educated(String fullname, byte age, float average_grade, byte level) {
		setFullname(fullname);
		setAge(age);
		setAverage_grade(average_grade);
		setLevel(level);
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public float getAverage_grade() {
		return average_grade;
	}
	public void setAverage_grade(float average_grade) {
		if(average_grade >=1.00f && average_grade <= 10.00f) {
			this.average_grade = average_grade;
		}else {
			System.err.println("Incorect average grade !");
		}
	}
	public byte getLevel() {
		return level;
	}
	public void setLevel(byte level) {
		this.level = level;
	}  
    public void printInfo() {
    	System.out.println("> Full Name: "+ getFullname()+ " ( " + getAge() + " years )");
        System.out.println("> Class: " + getLevel());
        System.out.println("> Grade: " + getAverage_grade());
    }
}
class Pupil extends Educated{
     
	private String school_name;
    private byte level;
    private byte age;
    
	public Pupil() {}
	public Pupil( String fullname ,String school_name, byte level, float average_grade, byte age) {
		setSchool_name(school_name);
		setLevel(level);
		setAge(age);
		setFullname(fullname);
		setAverage_grade(average_grade);
	}
	public String getSchool_name(){
		return school_name;
	}
	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}
	public byte getLevel() {
		return level;
	}
	public void setLevel(byte level) {
		if(level >= 1 && level <= 12) {
			this.level = level;
		}else {
			System.err.println("In the educational regime there was no such class !");
		}
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
	    if(age >= 6 && age<= 20) {
	    	this.age = age;
	    }else {
	    	System.err.println("The age of the pupil does not correspond !\n"
	    			                  + " Enter from 6 to 20 years !");	    
	    }
	}
    public void printInfo() {
    	System.out.println("______________________________________");
    	super.printInfo();
		System.out.println("> School Name: "+ getSchool_name());
		System.out.println("> Age: "+ getAge()+" years ");
		System.out.println("______________________________________");
	}
  }
class Student extends Pupil{
	
	private String university_name;
	private String speciality;
    private byte level;
    private byte age;
    
    public Student() {}
	public Student(String fullname ,String university_name, String speciality, byte level, byte age) {
	    setFullname(fullname);
		setUniversity_name(university_name);
		setSpeciality(speciality);
		setLevel(level);
		setAge(age);
	}
	public String getUniversity_name() {
		return university_name;
	}
	public void setUniversity_name(String university_name) {
		this.university_name = university_name;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public byte getLevel() {
		return level;
	}
	public void setLevel(byte level) {
		if(level >= 1 && level <=7) {
			this.level = level;
		}else {
			System.err.println("Such a course does not exist !\n"
					             +"Enter 1 to 7 please !");
		}
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		if(age >= 19 && age <= 30) {
			this.age = age;
		}else {
			System.err.println("Age does not correspond !\n"
					+ "Enter 19 to 30 years");
		}
	}
	public void printInfo() {
		System.out.println("> Full Name: "+ getFullname());
		System.out.println("> University Name: "+ getUniversity_name());
		System.out.println("> Speciality: "+ getSpeciality());
		System.out.println("> Course: "+ getLevel());
		System.out.println("> Age: "+ getAge() + " years");
		System.out.println("______________________________________");
	}
}
class Master extends Student{
	
	private byte level;
	private byte age;
	
	 public Master() {}
	 public Master(String fullName, String university_name, String speciality, byte age, byte level){
		 setFullname(fullName);
		 setUniversity_name(university_name);
		 setSpeciality(speciality);
		 setAge(age);
		 setLevel(level);
	 }
	public byte getLevel() {
		return level;
	}
	public void setLevel(byte level) {
		if(level >= 1 && level <= 3) {
			this.level = level;
		}else {
			System.err.println("Such a course does not exist !\n"
		             + "Enter 1 to 3 please !");
		}
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		if(age >=22 && age <= 33) {
			this.age = age;
		}else {
			System.err.println("Age does not correspond !\n"
					+ "Enter 22 to 33 years");
		}
	}
	public void printInfo() {
		super.printInfo();
	}
}

  