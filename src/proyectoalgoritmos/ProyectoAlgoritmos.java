
package proyectoalgoritmos;

import java.util.Scanner;

public class ProyectoAlgoritmos {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    boolean salir = false;
    
    int opcion;   //Inicia la declaracion de variables para el código
    int gama; int transmision;
    int decision; int amenidad = 0; 
int sedanecono = 18940; int sedan = 23570; int deportivo = 24100; int hibrido = 25100; int coupe = 19350; //Declaracion de cada uno de los precios de los automoviles de la consencionaria
    int coupedepor;
        coupedepor = 24100; int compacto = 16190; int hatchback = 20150; int rally = 34700;
    
        while(!salir){  // Uso un while para iniciar la aplicacion del menú
    System.out.println("_______________________\nCONSECIONARIO DE AUTOS\nMENU PRINCIPAL\n_______________________\n");
    System.out.println("1. Seleccionar un Automovil");
    System.out.println("2. Salir");
    
    System.out.println("Ingrese el número de la opción elegida: ");
    opcion = scan.nextInt();  // esta será la linea en la que el usuario ingrese su opcion elegida.
    
    switch (opcion) {  // agrego la funcion switch para cada caso que se puede presentar
        case 1:
            System.out.println("_______________________\nCONSECIONARIO DE AUTOS\nSELECCION DE GAMA\n_______________________\n1.- Sedán económico\n2.- Sedán\n3.- Deportivo\n4.- Hibrido\n5.- Coupe\n6.- Coupe Deportivo\n7.- Compacto\n8.- Hatchback\n9.- Económico versión Rally\n10.- Regresar al menú principal");
            gama = scan.nextInt();
            System.out.println("Ingrese el número de gama que desea.");
      while (gama == 1){System.out.println("_______________________\nCONSECIONARIO DE AUTOS\nSELECCION DE GAMA\n_______________________\n");
            gama = sedanecono;        
            System.out.println("Usted a seleccionado la gama: Sedán Económico\n¿Desea agrerar amenidades a su automovil?\n1. Si\n2. No");
                    decision = scan.nextInt();
            if (decision == 2){ System.out.println("_______________________\nCONSECIONARIO DE AUTOS\nVENTA DEL VEHÍCULO\n_______________________\n");
                        System.out.println("Gama seleccionada: Sedán económico         US$ 18,940.00\nAmenidades: Ninguna\n                                      _____________\nTotal:seleccionada:                        US$18,940.00");
            }else if (decision == 1){ System.out.println("_______________________\nCONSECIONARIO DE AUTOS\nSELECCION DE AMENIDADES\n_______________________\n");
                            System.out.println("Usted ha seleccionado la gama: Sedán económico");
                            System.out.println("Tipo de amenidades:");
                            System.out.println("1.- Tipo de transmision");
                            System.out.println("2.- Color de pintura exterior");
                            System.out.println("3.- Aros");
                            System.out.println("4.- Accesorios Exteriores");
                            System.out.println("5.- Accesorios Interiores");
                            System.out.println("6.- Accesorios Electronicos");
                            System.out.println("7.- Regresar a la seleccion de gama del vehículo");
                            System.out.println("Ingrese el tipo de amenidad deseada"); 
                            amenidad = scan.nextInt();}//elseif1
            while (amenidad != 7 ){System.out.println("_______________________\nCONSECIONARIO DE AUTOS\nSELECCION DE AMENIDADES\nSELECCION DE TIPOS DE TRASMISION\n_______________________\n");
                            System.out.println("Usted ha seleccionado la gama: Sedán económico");
                            System.out.println("Tipos de transmision:");
                            System.out.println("1.- Manual                 US$   0.00");
                            System.out.println("2.- CVT                    US$ 800.00");
                            System.out.println("3.- Manual con turbo       US$   0.00");
                            System.out.println("4.- CVT con turbo          US$ 800.00");
                            System.out.println("5.- Regresar a la seleccion de amenidades");
                         transmision = scan.nextInt(); System.out.println("Ingrese el tipo de transmision ");
            int manual; manual = 0; int cvt; cvt = 800; int manualturbo; manualturbo=0; int cvtturbo; cvtturbo=800;
            if (transmision == 1) 
            {
             System.out.println("_______________________\nCONSECIONARIO DE AUTOS\nSELECCION DE AMENIDADES\nSELECCION DE TIPOS DE TRASMISION\n_______________________");
             System.out.println("Usted ha seleccionado la gama: Sedán económico     US$ 18,940.00");
             System.out.println("Amenidades:\n   Transmision: Manual                US$      0.00\\n");
             int total; int transmanual = 0;
                total= sedanecono + transmanual;
             System.out.println("Total                                              US$ " + total);
            System.out.println("Desea agregar otra amenidad!\n 1. Si\n 2.No"); int masamen; masamen = scan.nextInt(); 
            }

            }//while 2
            
      }//whilegama
         
            break;
        case 2:
            salir = true; break;
     }//Switch1
            }//while1
   System.out.println("Fin del menú");
                }//Public Static
                
                 //while 2
            
      }//public class
          
 