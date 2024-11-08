import java.io.Console;

public class App {
    public static void main(String[] args) throws Exception {
    
        Console console = System.console();
        String login = console.readLine(fmt:"Digite o login");
        char[] senhaChar = console.readPassword(fmt:"Digite a senha:");

        String senha = new String(senhaChar);

        if(login.equals(anObject:"Pedro") && senha.equals(anObject:"123")){
            System.out.println(x:"Bem vindo");
        } else {
            System.out.println(x:"Login ou senha inválida");
        }
    }
}