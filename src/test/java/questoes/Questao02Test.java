package questoes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Questao02Test {
	
	Questao02 questao02 = new Questao02();
    List<Integer> numeros = new ArrayList();

	@Test
    @DisplayName("Testando calcular Vetor")
    void testMetodoCalcularVetor() {
		int zero = 0;
        numeros.add((int) 1);
        numeros.add((int) 5);
        numeros.add((int) 3);
        numeros.add((int) 4);
        numeros.add((int) 2);
        
        for(int i = 0;i < numeros.size();i++) {
	        for(int o = 0;o < numeros.size();o++) {
	            if(numeros.get(i) - numeros.get(o) == 2) {
	                zero++;
	            }
	        }
	    }
        
        Assert.assertEquals(zero, questao02.vetorLista(numeros));
    }

}
