package br.edu.cse.server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.cse.entity.DisciplinaSerie;
import br.edu.cse.repository.DisciplinaSerieRepository;

@Service
public class DisciplinaSerieService {
	
	@Autowired
	private DisciplinaSerieRepository repository;
	
	public List<DisciplinaSerie> getDisciplinasByCursoSerieAnoSem(Long codEmpresa, Long codCurso,Integer serie, Integer anoLetivo, Integer sem){
		return repository.getDisciplinasByCursoSerieAnoSem(codEmpresa, codCurso, serie, anoLetivo, sem);
	}

}
