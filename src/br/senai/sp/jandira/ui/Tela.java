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
		Font fontTextoNormal = new Font("Arial", Font.BOLD, 14);
		Font fontSubtitulo = new Font("Arial", Font.BOLD, 18);
		Font fontResultado = new Font("Arial", Font.BOLD, 18);

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
		lblPeso.setFont(fontTextoNormal);

		JLabel lblAltura = new JLabel("Sua Altura: ");
		lblAltura.setBounds(20, 150, 100, 30);
		lblAltura.setFont(fontTextoNormal);

		JTextField txtPeso = new JTextField();
		txtPeso.setBounds(130, 100, 100, 40);

		JTextField txtAltura = new JTextField();
		txtAltura.setBounds(130, 150, 100, 40);

		JButton btnCalcular = new JButton("Calcular IMC");
		btnCalcular.setBounds(30, 200, 200, 50);

		JLabel lblResultados = new JLabel("Resultados:");
		lblResultados.setBounds(20, 280, 150, 30);
		lblResultados.setFont(fontSubtitulo);

		JLabel lblValorImc = new JLabel("Valor IMC: ");
		lblValorImc.setBounds(20, 340, 80, 30);
		lblValorImc.setFont(fontTextoNormal);

		JLabel lblEstadoIMC = new JLabel("Estado do IMC: ");
		lblEstadoIMC.setBounds(20, 390, 120, 30);
		lblEstadoIMC.setFont(fontTextoNormal);

		JLabel lblMostrarValorImc = new JLabel();
		lblMostrarValorImc.setBounds(150, 340, 300, 30);
		lblMostrarValorImc.setFont(fontResultado);
		lblMostrarValorImc.setForeground(verde);

		JLabel lblMostrarEstadoImc = new JLabel();
		lblMostrarEstadoImc.setBounds(150, 390, 300, 30);
		lblMostrarEstadoImc.setFont(fontResultado);
		lblMostrarEstadoImc.setForeground(verde);

		

		tela.getContentPane().add(lblTitulo);
		tela.getContentPane().add(lblPeso);
		tela.getContentPane().add(lblAltura);
		tela.getContentPane().add(txtPeso);
		tela.getContentPane().add(txtAltura);
		tela.getContentPane().add(btnCalcular);
		tela.getContentPane().add(lblResultados);
		tela.getContentPane().add(lblValorImc);
		tela.getContentPane().add(lblEstadoIMC);
		tela.getContentPane().add(lblMostrarValorImc);
		tela.getContentPane().add(lblMostrarEstadoImc);

		tela.setVisible(true); // aparecer a tela
		
		//Evento de clicar no botão
		btnCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				Imc imc = new Imc();
				imc.setPeso(txtPeso.getText());
				imc.setAltura(txtAltura.getText());
				
				
				lblMostrarValorImc.setText(imc.mostrarImcComoString());
				lblMostrarEstadoImc.setText(imc.mostrarStatusImc());
			}
		});

	}
}
