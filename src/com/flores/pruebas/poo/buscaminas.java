package com.flores.pruebas.poo;

public class buscaminas {
    public static void main(String[] args) {
        /* 
        Declaracion e inicializacion de las variables
        Generacion de numeros aleatorios
        */
        char[][] arreglo = new char[4][4];
        int numero = (int)(Math.random()*5)+4;
        int fila =(int)(Math.random()*4);
        int columna =(int)(Math.random()*4);
        int contador=0;
        int minaencasilla=0;
        // Ciclo que inicializa el arreglo en blanco y lo imprime  
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
        arreglo[i][j]=' ';
        // Si la columna llega a 3 salto de linea para que se mire ordenado
    }
        }
        // Ciclo que pone las minas 
        for(int m=1; m <= numero; m++){
            int minafila = (int)(Math.random()*4);
            int minacolumna = (int)(Math.random()*4);
            if(arreglo[minafila][minacolumna]=='*'){
                m--;
            }
            else{
            arreglo[minafila][minacolumna] = '*';
            }
        }
        // Ciclo que comprueba alrededor de la posicion generada aleatoriamente
        
        for(int k=fila-1;k <= fila+1;k++){
            // Este if confirma que estoy dentro de las filas del arreglo y no me eh salido
            if(k>-1 && k<4){
                for(int l=columna-1;l<= columna+1;l++){
                    if(l>-1 && l<4){
                if(arreglo[k][l]=='*'){
                    contador++;
                }
                
                
            }
            }
         
            }
            
           
            
        }
        if(arreglo[fila][columna]=='*'){
                            contador=contador-1;
                            minaencasilla=1;
                        }
        for(int x=0;x<4;x++)
        {
            for(int y=0;y<4;y++){
                System.out.print("["+arreglo[x][y]+"]");
                if(y==3){
                System.out.println("");
            }

            }
        }
    System.out.println("Numero de minas:"+numero);
    System.out.println("Fila generada al azar:"+fila);
    System.out.println("Columna generada al azar:"+columna);
    System.out.println("Contador de minas alrededor de la posicion generada:"+contador);
    System.out.println("Las minas encontradas dentro de la casilla son:"+minaencasilla);
    }
    
    }
    

