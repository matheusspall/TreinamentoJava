package Aula3.Exercicio6;

public class Curso {
    private int codigo;
    private int numVagas;
    private int numCandMasc;
    private int numCandFem;
    
    public Curso(int codigo, int numVagas, int numCandMasc, int numCandFem){
        this.codigo = codigo;
        this.numVagas = numVagas;
        this.numCandMasc = numCandMasc;
        this.numCandFem = numCandFem;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumVagas() {
        return numVagas;
    }

    public void setNumVagas(int numVagas) {
        this.numVagas = numVagas;
    }

    public int getNumCandMasc() {
        return numCandMasc;
    }

    public void setNumCandMasc(int numCandMasc) {
        this.numCandMasc = numCandMasc;
    }

    public int getNumCandFem() {
        return numCandFem;
    }

    public void setNumCandFem(int numCandFem) {
        this.numCandFem = numCandFem;
    }
    
    public int getTotalCand(){
        return numCandMasc + numCandFem;
    }
    
    public double getCandVaga(){
        return getTotalCand() / numVagas;
    }
    
    public double getPercCandFem(){
        return (numCandFem * 100) / getTotalCand();
    }
    
    
}
