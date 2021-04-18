package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StaticServiceTest {
    int[] Sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatisticService service = new StatisticService();

    @Test
    void TotalSales() {
        assertEquals(180, service.Sum(Sales));
    }

    @Test
    void AvgSales() {
        assertEquals(15, service.Avg(Sales));
    }

    @Test
    void BestMont() {
        assertEquals(8, service.Better(Sales));
    }

    @Test
    void WorthMont() {
        assertEquals(9, service.Worth(Sales));
    }

    @Test
    void MountCntLowAvg() {
        assertEquals(5, service.LowAvg(Sales));
    }

    @Test
    void MountCntHiAvg() {
        assertEquals(5, service.HiAvg(Sales));
    }
}