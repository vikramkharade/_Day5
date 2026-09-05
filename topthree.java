public class topthree {
    static int[] findTopThreeScores(int[] scores){
        int first, second, third;
        first=second=third=0;
        for(int i=0;i<scores.length;i++){
            if(scores[i]>first){
                third=second;
                second=first;
                first=scores[i];
            }
            else if(scores[i]>second){
                third=second;
                second=scores[i];
            }
            else if(scores[i]>third){
                third=scores[i];
            }
        }
        int[] topThreeScores = new int[]{first, second, third};
        return topThreeScores;
    }
    public static void main(String[] args){
        int[] scores = {90, 58, 59, 100, 85};
        int[] topThreeScores = findTopThreeScores(scores);
        System.out.println("Top Three Scores : ");
        for(int i=0;i<topThreeScores.length;i++){
            System.out.print(topThreeScores[i] + " ");
        }
        System.out.println(" ");
    }
}
