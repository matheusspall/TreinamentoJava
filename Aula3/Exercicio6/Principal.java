package Aula3.Exercicio6;

public class Principal {

    public static void main(String[] args) {

        Curso cc = new Curso(101, 40, 200, 5);
        Curso si = new Curso(104, 40, 300, 20);

        Vestibular unifra = new Vestibular();
        unifra.adicionarCurso(cc);
        unifra.adicionarCurso(si);

        for (int i = 0; i < unifra.getListaCursos().size(); i++) {
            System.out.println("Codigo curso: " + unifra.getListaCursos().get(i).getCodigo());
            System.out.println("Relacao candidato-vaga: " + unifra.getListaCursos().get(i).getCandVaga());
            System.out.println("Percentagem Mulheres: " + unifra.getListaCursos().get(i).getPercCandFem() + "%");
            
            System.out.println();
        }
        
        System.out.println("Curso com maior relacao candidato-vaga\n" + unifra.getCursoMaiorCandVaga());
        System.out.println("\nTotal de candidatos: " + unifra.getTotalCandVest());

    }
}
