package br.com.meta.aula3.exercicio4;

public class Material {

    private double massaInicial, massaFinal;
    private int intervalo;

    public double getMassaInicial() {
        return massaInicial;
    }

    public void setMassaInicial(double massaInicial) {
        this.massaInicial = massaInicial;
    }
    
    public double getMassaFinal() {
        return massaFinal;
    }

    public void setMassaFinal(double massaFinal) {
        this.massaFinal = massaFinal;
    }

    public int getIntervalo() {
        return intervalo;
    }

    public void setIntervalo(int intervalo) {
        this.intervalo = intervalo;
    }

    public String calcularTempoTamanhoMenor() {
        setMassaFinal(getMassaInicial());
        double tempoTotal = 0;

        while (massaFinal > 0.5) {
            tempoTotal += intervalo;
            massaFinal /= 2;
        }
        return converterTempo(tempoTotal);
    }

    public String converterTempo(double tempo) {
        
        int hora = (int) Math.floor(tempo / 3600);
        int minuto = (int) Math.floor(((tempo / 3600) - hora) * 60);
        int segundo = (int)  Math.floor(((((tempo / 3600) - hora) * 60) - minuto) * 60);
        
        return hora + "h " + minuto + "m " + segundo + "s";
    }

}
