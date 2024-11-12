package interfaceimplemantation;

public class Student implements BeACoder {

	private int sid;
	private String sname;
	
	public void practice()
	{
		System.out.println("Morning wakeup time:"+morning_wakeup_time);
		System.out.println("Working in core java atleast 2 hrs..");
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
	
}
