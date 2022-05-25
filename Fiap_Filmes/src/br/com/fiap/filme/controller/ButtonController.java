package br.com.fiap.filme.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Interface_Grafica.Tela_Inicial;

public class ButtonController implements ActionListener {
	
	private Tela_Inicial view;
	
	public ButtonController(Tela_Inicial view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Tela_Inicial.carregarDados();
	}

}
