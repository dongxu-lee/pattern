package com.ldx.factoryPattern.simpleFactoryPattern;

public class ComputerFactory {

    public static Computer createComputer(String type) {
        Computer computer = null;
        switch (type) {
            case "lenovo":
                computer = new LenovoComputer();
                break;
            case "hp":
                 computer = new HpComputer();
        }

        return computer;
    }
}
