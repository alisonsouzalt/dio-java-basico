public class MinhaClasse {
    
public static void main (String [] args) {

    String primeiroNome = "Alison";
    String segundoNome = "Souza";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    System.out.println(nomeCompleto);

}

public static String nomeCompleto (String primeiroNome, String SegundoNome){

    return "Resultado do método " + primeiroNome.concat(" ").concat(SegundoNome);

}

}
