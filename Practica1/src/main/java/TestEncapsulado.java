
public class TestEncapsulado {

    public static void main(String[] args) {
        testLogin();
        //este metodo no funciona
        //testHackeo();
    }

    public static void testLogin() {
        SesionDeUsuario sesionDeUsuario = new SesionDeUsuario();
        sesionDeUsuario.setUsuario("sofia");
        //podemos notar que el password es incorrecto
        sesionDeUsuario.setPassword("uvwxyz");
        sesionDeUsuario.doLogin();

        if (sesionDeUsuario.isLoggedIn()) {
            System.out.println("Bienvenido " + sesionDeUsuario.getUsuario());
        } else {
            System.out.println("Su usuario o contraseña están equivocados");
        }
        //aqui podemos notar que se repite una segunda vez
        sesionDeUsuario.setPassword("abcdef");
        sesionDeUsuario.doLogin();
        if (sesionDeUsuario.isLoggedIn()) {
            System.out.println("Bienvenido " + sesionDeUsuario.getUsuario());
        } else {
            System.out.println("Su usuario o contraseña estan equivocados");
        }
    }

    /*public static void testHackeo() {
        SesionDeUsuario sesionDeUsuario = new SesionDeUsuario();
        sesionDeUsuario.getPassword();
        sesionDeUsuario.setLoggedIn(true);
    }*/
}
