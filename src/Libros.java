public class Libros {
    private String titulo;
    private String isbn;
    private Autores autor;
    private Genero genero;
    private String fechaPublicacion;

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getIsbn(){
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public Autores getAutor(){
        return autor;
    }

    public void setAutor(Autores autor) {
        this.autor = autor;
    }
    public Genero getGenero(){
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    public String getFechaPublicacion(){
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public void setAutor(String next) {
    }

    public void setGenero(String next) {
    }
}
