/*
-------------------------------------------------------------------------------
  Autor: Andres Felipe Ramirez Quintero
  Fecha: 14/04/23
  Tema: Clases comparator, collectios y Arrays

  Ejercicio:
  Se requiere una aplicación que se pueda ordenar los jugadores en función de el ELO, 
  de la edad y del valor del premio. Inicialmente, la aplicación deberá presentar la 
  lista de almenos 7 jugadores de forma desordenada.
  -------------------------------------------------------------------------------
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Se crea una clase Jugador la cual facilitara el uso de datos.
class Jugador{
    // Atributos
    private String nombre;
    private int edad;
    private int elo;
    private int valorPremio;
/*Se necesita un constructor para reconocer datos inicales*/
public Jugador(String nombre, int edad, int elo, int valorPremio){
    this.nombre=nombre;
    this.edad=edad;
    this.elo=elo;
    this.valorPremio=valorPremio;
}
// Se necesita capturar el nombre
public String getNombre(){
    return nombre;
}
// Se necesita capturar la edad
public int getEdad(){
    return edad;
}
// Se necesita capturar el elo
public int getElo(){
    return elo;
}
// Se necesita capturar el valorPremio
public int getValorPremio(){
    return valorPremio;
}
// Se necesita Ingresar el nombre
public void setNombre(String nombre){
    this.nombre=nombre;
}
// Se necesita Ingresar la edad
public void setEdad(int edad){
    this.edad=edad;
}
// Se necesita Ingresar el elo
public void setElo(int elo){
    this.elo=elo;
}
// Se necesita Ingresar el valorPremio
public void setValorPremio(int valorPremio){
    this.valorPremio=valorPremio;
}
// Se quiere imprimir los datos contenidos en el objeto
public String presentarDatos(){
    return "("+getNombre()+","+getEdad()+","+getElo()+","+getValorPremio()+")";
}

}//FinClaseJugador
//Se requiere crear una clase para COMPARAR la edad del Jugador
//Se implementa usando la clase "Comparator"
//La idea principal es ordenar los objetos de acuerdo a la edad
    class CompararEdad implements Comparator<Jugador>{
    //Se implementa el metodo que devuelva el orden de acuerdo a la edad
    public int compare(Jugador player01,Jugador player02){
        return player01.getEdad() - player02.getEdad();
    }
}
    class CompararElo implements Comparator<Jugador>{
    //Se implementa el metodo que devuelva el orden de acuerdo al Elo 
    public int compare(Jugador player01,Jugador player02){
        return player01.getElo() - player02.getElo();
    }
  }
   class CompararValorPremio implements Comparator<Jugador>{
    //Se implementa el metodo que devuelva el orden de acuerdo al valorPremio
    public int compare(Jugador player01,Jugador player02){
        return player01.getValorPremio() - player02.getValorPremio();
    }
  }

public class Ajedrez{
    public static void main(String[] args ){
    //Se crean unos empleados para jugar (arreglo)
    ArrayList<Jugador> listaJugadores= new ArrayList<Jugador>();
    // Se llena la lista
    listaJugadores.add(new Jugador("                            Samu   ",26 ,34,2));
    listaJugadores.add(new Jugador("                            Andres ",100,19,19));
    listaJugadores.add(new Jugador("                            Migue  ",4  ,6 ,15));
    listaJugadores.add(new Jugador("                            Laura  ",2  ,5 ,55));
    listaJugadores.add(new Jugador("                            Sara   ",70 ,4 ,2));
    listaJugadores.add(new Jugador("                            Vale   ",19 ,19,88));
    listaJugadores.add(new Jugador("                            Lina   ",44,98,15));
    System.out.println("*****Buen Día, A continuación se mostrará los datos de algunos de nuestros Jugadores de Ajedrez*****");
    System.out.println("****************************************************************************************************");
    System.out.println();
    System.out.println("                             Lista de Jugadores de Ajedrez sin ordenar");
    System.out.println();
    for(Jugador jugador: listaJugadores ){
        System.out.println(jugador.presentarDatos());
    }
    System.out.println();
    // se presenta la lista ordenada según la edad usando comparator 
    Collections.sort(listaJugadores, new CompararEdad());
    System.out.println("                             Lista de jugadores de Ajedrez ordenada según Edad");
    System.out.println();
     for(Jugador jugador: listaJugadores ){
        System.out.println(jugador.presentarDatos()); 
     }
     System.out.println();
     // se presenta la lista ordenada según el Elo usando comparator 
    Collections.sort(listaJugadores, new CompararElo());
    System.out.println("                             Lista de jugadores de Ajedrez ordenada según ELO");
    System.out.println();
     for(Jugador jugador: listaJugadores){
        System.out.println(jugador.presentarDatos());
     }
     System.out.println();
     // se presenta la lista ordenada según el valorPremio usando comparator 
    Collections.sort(listaJugadores, new CompararValorPremio());
    System.out.println("                             Lista de jugadores de Ajedrez ordenada según valorPremio");
    System.out.println();
     for(Jugador jugador: listaJugadores){
        System.out.println(jugador.presentarDatos());
     }
    System.out.println();
    }
    
    
}//Fin clase principal Planilla 

