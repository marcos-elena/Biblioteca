import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //set genero

        Genero genero = new Genero();
        genero.setId(1);
        genero.setNombre("acción");
        genero.setDescripcion("Descripción del género");

        //imprime genero
        /*System.out.println(genero.getId());
        System.out.println(genero.getNombre());
        System.out.println(genero.getDescripcion());*/

        //set autor

        Autores autor = new Autores();
        autor.setNombre("Rubén");
        autor.setApellidos("Sanchez");
        autor.setFechaNacimiento("01/01/2001");
        autor.setLocalidadNacimiento("España");

        //imprime autor
        /*System.out.println(autor.getNombre());
        System.out.println(autor.getApellidos());
        System.out.println(autor.getFechaNacimiento());
        System.out.println(autor.getLocalidadNacimiento());*/

        //set libro

        System.out.println("Rellena los datos del libro...");

        Libros libro= new Libros();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Titulo:");
        libro.setTitulo(entrada.next());

        System.out.println("ISBN:");
        libro.setIsbn(entrada.next());

        System.out.println("Fecha Publicación");
        libro.setFechaPublicacion(entrada.next());

        //Establece el autor del libro
        libro.setAutor(autor);
        //Establece el género del libro
        libro.setGenero(genero);

        //Muestra los datos del libro
        System.out.println("----------------");
        System.out.println("DATOS DEL LIBRO:");
        System.out.println(libro.getTitulo());
        System.out.println(libro.getIsbn());
        System.out.println(libro.getAutor());
        System.out.println(libro.getGenero());
        System.out.println(libro.getFechaPublicacion());
        System.out.println("----------------");

        //set user

        User usuario1= new User();
        usuario1.setNombre("Marcos");
        usuario1.setApellidos("Elena");
        usuario1.setDni("70838846L");
        usuario1.setTelefono("600254978");
        usuario1.setDireccion("C/ Castilla");
        usuario1.setPoblacion("Ávila");

        //imprime user
        /*System.out.println(usuario1.getNombre());
        System.out.println(usuario1.getApellidos());
        System.out.println(usuario1.getDireccion());
        System.out.println(usuario1.getDni());
        System.out.println(usuario1.getTelefono());
        System.out.println(usuario1.getPoblacion());*/

        //set prestamo

        System.out.println("Rellena los datos del prestamo...");

        Prestamo prestamo = new Prestamo();
        prestamo.setId(1);
        prestamo.setLibro(libro);
        prestamo.setUser(usuario1);

        System.out.println("Fecha prestamo:");
        prestamo.setFechaPrestamo(entrada.next());

        System.out.println("Fecha devolución:");
        prestamo.setFechaDevolucion(entrada.next());

        //muestra los datos del prestamo
        System.out.println("-------------------");
        System.out.println("DATOS DEL PRESTAMO:");
        System.out.println("ID: " + prestamo.getId());
        System.out.println("LIBRO: " + prestamo.getLibro());
        System.out.println("USUARIO: " + prestamo.getUser());
        System.out.println("PRESTADO: " + prestamo.getFechaPrestamo());
        System.out.println("DEVOLUCION: " + prestamo.getFechaDevolucion());
        System.out.println("-------------------");

    }
}
