package br.com.meta.aula6.exerciciocaixaeletronico.caixaeletronico;

import br.com.meta.aula6.exerciciocaixaeletronico.banco.Conta;
import br.com.meta.aula6.exerciciocaixaeletronico.banco.Movimentacao;
import br.com.meta.aula6.exerciciocaixaeletronico.cedula.CaixaCedula;
import java.util.ArrayList;

public class CaixaEletronico {

    private ArrayList<CaixaCedula> listaCedulas = new ArrayList<>();
    private ArrayList<Movimentacao> listaMovimentacao = new ArrayList<>();

    public int getTotalDinheiro() {
        int total = 0;
        for (int i = 0; i < listaCedulas.size(); i++) {
            total += listaCedulas.get(i).getValorTotal();
        }
        return total;
    }

    public String getTotalCedulas() {

        int qtd50 = listaCedulas.get(0).getQtdCedula();
        int qtd20 = listaCedulas.get(1).getQtdCedula();
        int qtd10 = listaCedulas.get(2).getQtdCedula();
        int qtd5 = listaCedulas.get(3).getQtdCedula();
        int qtd2 = listaCedulas.get(4).getQtdCedula();

        return "50 - " + qtd50 + " cedulas disponiveis"
                + "\n20 - " + qtd20 + " cedulas disponiveis"
                + "\n10 - " + qtd10 + " cedulas disponiveis"
                + "\n5 - " + qtd5 + " cedulas disponiveis"
                + "\n2 - " + qtd2 + " cedulas disponiveis";
    }

    public String cedulasDisponiveis() {
        String disponivel = "";
        for (int i = 0; i < listaCedulas.size(); i++) {
            if (listaCedulas.get(i).getQtdCedula() > 0) {
                if (disponivel.isEmpty()) {
                    disponivel += listaCedulas.get(i).getCedula().getValor();
                } else {
                    disponivel += " - " + listaCedulas.get(i).getCedula().getValor();
                }
            }
        }
        return disponivel;
    }

    public boolean validarSaque(int valor) {
        int qtdCedulas;
        for (CaixaCedula cedula : listaCedulas) {

            qtdCedulas = cedula.getQtdCedula();

            if (valor % 2 == 1) {
                valor -= 5;
            } else if ((valor % 2) == 0 && (valor % 5) == 0) {
                while ((valor >= cedula.getCedula().getValor()) && qtdCedulas > 0) {
                    valor -= cedula.getCedula().getValor();
                    qtdCedulas--;
                }
            } else if (cedula.getCedula().getValor() % 2 == 1 && cedula.getQtdCedula() % 2 == 0 && valor % 5 == 0) { //cedula 5 && qtdCedulas for par && valor divisivel por 5
                while ((valor >= cedula.getCedula().getValor()) && qtdCedulas > 1) {
                    valor -= cedula.getCedula().getValor();
                    qtdCedulas--;
                }
            } else if ((valor - cedula.getCedula().getValor()) % 5 == 0) {
                while ((valor >= cedula.getCedula().getValor()) && qtdCedulas > 0) {
                    valor -= cedula.getCedula().getValor();
                    qtdCedulas--;
                }
            } else if (valor == 11 && cedula.getCedula().getValor() != 10) {
                valor -= cedula.getCedula().getValor();
                qtdCedulas--;
            } else if ((valor - cedula.getCedula().getValor()) % 2 == 0) {
                while ((valor >= cedula.getCedula().getValor()) && qtdCedulas > 0) {
                    valor -= cedula.getCedula().getValor();
                    qtdCedulas--;
                }
            } else if (valor % 3 == 0) {
                if (cedula.getCedula().getValor() <= (valor / 2)) {
                    valor -= cedula.getCedula().getValor();
                    qtdCedulas--;
                }
            }
        }
        return valor == 0;
    }

