package week3.day2;

public class Automation extends MultipleLanguage implements TestTool {
	public void java() {
		// TODO Auto-generated method stub
		System.out.println("java");
	}
	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("se");
		
	}

	void ruby() {
		// TODO Auto-generated method stub
		System.out.println("ruby");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation abs =new Automation();
		abs.selenium();
		abs.java();
		abs.ruby();
		abs.phython();
		
	}



}
