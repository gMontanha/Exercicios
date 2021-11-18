package com.mycompany.exercicio10;

public class CTR {

    DAO funcDAO = new DAO();

    public String mostrarCode(DTO funcDTO) {
        return funcDAO.mostrarCode(funcDTO);
    }

    public String mostrarTel(DTO funcDTO) {
        return funcDAO.mostrarTel(funcDTO);
    }
}
