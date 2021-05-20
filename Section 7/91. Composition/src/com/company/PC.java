package com.company;

public class PC {
    private Case theCase;
    private Monitor theMonitor;
    private MotherBoard motherBoard;

    public PC(Case theCase, Monitor theMonitor, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.motherBoard = motherBoard;
    }
    public Case getTheCase() {
        return theCase;
    }

    public Monitor getTheMonitor() {
        return theMonitor;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

}
