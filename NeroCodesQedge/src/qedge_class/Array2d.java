package qedge_class;

public class Array2d {

	public static void main(String[] args) {
		int[][] arr2d = new int[2][3];
		int[][][] arr3d = new int[2][3][4];
		System.out.println(arr2d);
		System.out.println(arr2d.length);

		System.out.println(arr2d[0]);
		System.out.println(arr2d[0].length);

		System.out.println(arr2d[1]);
		System.out.println(arr2d[1].length);

		System.out.println(arr2d[0][0]);
		System.out.println(arr2d[0][1]);
		System.out.println(arr2d[0][2]);

		System.out.println(arr2d[1][0]);
		System.out.println(arr2d[1][1]);
		System.out.println(arr2d[1][2]);

		System.out.println("===========");

		System.out.println(arr2d);
		for (int i = 0; i < arr2d.length; i++) {
			System.out.println("\t" + arr2d[i]);
			for (int j = 0; j < arr2d[i].length; j++) {
				System.out.println("\t\t" + arr2d[i][j]);

			}
		}

		System.out.println("===========");
		System.out.println(arr2d);

		for (int[] arr1d : arr2d) {
			System.out.println("\t" + arr1d);
			for (int value : arr1d) {
				System.out.println("\t\t" + value);
			}
		}
		System.out.println("===========");
		System.out.println(arr3d);
		for (int[][] arr2dd : arr3d) {
			System.out.println("\t" + arr2dd);
			{
				for (int[] arr1dd : arr2dd) {
					System.out.println("\t\t" + arr1dd);
					for (int value1 : arr1dd) {
						System.out.println("\t\t\t" + value1);
					}
				}
			}
		}
	}

}
