package org.example.controlefinancas.model;


import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private Double valor;
    private Date data;
    private String tipo;

   @ManyToOne
    private Usuario usuario;

   public Long getId(){
       return id;
   }

   public void setId(Long id){
       this.id = id;
   }

   public String getDescricao(){
       return descricao;
   }

   public void setDescricao(String descricao){
       this.descricao = descricao;
   }

   public Double getValor(){
       return valor;
   }

   public void setValor(Double valor){
       this.valor = valor;
   }

   public Date getData(){
         return data;
   }

   public void setData(Date data){
       this.data = data;
   }

   public String getTipo(){
       return tipo;
   }

    public void setTipo(String tipo){
         this.tipo = tipo;
    }

    public Usuario getUsuario(){
        return usuario;
    }

    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }

}
