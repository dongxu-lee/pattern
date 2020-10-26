package com.ldx.builderGouJianZhePattren;

public class Computer {

    private String disPlayer;

    private String mainUnit;

    private String mouse;

    private String keyboard;

    @Override
    public String toString() {
        return "Computer{" +
                "disPlayer='" + disPlayer + '\'' +
                ", mainUnit='" + mainUnit + '\'' +
                ", mouse='" + mouse + '\'' +
                ", keyboard='" + keyboard + '\'' +
                '}';
    }

    public String getDisPlayer() {
        return disPlayer;
    }

    public void setDisPlayer(String disPlayer) {
        this.disPlayer = disPlayer;
    }

    public String getMainUnit() {
        return mainUnit;
    }

    public void setMainUnit(String mainUnit) {
        this.mainUnit = mainUnit;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }
}
