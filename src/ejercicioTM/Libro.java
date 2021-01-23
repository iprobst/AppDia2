package ejercicioTM;

public class Libro {
    private String titulo;
    private String isbn;
    private String autor;
    private boolean disponible;

    public Libro(String titulo, String isbn, String autor, boolean disponible) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.disponible = disponible;
    }

    public Libro(Libro libro) {
        this.titulo = libro.titulo;
        this.isbn = libro.isbn;
        this.autor = libro.autor;
        this.disponible = libro.disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean prestamo(){
        if(isDisponible()){
            setDisponible(false);
            return true;
        }
        return false; //No se realizo el prestamo
    }

    public boolean devolver(){
        if(!isDisponible()){
            setDisponible(true);
            return true;
        }
        return false;//No se realizo la devolucion
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", isbn='" + isbn + '\'' +
                ", autor='" + autor + '\'' +
                ", disponible=" + disponible +
                '}';
    }
}
