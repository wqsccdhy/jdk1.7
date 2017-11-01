package test;

import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

public class Test {

	public static void main(String[] args) throws Exception {
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "22");
		
		ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<String, String>();
		
		LinkedBlockingQueue<String> linkedBlockingQueue = new LinkedBlockingQueue<String>(2);
		ArrayBlockingQueue<String> arrayBlockingQueue  = new ArrayBlockingQueue<String>(10);
		
		test001();
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		Date date = new Date();
		try {
			date = ts;
			System.out.println(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");        
		String bDate = "2017-3-16"; 
		String eDate = "2017-3-20"; 
		Date startDate = format1.parse(bDate); 
		Date endDate = format1.parse(eDate); 
		int dutyDays = getDutyDays(startDate, endDate);
		System.out.println(dutyDays);
	}
	
	public static int getDutyDays(java.util.Date startDate,
			java.util.Date endDate) {
		int result = 0;
		java.text.SimpleDateFormat df = new java.text.SimpleDateFormat(
				"yyyy-MM-dd");
		while (startDate.compareTo(endDate) <= 0) {
			if (startDate.getDay() != 6 && startDate.getDay() != 0){
				result++;
			}
				
			startDate.setDate(startDate.getDate() + 1);
		}
		return result;
	}
	
	public static boolean test001() throws UnsupportedEncodingException{
		String a = "名";
        System.out.println("UTF-8编码长度:"+a.getBytes("UTF-8").length);
        System.out.println("GBK编码长度:"+a.getBytes("GBK").length);
        System.out.println("GB2312编码长度:"+a.getBytes("GB2312").length);
        System.out.println("==========================================");
        int  x = 1; 
        //x==1本来就是boolean类型的 故而后面是多余的
        return x==1?true:false;  
	}

}
