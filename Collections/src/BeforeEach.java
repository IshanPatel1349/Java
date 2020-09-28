import java.util.Arrays;

public class BeforeEach {
	 
    public static void main(String[] args) {        
    	BeforeEach main = new BeforeEach();
        int result = main.countStudent(new int[] {1,1,3,3,4,1});
        System.out.println(result);
    }
     
    /* Solution */   
    public static int countStudent(int[] heights) {
        int[] newHeights = new int[heights.length];
        for(int i=0; i<heights.length; i++){
            newHeights[i] = heights[i];
        }
         
        Arrays.sort(heights);
         
        int count = 0;
        for(int i=0; i<heights.length; i++){
            if(newHeights[i] != heights[i]){
                count++;
            }
        }
        return count;
    }
}