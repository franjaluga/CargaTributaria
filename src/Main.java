import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer base = 5000000;

        for(int i = 0 ; i < 200; i++){

            Double credito = Math.ceil( base * 0.369863 );

            calcularIGC( base );

            base += 1000000;
        }


    }


    public static void calcularIGC( Integer base ){

        Integer igc = 0;

        int t1Superior = 9907434;
        int t2Superior = 22016520;
        int t3Superior = 36694200;
        int t4Superior = 51371880;
        int t5Superior = 66049560;
        int t6Superior = 88066080;
        int t7Superior = 227504040;

        float tasa1 = 0.0F;
        float tasa2 = 0.04F;
        float tasa3 = 0.08F;
        float tasa4 = 0.135F;
        float tasa5 = 0.23F;
        float tasa6 = 0.304F;
        float tasa7 = 0.35F;
        float tasa8 = 0.40F;

        double rebaja1 = 0;
        double rebaja2 = 396297.36;
        double rebaja3 = 1276958.16;
        double rebaja4 = 3295139.16;
        double rebaja5 = 8175467.76;
        double rebaja6 = 13063135.2;
        double rebaja7 = 17114174.88;
        double rebaja8 = 28489376.88;

        if( base >= 0 && base <= t1Superior ){
            igc = (int) Math.round((base * tasa1) - rebaja1);
            System.out.println(base +";"+ tasa1+";"+ rebaja1+";"+igc);

        }else if( base > t1Superior && base <= t2Superior){
            igc = (int) Math.round((base * tasa2) - rebaja2);
            System.out.println(base +";"+ tasa2+";"+ rebaja2+";"+igc);

        }else if( base > t2Superior && base <= t3Superior){
            igc = (int) Math.round((base * tasa3) - rebaja3);
            System.out.println(base +";"+ tasa3+";"+ rebaja3+";"+igc);

        }else if( base > t3Superior && base <= t4Superior){
            igc = (int) Math.round((base * tasa4) - rebaja4);
            System.out.println(base +";"+ tasa4+";"+ rebaja4+";"+igc);

        }else if( base > t4Superior && base <= t5Superior){
            igc = (int) Math.round((base * tasa5) - rebaja5);
            System.out.println(base +";"+ tasa5+";"+ rebaja5+";"+igc);

        }else if( base > t5Superior && base <= t6Superior){
            igc = (int) Math.round((base * tasa6) - rebaja6);
            System.out.println(base +";"+ tasa6+";"+ rebaja6+";"+igc);

        }else if( base > t6Superior && base <= t7Superior){
            igc = (int) Math.round((base * tasa7) - rebaja7);
            System.out.println(base +";"+ tasa7+";"+ rebaja7+";"+igc);

        }else if( base > t7Superior){
            igc = (int) Math.round((base * tasa8) - rebaja8);
            System.out.println(base +";"+ tasa8+";"+ rebaja8+";"+igc);

        }

    }





}