class StockPrice {
    public static void main(String[] args) {
        int[] val ={5,6,2,7,8,1};
        int profit=0;
        for(int i=0;i<val.length;i++){
            for(int j=i+1;j<val.length;j++){
                if(val[i]<val[j])
                    profit = Math.max(profit,(val[j]-val[i]));
            }
        }
        System.out.println(profit);
    }
}
