package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Imc;

public class Tela {

	public void iniciar() {

		// Fontes da minha tela
		Font fontTitulo = new Font("Arial", Font.PLAIN, 22);
		Font fontTextoNormal = new Font("Arial", Font.PLAIN, 14);
		Font fontSubtitulo = new Font("Arial", Font.BOLD, 18);
		Font fontResultado = new Font("Arial", Font.BOLD, 14);

		// Cores da minha tela
		Color verde = new Color(0, 128, 0);
		Color Azul = new Color(73, 45, 208);

		JFrame tela = new JFrame();
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setSize(600, 800);
		tela.setTitle("Calculadora de IMC");
		tela.setLayout(null);

		JLabel lblTitulo = new JLabel("Cáculo de IMC ");
		lblTitulo.setBounds(20, 20, 300, 50);
		lblTitulo.setFont(fontTitulo);
		lblTitulo.setForeground(Azul);

		JLabel lblPeso = new JLabel("Seu Peso:");
		lblPeso.setBounds(20, 100, 70, 30);
		lblTitulo.setFont(fontTextoNormal);

		JLabel lblAltura = new JLabel("Sua Altura: ");
		lblAltura.setBounds(20, 150, 70, 30);
		lblTitulo.setFont(fontTextoNormal);

		JTextField txtPeso = new JTextField();
		txtPeso.setBounds(100, 100, 100, 40);

		JTextField txtAltura = new JTextField();
		txtAltura.setBounds(100, 150, 100, 40);

		JButton btnCalcular = new JButton("Calcular IMC");
		btnCalcular.setBounds(30, 200, 200, 50);

		JLabel lblResultados = new JLabel("Resultados:");
		lblResultados.setBounds(20, 280, 70, 30);

		JLabel lblValorImc = new JLabel("Valor IMC: ");
		lblValorImc.setBounds(20, 340, 80, 30);
		lblTitulo.setFont(fontTextoNormal);

		JLabel lblEstadoIMC = new JLabel("Estado do IMC: ");
		lblEstadoIMC.setBounds(20, 390, 120, 30);
		lblTitulo.setFont(fontTextoNormal);

		JLabel lblMostraValorImc = new JLabel();
		lblMostraValorImc.setBounds(150, 340, 300, 30);

		JLabel lblMostraEstadoImc = new JLabel();
		lblMostraEstadoImc.setBounds(150, 390, 300, 30);

		

		tela.getContentPane().add(lblTitulo);
		tela.getContentPane().add(lblPeso);
		tela.getContentPane().add(lblAltura);
		tela.getContentPane().add(txtPeso);
		tela.getContentPane().add(txtAltura);
		tela.getContentPane().add(btnCalcular);
		tela.getContentPane().add(lblResultados);
		tela.getContentPane().add(lblValorImc);
		tela.getContentPane().add(lblEstadoIMC);
		tela.getContentPane().add(lblMostraValorImc);
		tela.getContentPane().add(lblMostraEstadoImc);

		tela.setVisible(true); // aparecer a tela
		
		//Evento de clicar no botão
		btnCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				Imc imc = new Imc();
				imc.setPeso(txtPeso.getText());
				imc.setAltura(txtAltura.getText());
				
				
				lblMostraValorImc.setText(imc.mostrarImcComoString());
				lblMostraEstadoImc.setText(imc.mostrarStatusImc());
			}
		});

	}
}
