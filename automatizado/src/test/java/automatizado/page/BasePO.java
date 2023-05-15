package automatizado.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/***
 * Classe Base para criação das novas Pages Objects.
 * Todas as pages devem ser herdadas a partir desta classe.
 */
public class BasePO {

    /**Driver que será usado pelas pages */
    protected WebDriver driver;

    /**
     * Construtor base para criação da fábrica de elementos(PageFactory).
     * @param driver Driver da página atual.
     */
    protected BasePO(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
