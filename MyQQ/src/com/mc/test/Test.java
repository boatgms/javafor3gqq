package com.mc.test;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.List;

import com.mc.domain.Friend;
import com.mc.domain.Group;
/**
 * 3GQQ���Ե�һ��СDemo
 * @author Shine_MuShi
 */
public class Test {
	static final String url="http://pt.3g.qq.com/";
	static String ctype = "application/x-www-form-urlencoded;charset=utf-8" ;
	static String userAgent="Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US) AppleWebKit/525.13 (KHTML, like Gecko) Chrome/0.2.149.29 Safari/525.13";
	
	static HttpURLConnection conn=null;
	static String rsp=null;
	static OutputStream out = null;
	/**
	 * ���ȵ�½��
	 * Ȼ���ȡ������Ϣ��
	 * Ȼ����ݷ�����Ϣȡ���к���QQ�š�
	 * @param args
	 */
	public static void main(String[] args) {
		try {
		System.out.println("��ʼץȡ����");
		long a=System.currentTimeMillis();
		String sid=QQClient.login("", "");
		//System.out.println(sid);
//		List<Group> groupInfoList=QQClient.getFrendGroup(sid);
		//	QQClient.getFrindByGourp(groupInfoList);
//		List<String> firendList=QQClient.getFriendsFromGroup(groupInfoList);
//		long b=System.currentTimeMillis();
//		System.out.println("ץȡ����������ʱ"+(b-a)+" ��������"+firendList.size());
//		for(String qq:firendList){
//			System.out.println(qq);
//		}
//		if(firendList!=null&&firendList.size()!=0){
//			while(true){
//				
//			}
//		}
//			while(true){
//				QQClient.getMsg("",sid);
//			}
//		while(true){
//			QQClient.getRandomQQ();
//		}
		//QQClient.say("AaOA1KXemnXYtzTiHrqBzTLP", "test");
		while(true){
			QQClient.goOtherHome(sid);
		}
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
}