public class CantinaMain {
    public static void main(String[] args) {

        System.out.println();
        System.out.println(" .d8888b.         d8888 888b    888 88888888888 8888888 888b    888        d8888");
        System.out.println("d88P  Y88b       d88888 8888b   888     888       888   8888b   888       d88888");
        System.out.println("888    888      d88P888 88888b  888     888       888   88888b  888      d88P888");
        System.out.println("888            d88P 888 888Y88b 888     888       888   888Y88b 888     d88P 888");
        System.out.println("888           d88P  888 888 Y88b888     888       888   888 Y88b888    d88P  888");
        System.out.println("888    888   d88P   888 888  Y88888     888       888   888  Y88888   d88P   888");
        System.out.println("Y88b  d88P  d8888888888 888   Y8888     888       888   888   Y8888  d8888888888");
        System.out.println("  Y8888P   d88P     888 888    Y888     888     8888888 888    Y888 d88P     888");

        Produtos p1 = new Produtos();

        System.out.println();

        p1.adicionarProduto();
        p1.listarProdutos();
        p1.alterarProdutos();
        p1.listarProdutos();
        p1.removerProduto();
        p1.listarProdutos();

    }
}
