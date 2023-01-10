package Bimestre2.semana5;

public class ClaseConMetodoSinRetornoValor {
    public static void main(String[] args) {
        // Hemos creado un variable a partir de nuestra clase
        // ClaseConMetodoSinRetornoValor  llamada = new ClaseConMetodoSinRetornoValor();
        // llamada.saludar();
        saludar_con_nombre("Carlos");

    }

    public static void saludar() {
        System.out.println("Biemvinido a la creacion de metodos");
        System.out.println("Metodo creado en java");

    }

    public static void saludar_con_nombre(String nombre) {
        System.out.println("Biemvinid@ "+nombre.toUpperCase()+" a la creacion de metodos");
        System.out.println("Metodo creado en java");
    }
}
