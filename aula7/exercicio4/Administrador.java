package br.com.meta.aula7.exercicio4;

public class Administrador extends Pessoa{
    private float horaExtra;
    
    public Administrador(float salario){
        super.setSalario(salario);
    }

    @Override
    public String imprimirSalario() {
        return "Salario: " + (super.getSalario() + ((super.getSalario() * 0.01) * getHoraExtra()));
    }
    
    public void addHoraExtra(){
        horaExtra++;
    }
    
    public float getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(float horaExtra) {
        this.horaExtra = horaExtra;
    }
    
    
    
}
