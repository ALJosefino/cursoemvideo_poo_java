
package aula03;

public class Caneta {

        public String modelo;
        
        public String cor;
        
        private float ponta;
        
        protected int carga;
        
        protected boolean tampada;
        
        public void status() {
        
            System.out.println( "Caneta modelo: " + this.modelo );
            
            System.out.println( "Caneta cor: " + this.cor );
            
            System.out.println( "Caneta ponta: " + this.ponta );
            
            System.out.println( "Caneta com carga: " + this.carga );
        
            System.out.println( "Caneta esta tampada? " + this.tampada );
            
        }
    
        public void rabiscar() {
        
            if ( this.tampada == true ) {
            
                System.out.println("ERRO! Não pode rabiscar, esta tampada. ");
            
            } else {
            
                System.out.println( "Esta rabiscando! " );
                
            }
                    
        }
        
        private void tampar() {
                    
            this.tampada = true;
            
        }

        private void destammpar() {

            this.tampada = false;
        
        }

}