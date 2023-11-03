/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luchar;

/**
 *
 * @author Personal
 */
public class Luchador3 implements Magias, Skills{
       @Override
    public void curar() {
System.out.println("curando desde L3");
    }

    @Override
    public void ataqueHielo() {
System.out.println("atak de hielo desde L3");
    }

    @Override
    public void ataqueFuego() {
System.out.println("atak de Fuego desde L3");
    }

    @Override
    public void esquivar() {
        System.out.println("esquivando desde L3");
    }

    @Override
    public void dobleAtaque() {
        System.out.println("doble ataque desde L3");
    }
}
