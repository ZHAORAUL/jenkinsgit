package util;

public class GetUser {
	public static ProUtil prop=new ProUtil("loginuser.properties");
	public static String getUserName(String name) {
		String user=prop.getpro(name);
		return user.split(">")[0];
	}
	public static String getPassword(String name) {
		String user=prop.getpro(name);
		return user.split(">")[1];
	}
	
	/*
	 //测试
	public static void main(String[] args) {
		System.out.println(GetUser.getUserName("成都郫县犀浦")+GetUser.getPassword("成都郫县犀浦"));
	}
 */
}
