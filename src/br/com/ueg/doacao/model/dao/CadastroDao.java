package br.com.ueg.doacao.model.dao;

import br.com.ueg.doacao.model.Ong;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by cesar on 25/06/17.
 */
public class CadastroDao  {





    public void cadastroDao(Ong ong) throws SQLException {

        Connection conn= DriverManager.getConnection("jdc:postgresql://localhost:5432/doacao/");

        String sql= "INSERT INTO ong values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stm= conn.prepareStatement(sql);

        stm.setString(1,ong.getRazaoSocial());
        stm.setString(2,ong.getNomeFantasia());
        stm.setString(3,ong.getPresidente());
        stm.setString(4,ong.getRepresentante());
        stm.setString(5,ong.getCnpj());
        stm.setString(6,ong.getFundacao());
        stm.setString(7,ong.getTipoDoacao());
        stm.setString(8,ong.getTelefone());
        stm.setString(9,ong.getCep());
        stm.setString(11,ong.getLogradouro());
        stm.setString(12,ong.getNumero());
        stm.setString(13,ong.getComplemento());
        stm.setString(14,ong.getBairro());
        stm.setString(15,ong.getUf());
        stm.setString(16,ong.getCidade());
        stm.setString(17,ong.getEmail());
        stm.setString(18,ong.getFacebook());
        stm.setString(19,ong.getWhatsapp());

        stm.executeUpdate();

        conn.isClosed();




    }
}


