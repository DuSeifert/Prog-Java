import org.example.ContaBancaria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteContaBancaria {

    ContaBancaria conta = new ContaBancaria("João", 123, 0);

    @Test
    public void testDepositar(){
        conta.depositar(50);
        assertEquals(50, conta.getSaldo());
    }


}




