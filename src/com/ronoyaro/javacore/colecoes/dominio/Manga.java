package com.ronoyaro.javacore.colecoes.dominio;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String titulo;
    private double preco;


    public Manga(@NotNull Long id, @NotNull String titulo, double preco) {
        Objects.requireNonNull(id, "ID não pode ser nulo");
        Objects.requireNonNull(titulo, "Titulo não pode ser nulo");
        this.id = id;
        this.titulo = titulo;
        this.preco = preco;
    }

    @Override
    public int compareTo(@NotNull Manga o) {
        return this.id.compareTo(o.getId());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id) && Double.compare(preco, manga.preco) == 0 && Objects.equals(titulo, manga.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo, preco);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", preco=" + preco +
                '}';
    }

    public Long getId() {
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
