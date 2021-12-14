package custommer.java.bank;

public class bank {
	String name;
	int per_amount = 0;
	static int share_amount = 0;
	
	public bank(String name) {
		this.name = name;
	}
	public void per_saveMoney(int money) {
		per_amount += money;
		System.out.println("per_amount"+per_amount);
	}
	public void per_spendMoney(int money) {
		per_amount -= money;
		System.out.println("per_amount"+per_amount);
	}
	
	public void share_saveMoney(int money) {
		share_amount += money;
		System.out.println("share_amount"+share_amount);
	}
	public void share_spendMoney(int money) {
		share_amount -= money;
		System.out.println("share_amount"+share_amount);
	}
	
	public void per_info() {
		System.out.println("personal money:"+per_amount);
	}
	public void share_info() {
		System.out.println("sharal money:"+share_amount);
	}
}
