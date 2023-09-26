package section06;
/*
 *  1  2  3  4  5  6  7		
 	8  9  10 11 12 13 14		
 	15 16 17 18 19 20 21		
 	22 23 24 25 26 27 28		
 	29 30 31 32 33 34 35		
 	36 37 38 39 40 41 42		
 	43 44 45 46 47 48 49	
 	
 	1 2 8 15 9 3 4 10 16 22 29 23 17 11 5 6 12 18 24 30 36 43 37 31 25 19 13 7 14 20 26 32 38 44 45 39 33 27 21 28 34 40 46 47 41 35 42 48 49

 	1. 2중배열 선언하고
 	2. for문으로 1~49까지 대입하기
 	3. 아래 번호대로 출력하기
 	
 * 힌트 - 배열의 규칙찾아서 출력하기

i											
0   1[0][0]								 						[i-j]
1   2[0][1]  8[1][0]											[j][i-j]  
2  15[2][0]  9[1][1]  3[0][2]									[i-j][j]
3   4[0][3] 10[1][2] 16[2][1] 22[3][0]							[j][i-j]
4  29[4][0] 23[3][1] 17[2][2] 11[1][3]  5[0][4]
5   6[0][5] 12[1][4] 18[2][3] 24[3][2] 30[4][1] 36[5][0]
6  43[6][0] 37[5][1] 31[4][2] 25[3][3] 19[2][4] 13[1][5] 7[0][6]

i j     0        1        2        3       4        5
7  14[1][6] 20[2][5] 26[3][4] 32[4][3] 38[5][2] 44[6][1]		[][]
8  45[6][2] 39[5][3] 33[4][4] 27[3][5] 21[2][6]					[][]
9  28[3][6] 34[4][5] 40[5][4] 46[6][3]							[][]
10 47[6][4] 41[5][5] 35[4][6]									[][]
11 42[5][6] 48[6][5]											[][]
12 49[6][6]    													[][]
 * 
 *i 7, 9, 11열이 [i-6+j][]  i가 홀수일때 조건
 * 						   i가 짝수일때 조건
 * 
 */
public class ArrayHomeWork {
	public static void main(String[] args) {

		
		int[][] array = new int[7][7];
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				int value = i * 7 + j + 1;
				array[i][j] = value;
				
				// 1~49까지 배열만들기
				
				System.out.println(value);
			}
		}

		
		for (int i = 0; i < 13; i++) {  //배열을 13줄로 봄
			if (i < 7) {
				for(int j= 0; j<i+1; j++) {
					if(i % 2 == 0) {
						System.out.print(array[i-j][j] + " ");						
					} else {
						System.out.print(array[j][i-j] + " ");
					}
				}
//					System.out.print("*");  // 이제 * 대신 위에 배열값 가져오면됌
				} else {
					for(int j=0; j < 13 - i; j++) {
						if(i % 2 == 0) {
							System.out.print(array[6-j][i-6+j] + " ");
						} else {
							System.out.print(array[i-6+j][6-j] + " ");
						}
						System.out.println();
					}
				}
				
				
				System.out.println();
			}
		}
			
		
}

//
//int[] array = {0,1,2,3,4,5,6};
//for(int i = 0; i < array.length; i++) {
//	System.out.print(i + ":");
//	System.out.println(array[i]);
//	
//	System.out.println(i+ ":" + array[i]);
	
//}
// int i = 0;  이렇게 선언하면 for문 밖에서도 사용가능
//for(int i = 0; i < 7; i++) {
//	System.out.println(i);
//}
