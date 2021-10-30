class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] list = new int[image.length][image[0].length];
        for(int i=0; i<image.length; i++)
        {
            image[i] = flipinvert(image[i]);
            list[i] = image[i];
        }
        return list;
    }
    private int[] flipinvert(int[] image){
        int[] rev = new int[image.length];
        
        for(int i=0; i<image.length; i++)
        {
            if(image[i]==0) rev[image.length-i-1]=1;
            if(image[i]==1) rev[image.length-i-1]=0;
        }
        return rev;
    }
}