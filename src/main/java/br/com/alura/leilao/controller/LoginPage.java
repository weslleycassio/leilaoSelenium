package br.com.alura.leilao.controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {
    private static final String URL_LOGIN = "http://localhost:8080/login";
    private WebDriver browser;

    public LoginPage() {

        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
        this.browser = new FirefoxDriver();
        browser.navigate().to(URL_LOGIN);
    }

    public void fechar() {
        browser.quit();
    }

    public void preencheFormulario(String usuario, String senha) {
        browser.findElement(By.id("username")).sendKeys(usuario);
        browser.findElement(By.id("password")).sendKeys(senha);
    }

    public void efetuaLogin() {
        browser.findElement(By.id("login-form")).submit();
    }

    public boolean isPaginaLogin() {
        return browser.getCurrentUrl().equals(URL_LOGIN);
    }
}
