package util;

import java.util.Calendar;



public class WaybillNo {
	public static String setWaybillNo() {
		Calendar calendar=Calendar.getInstance(); //��ȡ��ǰ��ϵͳʱ��
		//��ȡ��
		int year=calendar.get(Calendar.YEAR);
		//��ȡ��
		int month=calendar.get(Calendar.MONTH)+1;
		//��ȡ��
		int day=calendar.get(Calendar.DAY_OF_MONTH);
		//��ȡʱ,24Сʱ��
		int hour=calendar.get(Calendar.HOUR_OF_DAY); 
		//��ȡ��
		int minute=calendar.get(Calendar.MINUTE);
		//��ȡ��
		int second=calendar.get(Calendar.SECOND);
		
		String waybillno="ZL"+year+month+day+hour+minute+second;
		System.out.println("���ţ�"+waybillno);
		return waybillno;
	}
	
	/*
	 //����setWaybillNo����
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
