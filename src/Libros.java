public class Libros {
    private String titulo;
    private String isbn;
    private String autor;
    private String genero;
    private String fecha_publicacion;

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
    public String getFecha_publicacion(){
        return fecha_publicacion;
    }

    public void setFecha_publicacion(String fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }
}
