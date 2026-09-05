public class duplicateteamfinder {
    static String findDuplicateTeam(String[] teamNames){
        int i,j;
        for(i=0;i<teamNames.length;i++){
            for(j=i+1;j<teamNames.length;j++){
                if(teamNames[i] == teamNames[j]){
                    return"Duplicate Team Found : " + teamNames[i];
                }
            }
        }
        return "No Duplicate Teams Found";
    }
    public static void main (String[] args){
        String[] teamNames = {"Team A", "Team B", "Team C", "Team D", "Team A"};
        System.out.println(findDuplicateTeam(teamNames));
    }
}
