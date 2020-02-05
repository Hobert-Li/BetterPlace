package Creational.AbstractFactory;

/**
 * <p>题目名字：</p>
 * <p>题目描述：</p>
 * <p>题目示例：</p>
 *
 * @author Hobert-Li
 * @description
 * @create 2020/2/5 12:50
 */

public class Computer {

    private CPU cpu;

    private MainBoard mainBoard;

    private HardDisk hardDisk;

    public Computer(CPU cpu, MainBoard mainBoard, HardDisk hardDisk) {
        this.cpu = cpu;
        this.mainBoard = mainBoard;
        this.hardDisk = hardDisk;
    }
}
