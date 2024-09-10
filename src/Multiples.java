class Multiples{
    public static void main(String[] args) {
        int ans = 0;
        for(int i = 1; i < 1000; i++){
            if(i % 3 == 0 || i % 5 == 0){
                ans += 1;
            }
        }
        System.out.println("Here are the number of multiples of 3 and 5");
        System.out.println(ans);
    }
}