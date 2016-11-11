package br.com.meta.projetointerface.funcionario.administrativo;

import br.com.meta.projetointerface.aluno.Aluno;
import br.com.meta.projetointerface.aluno.ControleAluno;
import br.com.meta.projetointerface.excecoes.FuncionarioException;
import br.com.meta.projetointerface.interfaces.IControleAluno;
import br.com.meta.projetointerface.interfaces.IProfessor;
import br.com.meta.projetointerface.interfaces.IFuncionario;
import br.com.meta.projetointerface.interfaces.IFaxineira;
import java.util.ArrayList;

public class Universidade {

    private IFaxineira faxineira;
    private Jardineiro jardineiro;
    private ArrayList<IProfessor> professores;
    private IControleAluno controleAluno;

    public Universidade() {
        professores = new ArrayList<>();
        controleAluno = new ControleAluno();
    }

    public void setFaxineira(IFaxineira paramFaxineira) throws FuncionarioException {
        if (paramFaxineira.temAutorizacao()) {
            this.faxineira = paramFaxineira;
        } else {
            throw new FuncionarioException("Faxineira sem autorizacao");
        }
    }

    public void setJardineiro(IFuncionario paramJardineiro) throws FuncionarioException {
        if (paramJardineiro.temAutorizacao()) {
            this.jardineiro = (Jardineiro) paramJardineiro;
        } else {
            throw new FuncionarioException("Jardineiro sem autorizacao");
        }
    }

    public void diaDaLimpeza() throws Exception{
        faxineira.lavar();
        faxineira.varrer();
        faxineira.tirarLixo();
        jardineiro.cortarGrama();
        jardineiro.apararArbusto();
    }

    public void adicionarProfessor(IProfessor professor) throws FuncionarioException {
        if (professor.temAutorizacao()) {
            getProfessores().add(professor);
        } else {
            throw new FuncionarioException("Professor sem autorizacao");
        }
    }

    public void listarProfessores() {
        for (IProfessor prof : getProfessores()) {
            System.out.println(prof.dadosPessoais());
        }
    }

    public ArrayList<IProfessor> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<IProfessor> professores) {
        this.professores = professores;
    }
    
    public void adicionarAluno(Aluno aluno){
        getControleAluno().adicionar(aluno);
    }
    
    public void excluirAluno(int indice){
        getControleAluno().excluir(indice);
    }
    
    public ArrayList<Aluno> listarAlunos(){
        return getControleAluno().listagem();
    }

    public IControleAluno getControleAluno() {
        return controleAluno;
    }

    public void setControleAluno(IControleAluno controleAluno) {
        this.controleAluno = controleAluno;
    }

}
