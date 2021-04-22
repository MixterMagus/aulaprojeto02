package pacoteteste;

import one.digitalinnovation.SuperUsuario;

public class TesteDeAcesso {

    public void testando(){

        SuperUsuario novoSuperUsuario = new SuperUsuario("root2", "123456");
        novoSuperUsuario.getLogin();
        // Isso não funciona: novoSuperUsuario.getSenha();
        var i = 10;
        System.out.println(i);
    }

}
