package org.example;

public class MotorDiesel implements Motor{
    @Override
    public int getPotencia() {
        return 70;
    }

    @Override
    public float getTorque(){
        return 100.0f;
    }
}
