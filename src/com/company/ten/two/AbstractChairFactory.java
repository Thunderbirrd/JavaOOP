package com.company.ten.two;

public interface AbstractChairFactory {
    UniversalChair createUniversalChair();
    MagicChair createMagicChair();
    VictorianChair createVictorianChair(int age);
}
