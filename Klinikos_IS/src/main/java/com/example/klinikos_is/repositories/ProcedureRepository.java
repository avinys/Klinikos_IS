package com.example.klinikos_is.repositories;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.klinikos_is.models.Procedure;

@Repository
public class ProcedureRepository {

    private final JdbcTemplate jdbcTemplate;

    public ProcedureRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Query all users
    public List<Procedure> getAllProcedures() {
        String sql = "SELECT id_procedura,pavadinimas FROM esybiu_klases.proceduros";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Procedure procedure = new Procedure();
            procedure.setId(rs.getInt("id_procedura"));
            procedure.setName(rs.getString("pavadinimas"));
            return procedure;
        });
    }
}