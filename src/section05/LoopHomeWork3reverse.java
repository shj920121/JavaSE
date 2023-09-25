package section05;
/*
 * 
 * *
 * **
 * ***
 * ****
 * *****
 * 
 * 2.
 *     *
 *    **
 *   ***
 *  ****
 * *****
 * 
 * 3.
 *     *
 *    ***
 *   *****
 *  *******
 * 
 * 4.			i	j						i	j
 *     *		0	0 1 2	i+j < 3			0	4 5 6	j-i > 3
 *    ***		1	0 1		i+j < 3			1	5 6		j-i > 3
 *   *****		2	0		i+j < 3			2	6		j-i > 3
 *  *******		3			i+j < 3			3			j-i > 3
 *   *****		4	0		i-j > 3			4	6		i+j > 9
 *    ***		5	0 1		i-j > 3			5	5 6		i+j > 9
 *     *		6	0 1 2	i-j > 3			6	4 5 6	i+j > 9
 *  
 * 5.
 * 	
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class LoopHomeWork3reverse {
	public static void main(String[] args) {
		//2~3번 , 4번
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < 7; j++) {
				if(i > 2) {
					if(i-j > 3) {
						System.out.print(" ");
					} else if (i+j > 9){
						System.out.print(" ");
					} else {
						System.out.print("*");
					} 
				}																	
			}
			System.out.println();
		}							
	}
}