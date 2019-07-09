package util;

import java.util.Calendar;



public class WaybillNo {
	public static String setWaybillNo() {
		Calendar calendar=Calendar.getInstance(); //获取当前的系统时间
		//获取年
		int year=calendar.get(Calendar.YEAR);
		//获取月
		int month=calendar.get(Calendar.MONTH)+1;
		//获取日
		int day=calendar.get(Calendar.DAY_OF_MONTH);
		//获取时,24小时制
		int hour=calendar.get(Calendar.HOUR_OF_DAY); 
		//获取分
		int minute=calendar.get(Calendar.MINUTE);
		//获取秒
		int second=calendar.get(Calendar.SECOND);
		
		String waybillno="ZL"+year+month+day+hour+minute+second;
		System.out.println("单号："+waybillno);
		return waybillno;
	}
	
	/*
	 //测试setWaybillNo方法
	public static void main(String[] args) {
		WaybillNo.setWaybillNo();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WaybillNo.setWaybillNo();
	}
	 */
}
