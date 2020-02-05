package Creational.AbstractFactory;

/**
 * <p>题目名字：</p>
 * <p>题目描述：</p>
 * <p>题目示例：</p>
 *
 * @author Hobert-Li
 * @description
 * @create 2020/2/5 12:26
 */

public class AmdFactory implements ComputerFactory {
    public CPU makeCPU() {
        return new AmdCPU();
    }

    public MainBoard makeMainBoard() {
        return new AmdMainBoard();
    }
}
