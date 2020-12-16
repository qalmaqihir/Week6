public class TotalVolumeOfBoxes {
    /*
    combined together. A box is represented by an array with three elements: length, width and height.

For instance, totalVolume([2, 3, 2], [6, 6, 7], [1, 2, 1]) should return 266 since (2 x 3 x 2) + (6 x 6 x 7) + (1 x 2 x 1) = 12 + 252 + 2 = 266.

    Examples
    totalVolume([4, 2, 4], [3, 3, 3], [1, 1, 2], [2, 1, 1]) ➞ 63

    totalVolume([2, 2, 2], [2, 1, 1]) ➞ 10

    totalVolume([1, 1, 1]) ➞ 1
     */
    public static void main(String[] args) {
        int[][] arr1={{2,2,2},{2,1,1}};
        int[][] arr3={{1,1,1}};
        totalVolume(arr1);
    }
    public static int totalVolume(int[][] part){
        int volume=0;
        for(int row =0; row<part.length;row++){
            int rowVolume=1;
            for(int col=0;col<part[row].length;col++){
                rowVolume*=part[row][col];
                System.out.printf("volume of row %d col %d = %d\n",row,col,part[row][col]);
            }
            volume+=rowVolume;
            System.out.println(rowVolume);
        }
        System.out.println("Total Volume");
        System.out.println(volume);
        return 1;
    }
}