    public String efetuarSaque(int valor) {
        String cedulasRetiradas = "";
        int qtd50 = 0, qtd20 = 0, qtd10 = 0, qtd5 = 0, qtd2 = 0;

        if (validarSaque(valor)) {
            if (valor <= getTotalDinheiro()) {
                while (valor > 0) {
                    if (valor % 2 == 1) {
                        listaCedulas.get(3).removeCedula(); //cedula 5
                        valor -= listaCedulas.get(3).getCedula().getValor(); //valor = valor - 5
                        qtd5++;
                    }
                    for (CaixaCedula cedula : listaCedulas) {
                        if (valor % 2 == 0 && valor % 5 == 0) {
                            while ((valor >= cedula.getCedula().getValor()) && cedula.getQtdCedula() > 0) {
                                cedula.removeCedula();
                                valor -= cedula.getCedula().getValor();

                                switch (cedula.getCedula().getValor()) {
                                    case 50:
                                        qtd50++;
                                        break;
                                    case 20:
                                        qtd20++;
                                        break;
                                    case 10:
                                        qtd10++;
                                        break;
                                    case 5:
                                        qtd5++;
                                        break;
                                    case 2:
                                        qtd2++;
                                        break;
                                }
                            }
                        } else if (cedula.getCedula().getValor() % 2 == 1 && cedula.getQtdCedula() % 2 == 0 && valor % 5 == 0) { //cedula 5 && qtdCedulas for par
                            while ((valor >= cedula.getCedula().getValor()) && cedula.getQtdCedula() > 1) {
                                cedula.removeCedula();
                                valor -= cedula.getCedula().getValor();

                                switch (cedula.getCedula().getValor()) {
                                    case 50:
                                        qtd50++;
                                        break;
                                    case 20:
                                        qtd20++;
                                        break;
                                    case 10:
                                        qtd10++;
                                        break;
                                    case 5:
                                        qtd5++;
                                        break;
                                    case 2:
                                        qtd2++;
                                        break;
                                }
                            }
                        } else if ((valor - cedula.getCedula().getValor()) % 5 == 0) {
                            while ((valor >= cedula.getCedula().getValor()) && cedula.getQtdCedula() > 0) {
                                cedula.removeCedula();
                                valor -= cedula.getCedula().getValor();

                                switch (cedula.getCedula().getValor()) {
                                    case 50:
                                        qtd50++;
                                        break;
                                    case 20:
                                        qtd20++;
                                        break;
                                    case 10:
                                        qtd10++;
                                        break;
                                    case 5:
                                        qtd5++;
                                        break;
                                    case 2:
                                        qtd2++;
                                        break;
                                }
                            }
                        } else if (valor == 11 && cedula.getCedula().getValor() != 10) {
                            cedula.removeCedula();
                            valor -= cedula.getCedula().getValor();

                            switch (cedula.getCedula().getValor()) {
                                case 50:
                                    qtd50++;
                                    break;
                                case 20:
                                    qtd20++;
                                    break;
                                case 10:
                                    qtd10++;
                                    break;
                                case 5:
                                    qtd5++;
                                    break;
                                case 2:
                                    qtd2++;
                                    break;
                            }
                        } else if ((valor - cedula.getCedula().getValor()) % 2 == 0) {
                            while ((valor >= cedula.getCedula().getValor()) && cedula.getQtdCedula() > 0) {
                                cedula.removeCedula();
                                valor -= cedula.getCedula().getValor();

                                switch (cedula.getCedula().getValor()) {
                                    case 50:
                                        qtd50++;
                                        break;
                                    case 20:
                                        qtd20++;
                                        break;
                                    case 10:
                                        qtd10++;
                                        break;
                                    case 5:
                                        qtd5++;
                                        break;
                                    case 2:
                                        qtd2++;
                                        break;
                                }
                            }
                        } else if (valor % 3 == 0) {
                            if (cedula.getCedula().getValor() <= (valor / 2)) {
                                while ((valor >= cedula.getCedula().getValor()) && cedula.getQtdCedula() > 0) {
                                    cedula.removeCedula();
                                    valor -= cedula.getCedula().getValor();

                                    switch (cedula.getCedula().getValor()) {
                                        case 50:
                                            qtd50++;
                                            break;
                                        case 20:
                                            qtd20++;
                                            break;
                                        case 10:
                                            qtd10++;
                                            break;
                                        case 5:
                                            qtd5++;
                                            break;
                                        case 2:
                                            qtd2++;
                                            break;
                                    }
                                }
                            }
                        }
                    }
                }

                if (qtd50 > 0) {
                    cedulasRetiradas += "50 - " + qtd50;
                }
                if (qtd20 > 0) {
                    cedulasRetiradas += "\n20 - " + qtd20;
                }
                if (qtd10 > 0) {
                    cedulasRetiradas += "\n10 - " + qtd10;
                }
                if (qtd5 > 0) {
                    cedulasRetiradas += "\n5 - " + qtd5;
                }
                if (qtd2 > 0) {
                    cedulasRetiradas += "\n2 - " + qtd2;
                }

                return cedulasRetiradas;
            } else {
                return "Valor informado maior que o disponivel.";
            }
        } else {
            return "Valor informado nao pode ser sacado.";
        }
    }

    public void adicionarCaixaCedula(CaixaCedula caixa) {
        getListaCaixaEle().add(caixa);
    }

    public ArrayList<CaixaCedula> getListaCaixaEle() {
        return listaCedulas;
    }

    public void setListaCaixaEle(ArrayList<CaixaCedula> listaCedulas) {
        this.listaCedulas = listaCedulas;
    }

    public ArrayList<Movimentacao> getListaMovimentacao() {
        return listaMovimentacao;
    }

    public void setListaMovimentacao(ArrayList<Movimentacao> listaMovimentacao) {
        this.listaMovimentacao = listaMovimentacao;
    }
    
    public void addMovimentacao(Movimentacao movimentacao){
        listaMovimentacao.add(movimentacao);
    }
    
    public String getMovimentacaoConta(Conta conta){
        String resultado = "";
        
        for(Movimentacao movimentacao : listaMovimentacao){
            if(movimentacao.getConta().equals(conta)){
                resultado += "\nData: " + movimentacao.getData() + ""
                        + "\nTipo: " + movimentacao.getTipoOperacao() + ""
                        + "\nValor: " + movimentacao.getValor();
            }
        }
        return resultado;
        
    }
}
