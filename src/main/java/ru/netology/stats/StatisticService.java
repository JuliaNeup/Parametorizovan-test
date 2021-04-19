package ru.netology.stats;

public class StatisticService {
    public int sum(int[] sales) {
        int totalSale = 0;
        for (int i = 0; i < sales.length; i++) {
            totalSale = totalSale + sales[i];
        }
        return totalSale;
    }

    public int avgSales (int[] sales) {
        int avgSales= 0;
        avgSales=sum(sales)/sales.length;
        return avgSales;
    }

    public int better(int[] sales) {
        int month=0;
        int bestSales=0;
        for (int i=0;i<sales.length;i++){
            if (sales[i]>bestSales){
                bestSales=sales[i];
            }
        }
        for (int i=0;i<sales.length;i++){
            if (sales[i]==bestSales){
                month=i+1;
            }
        }
        return month;
    }

    public int worth(int[] sales) {
        int month=0;
        int worthSales=sales[0];
        for (int i=1;i<sales.length;i++){
            if (worthSales>sales[i]){
                worthSales=sales[i];
            }
        }
        for (int i=0;i<sales.length;i++){
            if (sales[i]==worthSales){
                month=i+1;
            }
        }
        return month;
    }

    public int lowAvg(int[] sales) {
        int monthCnt=0;
        int avg=avgSales(sales);
        for (int i=0;i< sales.length;i++){
            if (sales[i]<avg){
                monthCnt++;
            }
        }
        return monthCnt;
    }

    public int hiAvg(int[] sales) {
        int monthCnt=0;
        int avg=avgSales(sales);
        for (int i=0;i< sales.length;i++){
            if (sales[i]>avg){
                monthCnt++;
            }
        }
        return monthCnt;
    }
}
