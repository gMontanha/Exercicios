package com.mycompany.exercicio11;

import javax.swing.JOptionPane;

public class motoristaVIEW {

    public static void main(String[] args) {
        try {
            motoristaDTO motDTO = new motoristaDTO();
            motoristaCTR motCTR = new motoristaCTR();

            motDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade: ")));
            JOptionPane.showMessageDialog(null, motCTR.mensagemCNH(motDTO));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Oops, algo deu errado. \n" + e.getMessage());

        }
    }
}
