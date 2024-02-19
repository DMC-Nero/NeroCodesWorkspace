package qedge_class;

public class Array3d {

	public static void main(String[] args) {
		int[][][] arr3d = new int[1][2][3];

		System.out.println(arr3d);
		for (int i = 0; i < arr3d.length; i++) {
			System.out.println("\t" + arr3d[i]);
			for (int j = 0; j < arr3d[i].length; j++) {
				System.out.println("\t\t" + arr3d[i][j]);
				for (int k = 0; k < arr3d[i][j].length; k++) {
					System.out.println("\t\t\t" + arr3d[i][j][k]);
				}

			}
		}
	}
}
