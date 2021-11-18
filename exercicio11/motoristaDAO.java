package com.mycompany.exercicio11;

public class motoristaDAO {

    public boolean checarCNH(motoristaDTO motDTO) {
        if (motDTO.getIdade() >= 18) {
            motDTO.setCNH(true);
        } else {
            motDTO.setCNH(false);
        }
        return motDTO.getCNH();
    }

    public String mensagemCNH(motoristaDTO motDTO) {
        if (this.checarCNH(motDTO) == true) {
            motDTO.setMensagem("O motorista pode obter o CNH.");
        } else {
            motDTO.setMensagem("O motorista NÃO pode obter o CNH.");
        }
        return motDTO.getMensagem();
    }
}
