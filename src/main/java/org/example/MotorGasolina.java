package org.example;

public class MotorGasolina implements Motor {

    @Override
    public int getPotencia() {
        return 100;
    }

    @Override
    public float getTorque(){
        return 50.0f;
    }
}
