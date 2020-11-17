package com.company.ten.two;

public class ChairFactory implements AbstractChairFactory{
    @Override
    public UniversalChair createUniversalChair() {
        return new UniversalChair();
    }

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }

    @Override
    public VictorianChair createVictorianChair(int age) {
        return new VictorianChair(age);
    }
}
