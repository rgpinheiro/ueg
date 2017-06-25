package br.com.ueg.doacao.business;

import br.com.ueg.doacao.model.Ong;
import br.com.ueg.doacao.model.dao.CadastroDao;

import java.sql.SQLException;

/**
 * Created by cesar on 25/06/17.
 */
public class Business {


    public  boolean confere(Ong ong){

        CadastroDao cadastro= new CadastroDao();
        try {
            cadastro.cadastroDao(ong);
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return true;




    }





}
