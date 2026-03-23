package com.flores.unidad_2.No_Revisados.Tarea_15;
// Tarea 15 - Libro
// Sergio Eliel Flores Urquidy
public class Libro {
     private String titulo;
        private String autor;
        private String editorial;
        private int año;
        private int clasificacion; 

        public Libro(String titulo, String autor, String editorial, int año, int clasificacion) {
            this.titulo      = titulo;
            this.autor       = autor;
            this.editorial   = editorial;
            this.año         = año;
            this.clasificacion = clasificacion;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public String getEditorial() {
            return editorial;
        }

        public void setEditorial(String editorial) {
            this.editorial = editorial;
        }

        public int getAño() {
            return año;
        }

        public void setAño(int año) {
            this.año = año;
        }

        public int getClasificacion() {
            return clasificacion;
        }

        public void setClasificacion(int clasificacion) {
            this.clasificacion = clasificacion;
        }
        
}
