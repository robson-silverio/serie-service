package br.edu.cse.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.edu.cse.entity.DisciplinaSerie;

@Repository
public class DisciplinaSerieRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final String QUERY = "select cod_disc as codDisciplina ,des_disc as descDisciplina ,"
			+ "cod_empr as codEmpresa,cod_curs as codCurso ,ano_leti as anoLetivo ,sem_leti as semLetivo ,CARG_HOR as cargaHoraria " + 
			"from " + 
			"( " + 
			"select distinct " + 
			"d2.cod_disc,d2.des_disc,g.ID_GRADE,a.cod_empr,g.cod_curs,a.ano_leti,a.sem_leti,d2.CARG_HOR " + 
			"from ACD.G_GRAANO a " + 
			"left join ACD.G_GRADES g on a.ID_GRADE = g.ID_GRADE " + 
			"left join ACD.G_GRADIS d on d.ID_GRADE = g.ID_GRADE " + 
			"left join ACD.DISCIP d2 on d2.COD_DISC = d.COD_DISC and d2.cod_empr = a.cod_empr " + 
			"where " + 
			"a.COD_EMPR=? " + 
			"and g.COD_CURS= ? " + 
			"and a.SERIE = ? " + 
			"and a.ano_leti = ? " + 
			"and a.sem_leti= ? " + 
			") a " + 
			"order by 2";

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<DisciplinaSerie> getDisciplinasByCursoSerieAnoSem(Long codEmpresa,Long codCurso,Integer serie,Integer anoLetivo,Integer sem ){
		return jdbcTemplate.query(QUERY, new  BeanPropertyRowMapper(DisciplinaSerie.class), codEmpresa,codCurso,serie,anoLetivo, sem);
	}

}
