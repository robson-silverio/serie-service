package br.edu.cse.entity;

public class DisciplinaSerie {

	private Long codDisciplina;
	private String descDisciplina;
	private Long codEmpresa;
	private Long codCurso;
	private Integer anoLetivo;
	private Integer semLetivo;
	private Integer cargaHoraria;
	
	public Long getCodDisciplina() {
		return codDisciplina;
	}
	public void setCodDisciplina(Long codDisciplina) {
		this.codDisciplina = codDisciplina;
	}
	public String getDescDisciplina() {
		return descDisciplina;
	}
	public void setDescDisciplina(String descDisciplina) {
		this.descDisciplina = descDisciplina;
	}
	public Long getCodEmpresa() {
		return codEmpresa;
	}
	public void setCodEmpresa(Long codEmpresa) {
		this.codEmpresa = codEmpresa;
	}
	public Long getCodCurso() {
		return codCurso;
	}
	public void setCodCurso(Long codCurso) {
		this.codCurso = codCurso;
	}
	public Integer getAnoLetivo() {
		return anoLetivo;
	}
	public void setAnoLetivo(Integer anoLetivo) {
		this.anoLetivo = anoLetivo;
	}
	public Integer getSemLetivo() {
		return semLetivo;
	}
	public void setSemLetivo(Integer semLetivo) {
		this.semLetivo = semLetivo;
	}
	public Integer getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	
}
