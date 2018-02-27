package br.edu.cse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.cse.entity.DisciplinaSerie;
import br.edu.cse.server.DisciplinaSerieService;

@RestController
@CrossOrigin
@RequestMapping("/disciplinaSerie")
public class DisciplinaSerieController {
	
	@Autowired
	private DisciplinaSerieService service;
	
	@GetMapping("/empresa/{empresa}/curso/{curso}/serie/{serie}/anoLestivo/{anoLetivo}/semestre/{sem}")
	public List<DisciplinaSerie> getDisciplinasByCursoSerieAnoSem(@PathVariable Long empresa, @PathVariable Long curso,@PathVariable Integer serie,@PathVariable Integer anoLetivo,@PathVariable Integer sem){
		return service.getDisciplinasByCursoSerieAnoSem(empresa, curso, serie, anoLetivo, sem);
	}

}
