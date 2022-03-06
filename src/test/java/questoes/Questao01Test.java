package questoes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//import junit.framework.Assert;
import static org.junit.Assert.*;

import questoes.Questao01;

class Questao01Test {

	Questao01 questao01 = new Questao01();
    List<Float> numeros = new ArrayList();
    Random gerador = new Random();

    @Test
    @DisplayName("Testando calculadora de mediana")
    void testMetodoCalcularMediana() {
        numeros.add((float) 9);
        numeros.add((float) 2);
        numeros.add((float) 1);
        numeros.add((float) 4);
        numeros.add((float) 6);
        Assert.assertTrue((float) 1 == questao01.calcularMediana(numeros));
    }

}
