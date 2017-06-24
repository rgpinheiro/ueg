package br.com.ueg.doacao.model;

import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class User implements Initializable{
	
	
	@FXML
	private JFXTextField userNome;
	@FXML
	private JFXPasswordField userSenha;
	@FXML
	private JFXPasswordField userConfirmacaoSenha;
	@FXML
	private JFXCheckBox mostraSenha;
	@FXML
	private JFXTextField userEmail;
	@FXML
	private JFXTextField userCelular;
	@FXML
	private JFXButton btnUserConfirmar;
	@FXML
	private JFXButton btnUserCancelar;
	
	private Long id;
	private String nome;
	private String senha;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	private String email;
	private String telefone;
	public JFXTextField getUserNome() {
		return userNome;
	}
	public void setUserNome(JFXTextField userNome) {
		this.userNome = userNome;
	}
	public JFXPasswordField getUserSenha() {
		return userSenha;
	}
	public void setUserSenha(JFXPasswordField userSenha) {
		this.userSenha = userSenha;
	}
	public JFXPasswordField getUserConfirmacaoSenha() {
		return userConfirmacaoSenha;
	}
	public void setUserConfirmacaoSenha(JFXPasswordField userConfirmacaoSenha) {
		this.userConfirmacaoSenha = userConfirmacaoSenha;
	}
	public JFXCheckBox getMostraSenha() {
		return mostraSenha;
	}
	public void setMostraSenha(JFXCheckBox mostraSenha) {
		this.mostraSenha = mostraSenha;
	}
	public JFXTextField getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(JFXTextField userEmail) {
		this.userEmail = userEmail;
	}
	public JFXTextField getUserCelular() {
		return userCelular;
	}
	public void setUserCelular(JFXTextField userCelular) {
		this.userCelular = userCelular;
	}
	public JFXButton getBtnUserConfirmar() {
		return btnUserConfirmar;
	}
	public void setBtnUserConfirmar(JFXButton btnUserConfirmar) {
		this.btnUserConfirmar = btnUserConfirmar;
	}
	public JFXButton getBtnUserCancelar() {
		return btnUserCancelar;
	}
	public void setBtnUserCancelar(JFXButton btnUserCancelar) {
		this.btnUserCancelar = btnUserCancelar;
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}
	
	
	
	
}
