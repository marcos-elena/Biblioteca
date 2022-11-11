public class Prestamo {

        private Integer id;
        private User user;
        private Libros libro;
        private String fechaPrestamo;
        private String fechaDevolucion;

        public Integer getId(){
                return id;
        }
        public void setId(Integer id) {
                this.id = id;
        }

        public User getUser(){
                return user;
        }
        public void setUser(User user) {
                this.user = user;
        }

        public Libros getLibro(){
                return libro;
        }
        public void setLibro(Libros libro) {
                this.libro = libro;
        }

        public String getFechaPrestamo(){
                return fechaPrestamo;
        }
        public void setFechaPrestamo(String fechaPrestamo) {
                this.fechaPrestamo = fechaPrestamo;
        }

        public String getFechaDevolucion(){
                return fechaDevolucion;
        }
        public void setFechaDevolucion(String fechaDevolucion) {
                this.fechaDevolucion = fechaDevolucion;
        }
}
