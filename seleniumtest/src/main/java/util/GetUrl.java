package util;

public class GetUrl {
	public static ProUtil prop=new ProUtil("url.properties");
	public static String getUrl(String key) {
		return  prop.getpro(key);
	}
	/*
	 //���Ի�ȡurl
	 
	public static void main(String[] args) {
		GetUrl.getUrl("���Ե�¼");
	}
	*/
}