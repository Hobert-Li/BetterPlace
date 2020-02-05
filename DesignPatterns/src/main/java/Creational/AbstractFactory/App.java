package Creational.AbstractFactory;

/**
 *
 * @author Hobert-Li
 * @description
 * @create 2020/2/5 12:48
 */

public class App {

    public static void main(String[] args) {

        ComputerFactory factory = new IntelFactory();

        CPU cpu = factory.makeCPU();

        MainBoard mainBoard = factory.makeMainBoard();

        //不能调用，因为接口中无此方法。这也是抽象工厂的问题所在，如果想加一个硬盘，就要给所有工厂，接口都加上这个方法，违反开闭原则。
        //HardDisk mainBoard = factory.makeHardDisk();

        Computer result = new Computer(cpu, mainBoard, new IntelHardDisk());

    }

}
