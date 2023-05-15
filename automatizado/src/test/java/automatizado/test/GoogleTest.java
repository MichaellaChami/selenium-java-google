package automatizado.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import automatizado.page.GooglePO;

public class GoogleTest extends BaseTest {
 
    private static GooglePO googlePage;

    @BeforeClass
    public static void prepararTest(){
       googlePage = new GooglePO(driver); 
    }

    @Test
    public void TC01Pesquisar_Google(){

        googlePage.pesquisar("Batata Frita");

        String resultado = googlePage.divResultadoPesquisa.getText();

        assertTrue(resultado, resultado.contains("Aproximadamente"));

    }

    @Test
    public void TC02Resultado(){

        googlePage.pesquisar("Batata Frita");

        String resultado = googlePage.resultadoTest();

        assertTrue(resultado, resultado.contains("resultados"));
    }
}
