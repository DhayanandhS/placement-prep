class P6{
    static int evenlyDivides(int N){
        int res = 0;
        int temp = N;
        
        while (temp > 0) {
            int digit = temp % 10;
            if (digit != 0 && N % digit == 0) {
                res++;
            }
            temp = temp / 10;
        }
        
        return res;
    }
}