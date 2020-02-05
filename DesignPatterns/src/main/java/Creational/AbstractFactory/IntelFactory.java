package Creational.AbstractFactory;

/**
 * <p>题目名字：</p>
 * <p>题目描述：</p>
 * <p>题目示例：</p>
 *
 * @author Hobert-Li
 * @description
 * @create 2020/2/5 12:22
 */

public class IntelFactory implements ComputerFactory {
    public CPU makeCPU() {
        return new IntelCPU();
    }

    public MainBoard makeMainBoard() {
        return new IntelMainBoard();
    }

    //接口中无此方法
    public HardDisk makeHardDisk() {
        return new IntelHardDisk();
    }
}
