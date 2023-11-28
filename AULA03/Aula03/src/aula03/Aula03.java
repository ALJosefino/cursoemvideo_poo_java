
package aula03;

public class Aula03 {

    public static void main(String[] args) {

        // Instanciada Classe Caneta
       
        Caneta c1 = new Caneta();
        
        // Atributo do objeto instanciado da Classe Caneta
        
        c1.modelo = "BIC Cristal";
        
        c1.cor = "Azul";
        
        /* Retornada visibilidade privada, agora esta comentado 
        pois indica erro  c1.ponta = 0.5f; */
        
        c1.carga = 80;
       
        //c1.tampada = false;
              
        // Método do objeto instanciado da Classe Caneta
        
        c1.tampar();
        
        c1.status();
               
        c1.rabiscar();
       
        
    }
    
}
