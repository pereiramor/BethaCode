package service;

import model.Funcionario;
import util.ConectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FuncionarioService implements IService<Funcionario>{
    @Override
    public Funcionario save(Funcionario funcionario) throws SQLException, ClassNotFoundException {
        Connection conn = ConectionManager.getConnection();
        PreparedStatement insert = conn.prepareStatement("insert into curso.Funcionarios values(?,?,?,?,)");
        insert.setInt(1, funcionario.getId());
        insert.setString(2, funcionario.getNome());
        insert.setString(3, funcionario.getCpf());
        insert.setDouble(4, funcionario.getSalario());
        insert.executeUpdate();
        conn.close();

        return funcionario;
    }

    @Override
    public Funcionario update(Funcionario funcionario) throws SQLException, ClassNotFoundException {
        Connection conn = ConectionManager.getConnection();
        PreparedStatement update = conn.prepareStatement("UPDATE curso.Funcionarios SET nome = ?, cpf = ?, salario = ?,bonus = ? WHERE id = ?");
        update.setString(1, funcionario.getNome());
        update.setString(2, funcionario.getCpf());
        update.setDouble(3, funcionario.getSalario());
        update.setInt(5, funcionario.getId());
        update.executeUpdate();
        conn.close();

        return funcionario;
    }

    @Override
    public Funcionario delete(Funcionario funcionario) throws SQLException, ClassNotFoundException {
        Connection conn = ConectionManager.getConnection();
        PreparedStatement statement2 = conn.prepareStatement("DELETE FROM curso.Funcionarios WHERE ID = ?");
        statement2.setInt(1, funcionario.getId());
        statement2.executeUpdate();
        conn.close();

        return funcionario;
    }
    }
