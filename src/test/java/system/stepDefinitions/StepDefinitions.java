package system.stepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import static org.junit.jupiter.api.Assertions.*;
import static system.helpers.PagesURL.PLP;

import system.pages.MainPage;

public class StepDefinitions {

    @Dado ("que o usuário acessou o site")
    public void acessarPaginaPrincipal() {
        MainPage paginaPrincipal = new MainPage();
        paginaPrincipal.acessar();
    }

    @Quando ("o conteúdo da página principal é mostrado")
    public void conteudoMostrado() {
    }

    @Então ("o usuário clica no menu e no submenu desejado")
    public void clickMenuEEscolherCategoria() {
        MainPage paginaPrincipal = new MainPage();

          paginaPrincipal.clickMenu();
          paginaPrincipal.categoryChoice();
          paginaPrincipal.subCategoryChoice();

        assertEquals(
                PLP,
                paginaPrincipal.getPLPSubTitle(),
                "O subtítulo está correto"
        );
    }

    @E ("escolhe o produto para adicionar")
    public void addToCart() {
        MainPage paginaPrincipal = new MainPage();
        paginaPrincipal.addToCart();
    }

    @E ("o usuário entrou no carrinho")
    public void goToCart() {
        MainPage paginaPrincipal = new MainPage();
        paginaPrincipal.goToCart();
    }

    @E ("o conteúdo do carrinho é mostrado")
    public void conteudoCarrinho() {
    }

    @Então ("ele procede para compra")
    public void goToCheckout() {
        MainPage paginaPrincipal = new MainPage();
        paginaPrincipal.goToCheckout();
    }

    @E ("a página de login é exibida")
    public void paginaLogin() {

    }

    @E ("ele digita o {string} e {string}")
    public void fazerLogin(String email, String senha) {
        MainPage paginaPrincipal = new MainPage();
        paginaPrincipal.fazerLogin(email, senha);
    }

    @E ("seleciona para iniciar sessão")
    public void clickToLogin() {
        MainPage paginaPrincipal = new MainPage();
        paginaPrincipal.clickToLogin();
    }

    @Então ("os enderecos de entrega são mostrados")
    public void listaEnderecos() {
        }

    @E ("o usuário confirma seu {string} de entrega para realizar compra")
    public void messageAddress(String endereco) {
        MainPage paginaPrincipal = new MainPage();
        assertEquals(
                endereco,
                paginaPrincipal.messageAddress(),
                "O endereço está correto"
        );
    }
}
