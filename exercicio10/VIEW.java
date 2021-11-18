package com.mycompany.exercicio10;

import javax.swing.JOptionPane;

public class VIEW {

    public static void main(String[] args) {
        try {
            DTO funcDTO = new DTO();
            CTR funcCTR = new CTR();

            funcDTO.setCode(JOptionPane.showInputDialog("Código: "));
            funcDTO.setTel(Integer.parseInt(JOptionPane.showInputDialog("Telefone: ")));

            JOptionPane.showMessageDialog(null, funcCTR.mostrarCode(funcDTO));
            JOptionPane.showMessageDialog(null, funcCTR.mostrarTel(funcDTO));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Oops, algo deu errado. \n" + e.getMessage());

        }
    }
}
