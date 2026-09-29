package org.example;

public class Caminhao extends Veiculo{
    public Caminhao(Motor motor) {
        super(motor);
    }

    @Override
    public String getTipo() {
        return "Caminhao";
    }
}
