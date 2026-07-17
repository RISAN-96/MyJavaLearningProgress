package July11to12;
            //Java Tutorial: Multidimensional Arrays in Java
            //Array inside array inside array inside array

public class T28_Multidimensional_Array {
    public static void main(String[] args) {
        int [] marks; // single array
        int [][] twoDimensions; //2d array
        twoDimensions = new int[2][3]; // means two row 7 3 column
        twoDimensions[0][0]=101;
        twoDimensions[0][1]=102;
        twoDimensions[0][2]=103;
        twoDimensions[1][0]=201;
        twoDimensions[1][1]=202;
        twoDimensions[1][2]=203;

        for(int i=0;i<twoDimensions.length;i++) {
            for(int j=0;j<twoDimensions[i].length;j++) {
                System.out.print(twoDimensions[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
