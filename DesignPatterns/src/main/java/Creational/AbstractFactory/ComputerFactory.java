package Creational.AbstractFactory;
/*
 * @description
 * @author Hobert-Li
 * @create 2020/2/5 12:20
 */

public interface ComputerFactory {

    CPU makeCPU();

    MainBoard makeMainBoard();

}
