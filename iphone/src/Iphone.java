public class Iphone implements Musica, Telefone, Internet {

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página!");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando!");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz!");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música!");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música!");
    }

    @Override
    public void selecionar() {
        System.out.println("Selecionando música!");
    }
    
}