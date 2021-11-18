package com.mycompany.exercicio10;

public class DAO {

    public String mostrarCode(DTO funcDTO) {
        return "O código do funcionário é: " + funcDTO.getCode();
    }

    public String mostrarTel(DTO funcDTO) {
        return "O telefone do funcionário é: " + funcDTO.getTel();
    }
}
