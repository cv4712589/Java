package tw.byron.classes;

public class Bike {
	//設計父類別
	//peivate存取範圍只有本類別，其他地方拿不到
	//protected 繼承的子類別可使用(不同package也能用)
	//單一繼承，如果沒有寫extends內建繼承Object(最上層)
	protected double speed;
	
	public void upSpeed() {
		speed = speed < 1 ? 1 :speed * 1.4;
	}
	
	public void downSpeed() {
		speed = speed < 1 ? 1 :speed * 0.6;
	}
	
	public double getSpeed() {
		return speed;
	}
}
