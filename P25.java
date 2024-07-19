public class P25 {
    public static String read(int n, int []book, int target){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j) continue;
                if(book[i] + book[j] == target){
                    return "YES";
                }
            }
        }
        return "NO";
    }
}