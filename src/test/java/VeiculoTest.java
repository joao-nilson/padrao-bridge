import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.*;
import org.junit.jupiter.api.Test;

public class VeiculoTest {
    @Test
    void carroDeveUsarPotenciaETorqueDoMotorGasolina() {
        Veiculo carro = new Carro(new MotorGasolina());
        assertEquals(100, carro.getPotencia());
        assertEquals(50, carro.getTorque());
    }

    @Test
    void motoDeveUsarPotenciaETorqueDoMotorEletrico() {
        Veiculo moto = new Moto(new MotorEletrico());
        assertEquals(150, moto.getPotencia());
        assertEquals(150, moto.getTorque());
    }

    @Test
    void caminhaoDeveUsarPotenciaETorqueDoMotorDiesel() {
        Veiculo caminhao = new Caminhao(new MotorDiesel());
        assertEquals(70, caminhao.getPotencia());
        assertEquals(100, caminhao.getTorque());
    }

    @Test
    void mesmoVeiculoComMotoresDiferentesDeveTerValoresDiferentes() {
        Veiculo a = new Carro(new MotorGasolina());
        Veiculo b = new Carro(new MotorEletrico());
        assertEquals(100, a.getPotencia());
        assertEquals(150, b.getPotencia());
    }

}
