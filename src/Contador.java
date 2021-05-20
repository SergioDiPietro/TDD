public class Contador {

// Atributos
    
    private int valorInicial;
    private int incremento;
    private int valorLimite;
    private int valorActual;
    
// Constructores
    
    public Contador() {
        valorInicial = 0;
        incremento = 1;
        valorActual = valorInicial;
        System.out.println("El límite debe ser especificado siempre.");
    }

    public Contador(int valorLimite) {
        valorInicial = 0;
        incremento = 1;
        valorActual = valorInicial;
        this.valorLimite = valorLimite;
    }

    public Contador(int valorInicial, int incremento, int valorLimite) {
        this.valorInicial = valorInicial;
        this.incremento = incremento;
        this.valorLimite = valorLimite;
        valorActual = valorInicial;
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

    public int getValorActual() {
        return valorActual;
    }

    public void setValorActual(int valorActual) {
        this.valorActual = valorActual;
    }
    
// Métodos
        
    public void incrementarContador() {
        if ((getValorActual() + getIncremento()) <= getValorLimite()) {
            setValorActual(getValorActual() + getIncremento());
        } else {
            System.out.println("Límite superado");
            setValorActual(getValorInicial());
        }  
    }
}
