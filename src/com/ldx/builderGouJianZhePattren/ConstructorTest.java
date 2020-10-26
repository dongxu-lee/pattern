package com.ldx.builderGouJianZhePattren;

/**
 * 设计模式--Builder构建者模式
 * 多个简单的对象构建成一个复杂的对象
 */
public class ConstructorTest {

    public static void main(String[] args) {
        ComputerBuilder computerBuilder = new ComputerBuilder();
        computerBuilder.installDisplayer("显示器");
        computerBuilder.installMainUnit("主机");
        computerBuilder.installMouse("鼠标");
        computerBuilder.installKeyboard("键盘");
        System.out.println(computerBuilder.getComputer());
    }
}
