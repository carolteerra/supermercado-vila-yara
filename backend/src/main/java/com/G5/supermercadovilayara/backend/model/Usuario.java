package com.G5.supermercadovilayara.backend.model;

import javax.persistence.*;
import java.util.Objects;

@Entity

public class Usuario {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String nome;
        private String sobrenome;
        private String senha;
        private String email;

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public String getSobrenome() {
                return sobrenome;
        }

        public void setSobrenome(String sobrenome) {
                this.sobrenome = sobrenome;
        }

        public String getSenha() {
                return senha;
        }

        public void setSenha(String senha) {
                this.senha = senha;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (!(o instanceof Usuario)) return false;
                Usuario usuario = (Usuario) o;
                return Objects.equals(id, usuario.id) && nome.equals(usuario.nome) && Objects.equals(sobrenome, usuario.sobrenome) && email.equals(usuario.email);
        }

        @Override
        public int hashCode() {
                return Objects.hash(id, nome, sobrenome, email);
        }
}
