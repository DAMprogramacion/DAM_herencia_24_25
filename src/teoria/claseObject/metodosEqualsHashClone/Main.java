package teoria.claseObject.metodosEqualsHashClone;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Alumno alumno = new Alumno("12345678a", "Federico García");
        //decimos cambiar el nombre al alumno, pero para esto vamos a intentar consevar la referencia alumno
        Alumno alumnoNew = alumno;
        alumnoNew.setNombreAlumno("Gustavo García");
        System.out.println("Alumno inicial");
        System.out.println(alumno);
        System.out.println("Alumno nuevo");
        System.out.println(alumnoNew);
        /// ////// Vamos a usar otro aluno
        System.out.println("==============================");
        Alumno alumna = new Alumno("12345678b", "Irene Montes");
        Alumno alumnaOld = (Alumno) alumna.clone();
        alumna.setNombreAlumno("Alicia Montes");
        System.out.println("Alumna inicial");
        System.out.println(alumnaOld);
        System.out.println("Alumna nuevo");
        System.out.println(alumna);

    }
}
