package demoJenkinpkg;
/**
 * Created by Shubhada on 2/4/16.
 */
public class triangle {

	/*Initialize the triangle. For declaration used array of 4 X 7 for the faster access 
         to adjacent child nodes and used 0 as filler to empty column */
	static int trg[][]={{0,0,0,3,0,0,0},
					 {0,0,7,0,4,0,0},
					 {0,2,0,4,0,6,0},
					 {8,0,5,0,9,0,3}
		           };

	public static void main(String[] args) {
		
	/*Divide triangle and calculate sum of parent and adjacent child nodes and store it 
         in array pyramid_btmArr and in pyramid_pyramid_topArr*/

		int pyramid_btmArr[]= new int[6];
		int pyramid_topArr[]= new int[3];
		int pyramid_btMax, pyramid_tpMax;
		int result;
		int i,j,k;
		k=0;
		boolean flg=false;
		
		/* Calculate addition of top 2 rows */
		for (i=0,j=0;flg!=true;j++)
		{
			if(trg[i][j]!=0)
			{

				pyramid_topArr[k]   = trg[i][j]+trg[i+1][j-1];
				pyramid_topArr[k+1] = trg[i][j]+trg[i+1][j+1];
				flg=true;
			}
			
		}
		
		/* Calculate addition of last 2 rows*/
		for (i=2,j=0;j<7;j++)
		{
			if(trg[i][j]!=0)
			{

				pyramid_btmArr[k]   = trg[i][j]+trg[i+1][j-1];
				pyramid_btmArr[k+1] = trg[i][j]+trg[i+1][j+1];
				k+=2;

			}
		}
		
		 /*Get max number from first 4 digits from pyramid_btmArr*/
		pyramid_btMax=Math.max(pyramid_btmArr[0], pyramid_btmArr[1]);

		for (i=2;i<4;i++)
		{
			pyramid_btMax = Math.max(pyramid_btMax,pyramid_btmArr[i]);
			
		}
		
		/*Add calculated max number with 1st value of pyramid_topArr*/
		pyramid_btMax=pyramid_btMax+pyramid_topArr[0];
		
		
		/*Get max number from last 4 digits from pyramid_btmArr*/

		pyramid_tpMax=Math.max(pyramid_btmArr[2], pyramid_btmArr[3]);
		for (i=4;i<6;i++)
		{
			pyramid_tpMax = Math.max(pyramid_tpMax,pyramid_btmArr[i]);
			
		}
		
		/*Add calculated max number with 2nd value of pyramid_topArr*/
		pyramid_tpMax=pyramid_tpMax+pyramid_topArr[1];
		result=Math.max(pyramid_btMax, pyramid_tpMax);
		
		System.out.println("Max value from triangle is : "+result);
	}

}


