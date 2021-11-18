package com.mycompany.exercicio11;

public class motoristaCTR {

    motoristaDAO motDAO = new motoristaDAO();

    public boolean checarCNH(motoristaDTO motDTO) {
        return motDAO.checarCNH(motDTO);
    }

    public String mensagemCNH(motoristaDTO motDTO) {
        return motDAO.mensagemCNH(motDTO);
    }
}
