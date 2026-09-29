package org.example;

public class Carro extends Veiculo{
    public Carro(Motor motor) {
        super(motor);
    }

    @Override
    public String getTipo() {
        return "Carro";
    }
}
