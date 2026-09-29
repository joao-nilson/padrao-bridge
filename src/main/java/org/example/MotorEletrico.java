package org.example;

public class MotorEletrico implements Motor{

    @Override
    public int getPotencia(){
        return 150;
    }

    @Override
    public float getTorque(){
        return 150.0f;
    }
}
