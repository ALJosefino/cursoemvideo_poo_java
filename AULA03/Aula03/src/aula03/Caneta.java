
package aula03;

public class Caneta {

        String modelo;
        
        String cor;
        
        float ponta;
        
        int carga;
        
        boolean tampada;
        
        void status() {
        
            System.out.println( "Caneta modelo: " + this.modelo );
            
            System.out.println( "Caneta cor: " + this.cor );
            
            System.out.println( "Caneta ponta: " + this.ponta );
            
            System.out.println( "Caneta com carga: " + this.carga );
        
            System.out.println( "Caneta esta tampada? " + this.tampada );
            
        }
    
        void rabiscar() {
        
            if ( this.tampada == true ) {
            
                System.out.println("ERRO! Não pode rabiscar, esta tampada. ");
            
            } else {
            
                System.out.println( "Esta rabiscando! " );
                
            }
                    
        }
        
        void tampar() {
                    
            this.tampada = true;
            
        }

        void destammpar() {

            this.tampada = false;
        
        }

}