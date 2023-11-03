/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luchar;

/**
 *
 * @author Personal
 */
public class Luchador1 implements Magias{

    @Override
    public void curar() {
        System.out.println("curando desde L1");
    }

    @Override
    public void ataqueHielo() {
        System.out.println("atak de hielo desde L1");
    }

    @Override
    public void ataqueFuego() {
        System.out.println("atak de Fuego desde L1");
    }
    
}
