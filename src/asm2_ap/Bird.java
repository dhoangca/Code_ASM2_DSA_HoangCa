/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm2_ap;

/**
 *
 * @author Hoang Ca
 */
public class Bird extends Animal {
    private double wingSpan;

    public Bird(int id, String name, int age, double wingSpan) {
        super(id, name, age);
        this.wingSpan = wingSpan;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void fly() {
        System.out.println(getName() + " is flying with a wingspan of " + wingSpan + " meters.");
    }

    public void chirp() {
        System.out.println(getName() + " is chirping.");
    }

    @Override
    public void makeSound() {
        chirp();
    }
}