package org.geneation.LojaFarmacia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_produto")
public class Produto {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)		
		private long id;
		
		@NotNull
		@Size(min = 5, max = 20)
		private String titulo;


		@ManyToOne
		@JsonIgnoreProperties("produto")
		private Categoria categoria;
		
		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public Categoria getCategoria() {
			return getCategoria();
		}

		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}
		
		
	}

