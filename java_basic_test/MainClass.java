package java_basic_test;

import custommer.java.bank.bank;
public class MainClass {
	public static void main(String[] args) {
		bank jeonbank = new bank("������");
		bank parkbank = new bank("���Ѽ�");
		
		jeonbank.per_saveMoney(100);
		parkbank.per_saveMoney(200);
		
		jeonbank.share_saveMoney(10000);
		parkbank.share_saveMoney(50000);
		
		
		jeonbank.per_info();
		parkbank.per_info();
		
		jeonbank.share_info();
		parkbank.share_info();
		
		jeonbank.share_spendMoney(10000);
		jeonbank.share_info();
		parkbank.share_info();		
	}
}
