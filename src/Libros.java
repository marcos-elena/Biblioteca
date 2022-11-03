public class Libros {
    private String titulo;
    private String isbn;
    private String autor;
    private String genero;
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
    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getFechaPublicacion(){
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
}
