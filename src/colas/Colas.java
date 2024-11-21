package colas;


public class Colas {

    
    public static void main(String[] args) {
        
        int tiempo_actual = 0;
        int llegada_del_cliente = tiempo_actual+3;
        int tiempo_maximo=10; // de entrada de clientes a cajas ....10... en minutos
        int clientes_en_espera=1; 
        int clientes_atendidos=0;
        int tiempo_de_servicio=0;
        int numero_de_cliente=1;
        int tiempo_de_espera_del_cliente_total=0;
        int tiempo_espera = 0;
        
        while(tiempo_maximo >= tiempo_actual){
            
            System.out.println("");
            System.out.println("Llega el " +numero_de_cliente+ " cliente ");
            System.out.println("en el minuto: "+tiempo_actual+" minutos");
            System.out.println("es atendido en los : "+tiempo_de_servicio+ " minutos");
            
            
            if(clientes_en_espera > 0 ){
                clientes_en_espera =clientes_en_espera-1;
                clientes_atendidos=clientes_atendidos+1;
                tiempo_espera=tiempo_de_servicio-tiempo_actual;
                        
                
                tiempo_de_espera_del_cliente_total = tiempo_de_espera_del_cliente_total+ tiempo_espera;
                tiempo_de_servicio= tiempo_de_servicio +5;
                
                numero_de_cliente++;
                
            }else {
                clientes_en_espera++;
            }
            
            llegada_del_cliente = tiempo_actual+3;
            tiempo_actual=llegada_del_cliente;
            clientes_en_espera ++;
            
            
            System.out.println("total de minutos de espera:"+tiempo_espera+" minutos" );
            System.out.println("");
            
        
            }
        
        System.out.println("--------------------------------------------------------");
        System.out.println("TOTAL DE CLIENTES ATENDIDOS EN "+tiempo_maximo+" MINUTOS FUERON "+clientes_atendidos+ " CLIENTES");
        System.out.println("TIEMPO TOTAL DE ESPERA DE LOS CLIENTES "+tiempo_de_espera_del_cliente_total+" MINUTOS");
        float promedio=tiempo_de_espera_del_cliente_total/clientes_atendidos;
        System.out.println("PROMEDIO DE ESPERA DE ATENCION EN 10 MIN POR CADA CLIENTE :"+promedio+" MINUTOS");
        

        
    }
    
}
