
package aula02;

public class Caneta {
    
// Atributos

    String modelo;
    
    String cor;
    
    float ponta;
    
    int carga;
    
    boolean tampada;

// Métodos
    
    void status() {
    
        System.out.println("Caneta modelo: " + this.modelo);
        
        System.out.println("Cor da caneta: " + this.cor);
    
        System.out.println("Ponta da caneta: " + this.ponta);
        
        System.out.println("Caneta esta com a carga em: " + this.carga);
        
        System.out.println("A caneta esta tampada? " + this.tampada);
                
    
    }
        
    void rabiscar() {
    
    
        
    }
    
    void tampar() {
    
        this.tampada = true;
    
    }
    
    void destampar() {
    
        this.tampada = false;
    
    }
        
}
