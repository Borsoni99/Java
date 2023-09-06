public class LivroFisico extends Livro {
    boolean emprestado;

    public LivroFisico(String titulo, String autor){
        super(titulo, autor);
        this.emprestado = false;
    }

    public void emprestar() {
        if (this.reservado){
            if (!this.emprestado) {
                this.emprestado = true;
                System.out.println("livro emprestado com sucesso!");
            }
            else{
                System.out.println("este livro ja esta emprestado.");
            }
        }
        else{
            System.out.println("livro precisa ser reservado primeiro.");
        }
    }

    public void devolver(){
        if (this.emprestado){
            this.emprestado = false;
            System.out.println("livro devolvido com sucesso!");
        }
        else{
            System.out.println("nao é possivel devolver pois este livro nao foi emprestado.");
        }

    }




}
