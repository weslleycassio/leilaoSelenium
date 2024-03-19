import br.com.alura.leilao.controller.LoginPage;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginTest {

    private LoginPage paginaLogin;

    @BeforeEach
    public void beforeEach() {
        this.paginaLogin = new LoginPage();
    }

    void afterEach(){
        this.paginaLogin.fechar();
    }
    @Test
    void loginComDadosValidos() {
        paginaLogin.preencheFormulario("fulano", "pass");
        paginaLogin.efetuaLogin();

        Assert.assertFalse(paginaLogin.isPaginaLogin());

    }
}
