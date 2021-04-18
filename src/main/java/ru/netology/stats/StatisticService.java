package ru.netology.stats;

public class StatisticService {
    public int Sum(int[] sales) {
        int TotalSale = 0;
        for (int i = 0; i < sales.length; i++) {
            TotalSale = TotalSale + sales[i];
        }
        return TotalSale;
    }

    public int Avg(int[] sales) {
        int Avg = 0;
        Avg=Sum(sales)/sales.length;
        return Avg;
    }

    public int Better(int[] sales) {
        int Month=0;
        int BestSales=0;
        for (int i=0;i<sales.length;i++){
            if (sales[i]>BestSales){
                BestSales=sales[i];
            }
        }
        for (int i=0;i<sales.length;i++){
            if (sales[i]==BestSales){
                Month=i+1;
            }
        }
        return Month;
    }

    public int Worth(int[] sales) {
        int Month=0;
        int WorthSales=sales[0];
        for (int i=1;i<sales.length;i++){
            if (WorthSales>sales[i]){
                WorthSales=sales[i];
            }
        }
        for (int i=0;i<sales.length;i++){
            if (sales[i]==WorthSales){
                Month=i+1;
            }
        }
        return Month;
    }

    public int LowAvg(int[] sales) {
        int MonthCnt=0;
        for (int i=0;i< sales.length;i++){
            if (sales[i]<Avg(sales)){
                MonthCnt++;
            }
        }
        return MonthCnt;
    }

    public int HiAvg(int[] sales) {
        int MonthCnt=0;
        for (int i=0;i< sales.length;i++){
            if (sales[i]>Avg(sales)){
                MonthCnt++;
            }
        }
        return MonthCnt;
    }
}
