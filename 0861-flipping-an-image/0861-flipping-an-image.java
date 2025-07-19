class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0 ; i<image.length;i++){
            if(image[i].length==1){
                if(image[i][0]==0)
                image[i][0]=1;
                else
                image[i][0]=0;
            }
        }
       

        for (int i = 0; i < image.length; i++) {
            reverse(image[i]);
        }
        return image;
    }

    public void reverse(int[] image) {

        int i = 0;
        int j = image.length - 1;
        while (i < j) {

            if (image[i] == 0) {
                image[i] = 1;
            } else {
                image[i] = 0;
            }
            if (image[j] == 0) {
                image[j] = 1;
            } else {
                image[j] = 0;
            }

            int temp = image[i];
            image[i] = image[j];
            image[j] = temp;

            i++;
            j--;

            if (i == j) {
                if (image[i] == 0)
                    image[i] = 1;
                else
                    image[i] = 0;
            }

        }
    }

}