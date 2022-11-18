import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        //If

        int numeroif=0;
        if(numeroif>0){
            System.out.println("Numero es positivo");
        } else if (numeroif<0) {
            System.out.println("Numero es negativo");
        }else {
            System.out.println("Numero es 0");
        }

        int numeroWhile=0;
        while (numeroWhile<3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        do{
            numeroWhile++;
            System.out.println(numeroWhile);
        }while (numeroWhile<3);

        for(int i=0;i<=3;i++){
            System.out.println(i);
        }

        String estacion="PRIMAVERA";


        switch (estacion.toLowerCase()){
            case "verano":
                System.out.println("Para la playita");
                break;
            case "invierno":
                System.out.println("Chaqueta para el frio");
                break;
            case "otonio":
                System.out.println("Buenas fotos de los arboles");
                break;
            case "primavera":
                System.out.println("EL sol vuelve a salir");
                break;
            default:
                System.out.println("No tenemos esta estacion registrada");
        }


    }
}