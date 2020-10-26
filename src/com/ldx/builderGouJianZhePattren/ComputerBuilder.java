package com.ldx.builderGouJianZhePattren;

public class ComputerBuilder {

    private Computer computer = new Computer();

    public void installDisplayer(String disPlayer) {
        computer.setDisPlayer(disPlayer);
    }

    public void installMainUnit(String mainUnit) {
        computer.setMainUnit(mainUnit);
    }

    public void installMouse(String mouse) {
        computer.setMouse(mouse);
    }

    public void installKeyboard(String keyboard) {
        computer.setKeyboard(keyboard);
    }

    public Computer getComputer() {
        return computer;
    }


}
