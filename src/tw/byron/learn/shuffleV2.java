package tw.byron.learn;

public class shuffleV2 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int[] poker = new int[52];
		for (int i = 0; i < poker.length; i++) {
			boolean isRepeat = false;
			int temp;
			do {
				temp = (int) (Math.random() * 52);
				// 檢查是否重複
				isRepeat = false;
				for (int j = 0; j < i; j++) {
					if (temp == poker[j]) {
						isRepeat = true;
						break;
					}
				}
			}while (isRepeat);

			poker[i] = temp;
			System.out.println(poker[i]);

		}
		System.out.println("------");
		System.out.println(System.currentTimeMillis() - start);
	}

}
