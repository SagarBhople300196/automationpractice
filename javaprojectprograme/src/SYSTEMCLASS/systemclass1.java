package SYSTEMCLASS;

public class systemclass1 {

	public static void main(String[] args) {
		System.out.println("system user direction "+System.getProperty("user.home"));
		System.out.println("current working direction "+System.getProperty("user.dir"));
		System.out.println("************************************");
		System.clearProperty("user.home");
		System.out.println("system user direction  :"+System.getProperty("user.home"));
		System.out.println("************************************");
		System.setProperty("user.home", "F:\\GitAutomation\\morningbatch1");
		System.out.println("updated system user direction  :"+System.getProperty("user.home"));
		System.out.println("************************************");
		System.setProperty("user.country","IND");
		System.out.println(System.getProperty("user.country"));
		System.out.println("other than system property :"+System.getProperty("user.password","none of your business"));
		System.out.println("difference between the current time and midnight, January 1, 1970 UTC is: "
				+ System.currentTimeMillis());
		System.out.println("current time in " + "nano sec: " + System.nanoTime());
	}

}
