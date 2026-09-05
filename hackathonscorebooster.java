public class hackathonscorebooster{
    static void curveScores(int[] scores, int bonus){
        int i;
        for(i=0;i<scores.length;i++){
            scores[i]+=bonus;
        }

    }
    public static void main(String[] args){
        int i;
        int[] scores = {90,58,59};
        System.out.println("Original Scores : ");
        for(i=0;i<scores.length;i++){
            System.out.print(scores[i] + " ");
        }
        System.out.println(" ");
        curveScores(scores, 10);

        System.out.println("Final Scores : ");
        for(i=0;i<scores.length;i++){
            System.out.print(scores[i] + " ");
        }
        System.out.println(" ");
    }
}