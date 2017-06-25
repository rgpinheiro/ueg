package br.com.ueg.doacao.view.ongs;

import br.com.ueg.doacao.model.Ong;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;


import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class CadastroController implements Initializable {


    @FXML
    private JFXTextField razaoSocial;
    @FXML
    private JFXTextField nomeFantasia;
    @FXML
    private JFXTextField presidente;
    @FXML
    private JFXTextField representante;
    @FXML
    private JFXTextField cnpj;
    @FXML
    private JFXDatePicker fundacao;
    @FXML
    private JFXComboBox<String> tipoDoacao;
    @FXML
    private JFXTextField telefone;
    @FXML
    private JFXTextField cep;
    @FXML
    private JFXTextField logradouro;
    @FXML
    private JFXTextField numero;
    @FXML
    private JFXTextField complemento;
    @FXML
    private JFXTextField bairro;
    @FXML
    private JFXComboBox<String> uf;
    @FXML
    private JFXTextField cidade;
    @FXML
    private JFXTextField email;
    @FXML
    private JFXTextField facebook;
    @FXML
    private JFXTextField whatsapp;
    @FXML
    private JFXButton salvar;


    @FXML
    public void btCadastrar(ActionEvent event) {

        Ong ong = new Ong();

        ong.setRazaoSocial(razaoSocial.getText());
        ong.setNomeFantasia(nomeFantasia.getText());
        ong.setPresidente(presidente.getText());
        ong.setRepresentante(representante.getText());
        ong.setCnpj(cnpj.getText());
        ong.setFundacao(fundacao.getValue().toString());
        ong.setTipoDoacao(tipoDoacao.getValue());
        ong.setTelefone(telefone.getText());
        ong.setCep(cep.getText());
        ong.setLogradouro(logradouro.getText());
        ong.setNumero(numero.getText());
        ong.setComplemento(complemento.getText());
        ong.setBairro(bairro.getText());
        ong.setUf(uf.getValue());
        ong.setCidade(cidade.getText());
        ong.setEmail(email.getText());
        ong.setWhatsapp(whatsapp.getText());
        ong.setFacebook(facebook.getText());


    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {


        List<String> listaUf = new ArrayList<String>();

        listaUf.add("AC");
        listaUf.add("AL");
        listaUf.add("AM");
        listaUf.add("AP");
        listaUf.add("BA");
        listaUf.add("CE");
        listaUf.add("DF");
        listaUf.add("ES");
        listaUf.add("GO");
        listaUf.add("MA");
        listaUf.add("MG");
        listaUf.add("MS");
        listaUf.add("MT");
        listaUf.add("PA");
        listaUf.add("PB");
        listaUf.add("PE");
        listaUf.add("PI");
        listaUf.add("PR");
        listaUf.add("RJ");
        listaUf.add("RN");
        listaUf.add("RO");
        listaUf.add("RR");
        listaUf.add("RS");
        listaUf.add("SC");
        listaUf.add("SE");
        listaUf.add("SP");
        listaUf.add("TO");

        uf.setItems(FXCollections.observableArrayList(listaUf));

        List<String> tipoDoaçao = new ArrayList<String>();

        tipoDoaçao.add("Dinheiro");
        tipoDoaçao.add("Vestuario");
        tipoDoaçao.add("Eletrodomésticos");
        tipoDoaçao.add("Alimentos");
        tipoDoacao.setItems(FXCollections.observableArrayList(tipoDoaçao));

    }
}
