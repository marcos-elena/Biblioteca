import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String texto;
        //set libro

        Libros libro1= new Libros();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Titulo");
        texto = entrada.nextLine();
        libro1.setTitulo(texto);

        System.out.println("ISBN");
        texto = entrada.nextLine();
        libro1.setIsbn(texto);

        System.out.println("Autor");
        texto = entrada.nextLine();
        libro1.setAutor(texto);

        System.out.println("Genero");
        texto = entrada.nextLine();
        libro1.setGenero(texto);

        System.out.println("Fecha Publicación");
        texto = entrada.nextLine();
        libro1.setFechaPublicacion(texto);

        //Libros libro1= new Libros();
        //libro1.setTitulo("Libro1");
        //libro1.setIsbn("54915431645");
        //libro1.setAutor("Rubén");
        //libro1.setGenero("acción");
        //libro1.setFechaPublicacion("10/12/2004");

        //imprime libro

        System.out.println(libro1.getTitulo());
        System.out.println(libro1.getIsbn());
        System.out.println(libro1.getAutor());
        System.out.println(libro1.getGenero());
        System.out.println(libro1.getFechaPublicacion());

        //set genero

        /*Genero genero1= new Genero();
        genero1.setId(1);
        genero1.setNombre("acción");
        genero1.setDescripcion("Descripción del género");

        //imprime genero

        System.out.println(genero1.getId());
        System.out.println(genero1.getNombre());
        System.out.println(genero1.getDescripcion());

        //set autor

        Autores ruben= new Autores();
        ruben.setNombre("Rubén");
        ruben.setApellidos("Sanchez");
        ruben.setFechaNacimiento("01/01/2001");
        ruben.setLocalidadNacimiento("España");

        //imprime autor

        System.out.println(ruben.getNombre());
        System.out.println(ruben.getApellidos());
        System.out.println(ruben.getFechaNacimiento());
        System.out.println(ruben.getLocalidadNacimiento());

        //set user

        User usuario1= new User();
        usuario1.setNombre("Marcos");
        usuario1.setApellidos("Elena");
        usuario1.setDni("70838846L");
        usuario1.setTelefono("600254978");
        usuario1.setDireccion("C/ Castilla");
        usuario1.setPoblacion("Ávila");

        //imprime user

        System.out.println(usuario1.getNombre());
        System.out.println(usuario1.getApellidos());
        System.out.println(usuario1.getDireccion());
        System.out.println(usuario1.getDni());
        System.out.println(usuario1.getTelefono());
        System.out.println(usuario1.getPoblacion());
         */


    }
}
