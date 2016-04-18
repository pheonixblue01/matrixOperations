package matrixOperations;


public class MatrixOperations {
	
	static int row;
	static int col;
	public static void main(String [] args){
		
		double [][] matrixA = {	{1,1,1},
								{2,5,2},
								{6,7,3}};
		
		double [][] matrixB = {	{5,9,10},
								{2,5,3},
								{8,1,5}};
		
		double ratio = 5;
		//get the size of array
		row = matrixA.length;
		col = matrixA[row-1].length;
		
		System.out.println("Matrix A:");
		displayMat(matrixA);
		
		//display ratio
		double [][] result = new double [row][col];
		result = scaleMatrix(matrixA,ratio);
		//display scaled matrix
		System.out.println("Scaled results of matrix A by value: ");
		
		displayMat(result);
		System.out.println("Results of adding Matrix A and Matrix B: ");
		double addResult [] [] = new double [row][col];
		addResult = addMat(matrixA, matrixB);
		displayMat(addResult);
		
	}
	
	//create a method to scale the elements of a matrix by value ratio
	public static  double [] [] scaleMatrix(double mat [] [], double ratio){
		double scaleMatrix [] [] = new double [row] [col];
		for (int i = 0; i < (row); i++){
			for (int j = 0; j < (col); j++){
			scaleMatrix [i] [j] = mat [i][j]*5;	
			}
		}
		return scaleMatrix;
		
	}
	// display function for matrix
	public static void displayMat(double mat [] []){

		for (int i = 0; i < (row); i++){
			for (int j = 0; j < (col); j++){
				System.out.print(mat[i][j]+ "  ");
			}
			System.out.println("");
		}
		
	}
	
	
	//create a method to add two matrices A and B and return the sum matrix
	public static double [][] addMat(double matA[][], double matB[][]){
	double addMat[][] = new double [row][col];
	for (int i = 0; i < (row); i++){
		for (int j = 0; j < (col); j++){
		addMat [i] [j] = matA [i][j]+ matB [i][j];	
		}
	}
	return addMat;
		
	}	
	
}

