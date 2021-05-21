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

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();

    }

    private void drawLogo(){
        theMonitor.drawPixelAt(1200, 50, "Logo");
    }


}
