public abstract class Livro {
    String titulo;
    String autor;
    boolean reservado;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.reservado = false;
    }

    public void reservar() {
        this.reservado = true;
        System.out.println("livro reservado com sucesso!");
    }


    public void cancelarReserva() {
        this.reservado = false;
        System.out.println("reserva cancelada com sucesso!");
    }
}
