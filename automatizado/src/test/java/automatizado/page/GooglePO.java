package automatizado.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePO extends BasePO {

    /**
     * Construtor para a criação da Página do Google.
     * @param driver Driver da página do Google.
     */
    public GooglePO(WebDriver driver) {
        super(driver);
    }

    /*Método para pesquisar um input */
    @FindBy(name = "q")
    public WebElement inputPesquisa;

    /*Método para pesquisar uma div */
    @FindBy( id = "result-stats")
    public WebElement divResultadoPesquisa;

    /*Método para pesquisar um texto */
    public void pesquisar(String texto){
        inputPesquisa.sendKeys(texto + Keys.ENTER);
    }

    /**
     * Método que retorna o resultado aproximado da pesquisa.
     * @return Retorna o resultado da pesquisa.
     */
    public String resultadoTest(){
        return divResultadoPesquisa.getText();
    }
    
}
