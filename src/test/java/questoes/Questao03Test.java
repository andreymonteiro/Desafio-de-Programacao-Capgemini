package questoes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;

class Questao03Test {
	Questao03 questao03 = new Questao03();

	@Test
    @DisplayName("Testando a encriptação")
    void testMetodoencriptar() {
		String frase = "ola mundo";
		String[] lista;//Vetor de palavras da frase
		lista = frase.split(" ");
		
		Assert.assertEquals("omd luo an " ,questao03.textoEncriptado(lista));
		
			
	}

}
