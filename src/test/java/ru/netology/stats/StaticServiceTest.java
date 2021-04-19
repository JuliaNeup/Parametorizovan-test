package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StaticServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatisticService service = new StatisticService();

    @Test
    void totalSales() {
        assertEquals(180, service.sum(sales));
    }

    @Test
    void avgSales() {
        assertEquals(15, service.avgSales(sales));
    }

    @Test
    void bestMont() {
        assertEquals(8, service.better(sales));
    }

    @Test
    void worthMont() {
        assertEquals(9, service.worth(sales));
    }

    @Test
    void mountCntLowAvg() {
        assertEquals(5, service.lowAvg(sales));
    }

    @Test
    void mountCntHiAvg() {
        assertEquals(5, service.hiAvg(sales));
    }
}