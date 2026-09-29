package org.example;

public abstract class Veiculo {
    protected Motor motor;

    public Veiculo(Motor motor){
        this.motor = motor;
    }

    public abstract String getTipo();

    public void fichaTecnica(){
        System.out.println("Potencia do motor: " + motor.getPotencia() + "CV");
        System.out.println("Torque do motor: " + motor.getTorque() + "Nm");
    }

    public int getPotencia(){
        return motor.getPotencia();
    }

    public float getTorque() {
        return motor.getTorque();
    }
}
