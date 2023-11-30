
package aula04;

public class Aula04 {

    public static void main(String[] args) {
    
        // INSTANCIANDO DA CLASSE CANETA
        
        Caneta c1 = new Caneta();
        
        // ACESSO AOS MÉTODOS MODIFICADORES DA CLASSE DO OBJETO
        
        c1.setModelo("BIC");
        
        //c1.modelo = "BIC";
        
        c1.setPonta(0.5f);
        
        //c1.ponta = 0.5f;
        
        // ACESSO AOS MÉTODOS
        
        //c1.status();
    
        // USO DE MÉTODOS ACESSORES
        
        System.out.println("Esta é uma caneta MODELO: " + c1.getModelo() +
                ", com PONTA: " + c1.getPonta() + ".");
        
    }
    
}