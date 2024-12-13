package entities;

public class Agente extends Entidad {
    private String habilidadEspecial;
    private String misionAsignada;
    private int nivel;
    private String equipoActual;  // Nuevo atributo para el equipo actual

    public Agente(int id, String nombre, String habilidadEspecial) {
        super(id, nombre);
        this.habilidadEspecial = habilidadEspecial;
        this.nivel = 0;
        this.equipoActual = null;  // El equipo inicialmente es null
    }

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }

    public String getMisionAsignada() {
        return misionAsignada;
    }

    public void asignarMision(String mision) {
        this.misionAsignada = mision;
    }

    public int incrementarNivel() {
        return this.nivel = nivel + 1;
    }

    public void mostrarNivel() {
        System.out.println("El nivel actual de " + getNombre() + " es: " + this.nivel);
    }

    // Método para asignar el equipo al agente
    public void asignarEquipo(String equipo) {
        this.equipoActual = equipo;
    }

    // Método para obtener el equipo asignado
    public String getEquipoActual() {
        return equipoActual;
    }

    @Override
    public String toString() {
        return super.toString() + 
               ", Habilidad Especial: " + habilidadEspecial +
               (misionAsignada != null ? ", Misión: " + misionAsignada : "") +
               ", Nivel: " + nivel + 
               (equipoActual != null ? ", Equipo: " + equipoActual : "");  // Mostrar equipo si está asignado
    }
}
