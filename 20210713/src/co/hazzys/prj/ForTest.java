package co.hazzys.prj;

public class ForTest {

	public void singleFor() {
		int sum = 0;
		for (int i = 0; i <= 100; i++)
			sum = sum + i;

		System.out.println("1부터 100까지 합 : " + sum);
		System.out.println();
	}

	public void doubleFor() {
		for (int j = 1; j <= 9; j++) {
			System.out.println();
			for (int i = 1; i <= 9; i++)
				System.out.print(i + "*" + j + "=" + i * j + "\t");
		}
	}
	
	public void forEach() {
		int arr[] = {1,4,2,3,7,5,9};
		
		for(int i =0; i<arr.length; i++)
			System.out.println(arr[i]+"=> for문 출력");
		
		for (int num : arr) { //arr[] 배열의 num을 arr 길이 만큼
			System.out.println(num);
		}
	}
}
