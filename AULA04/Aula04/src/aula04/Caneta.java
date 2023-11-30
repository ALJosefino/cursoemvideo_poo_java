
package aula04;

public class Caneta {

    // DECLARAÇÃO DE ATRIBUTOS COM VISIBILIDADES DE ACESSO
    
    private String modelo;
    
    private float ponta;
    
    private String cor;
    
    private boolean tampada;
    
    // MÉTODO CONSTRUTOR
    
    public Caneta() {
                
        this.setTampada(true);
        
        // this.tampada = true;
                
        this.setCor("Azul");        
            
        // this.cor = "Azul";
        
        this.setPonta(0.4f);
        
        // this.ponta = 0.4f; 
    
    }
        
    // MÉTODOS ACESSORES E MODIFICADORES
    
    public String getModelo() {
    
        return this.modelo;
    
    }
    
    public void setModelo( String m ) {
    
        this.modelo = m;
    
    }
    
    public float getPonta() {
    
        return this.ponta;
    
    }
    
    public void setPonta( float p ) {
    
        this.ponta = p;
    
    }
    
    
    public String getCor() {
    
        return this.cor;
    
    }
        
    public void setCor( String c ) {
    
        this.cor = c;
    
    }
    
    public boolean getTampada() {
    
        return this.tampada;
    
    }
    
    public void setTampada( boolean t ) {
    
        this.tampada = t;
    
    }
        
    // OUTROS MÉTODOS
    
    public void tampar() {
    
        this.setTampada(true);
    
    }
    
    public void destampar() {
    
        this.setTampada(false);
    
    }
        
    public void status() {
    
        System.out.println("SOBRE ESTA CANETA: ");
        
        System.out.println("Caneta MODELO: " + this.getModelo() );
     
        System.out.println("Caneta com PONTA: " + this.getPonta() );
        
        System.out.println("Caneta COR: " + this.getCor() );
        
        System.out.println("Caneta TAMPADA?: " + this.getTampada() );
        
        System.out.println("_______________________________________________");
                
    }
        
}