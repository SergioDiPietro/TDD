public class Contador {

// Atributos
    
    private int valorInicial;
    private int incremento;
    private int valorLimite;
    
// Constructores
    
   
    public Contador() {
        valorInicial = 0;
        incremento = 1;
        System.out.println("El límite debe ser especificado siempre.");
    }
    
// Getters & Setters
    
    public int getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(int valorInicial) {
        this.valorInicial = valorInicial;
    }

    public int getIncremento() {
        return incremento;
    }

    public void setIncremento(int incremento) {
        this.incremento = incremento;
    }

    public int getValorLimite() {
        return valorLimite;
    }

    public void setValorLimite(int valorLimite) {
        this.valorLimite = valorLimite;
    }
    
// Métodos
        


}
