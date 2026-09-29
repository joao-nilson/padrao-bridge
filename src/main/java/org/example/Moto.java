package org.example;

public class Moto extends Veiculo{
    public Moto(Motor motor) {
        super(motor);
    }

    @Override
    public String getTipo() {
        return "Moto";
    }
}
