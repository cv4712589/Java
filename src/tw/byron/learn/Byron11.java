package tw.byron.learn;

public class Byron11 {

	public static void main(String[] args) {
		int [][] a = new int[3][4];
		//Array(陣列)  <---> Matrix(矩陣)
		//結構是多維，尋訪用一維角度看
		int [][] b = new int[3][];
		b[0] = new int [2];
		b[1] = new int [3];
		b[2] = new int [4];
		
		for(int i = 0; i < b.length ; i++) {
			for(int j = 0; j < b[i].length ; j++ ) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("-------");
	
	
	
	//for - each
	
	for( int [] v : b ) {           //b的肚子裡是一維陣列
		for( int vv : v) {          //v的肚子裡面是int
			System.out.print(vv + " ");
			}
		System.out.println();
		}	
	}
}