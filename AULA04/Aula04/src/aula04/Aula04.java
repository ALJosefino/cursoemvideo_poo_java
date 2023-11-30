
package aula04;

public class Aula04 {

    public static void main(String[] args) {
     
        // INSTANCIANDO DA CLASSE CANETA
        
        /*
        
        Caneta c1 = new Caneta();
        
        // ACESSO AOS MÉTODOS MODIFICADORES DA CLASSE DO OBJETO
        
                
        c1.setModelo("BIC");
        
        //c1.modelo = "BIC";
        
        c1.setPonta(0.5f);
        
        // c1.ponta = 0.5f;
        
        // ACESSO AOS MÉTODOS
        
        // c1.status();
    
        // USO DE MÉTODOS ACESSORES
        
        System.out.println("Esta é uma caneta MODELO: " + c1.getModelo() +
                ", com PONTA: " + c1.getPonta() + "."); 
        
        */        
        
        // INSTANCIANDO DA CLASSE CANETA MAIS VEZES
        
        /* 

        Caneta c2 = new Caneta();
        
        c2.status();
    
        Caneta c3 = new Caneta();
        
        c3.status();
        
        Caneta c4 = new Caneta();
        
        c4.status();
    
        */

        /* INSTANCIA DA CLASSE CANETA COM MÉTODO CONSTRUTOR 
        COM PASSAGEM DE PARÂMETROS */
        
        Caneta c5 = new Caneta( "NIC", "Azul", 0.4f, true);
     
        c5.status();
        
        
        Caneta c6 = new Caneta ("KKK", "Laranha", 1.5f, false);
        
        c6.status();
    
    }
    
}