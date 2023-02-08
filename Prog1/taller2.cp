/*
 Fecha: 06/02/2023
 Autor: Andres Felipe Ramirez Quintero
 problema:
 -Crear una estructura corta para pedir datos basicos del usuario.
 -crear una lista de palabras a ser usadas aleatoriamente.
 -Almacenar palabras en un fichero.
 -Leer y presentar en pantalla la lectura de un fichero(archivo).
 */
#include <iostream>
#include <ctime>
#include <fstream>
using namespace std;
// se crea una estructura basica para la captura de datos de los usuarios
struct datos_usuarios{
    string nombre;
    string apellido;
    int edad=0;
};
// se crea una lista, como conjunto de palabras disponibles para jugar
const string lista_palabras[]= {"Hola","Mañana","Hoy","tarde","Noche"};
// se crea la funcion principal
int main(){
    //    se declaran variables a usar
    int i,j,cantidad;
    //    se pide cuantos usuarios
    cout<<"cuantos usuarios desea ingresar?: "<<endl;
    cin>>cantidad;
    //     se crea un objeto struct del tamaño cantidad
    datos_usuarios personas[cantidad];
    //    se piden datos de los usurarios
    //    se escribe sobre un fichero: se usa "ofstream" para almacenar en el fichero
    //    se crea el objeto tipo ofstream(digital) junto al nombre del fichero (fisico)

    ofstream A_escritura ("A1.txt");
    //    se debe preguntar si hay espacio de memoria para abrir el fichero(archivo)
    if(A_escritura.is_open()){
        for(i=0; i<cantidad;i++){
            cout<<i+1<<" Ingrese su Nombre: "<<endl;
            cin>>personas[i].nombre;
            A_escritura<<personas[i].nombre;
            cout<<i+1<<" Ingrese su Apellido: "<<endl;
            cin>>personas[i].apellido;
            A_escritura<<personas[i].apellido;
            cout<<i+1<<" Ingrese su Edad"<<endl;
            cin>>personas[i].edad;
            A_escritura<<personas[i].edad;
        }
    }else{
        cout<<"No tiene permisos de escritura!!"<<endl;
    }

    A_escritura.close();
    //    se imprimen datos de los usurarios
        for(i=0; i<cantidad;i++){
            cout<<"Nombre ["<<i+1<<"];"<<personas[i].nombre<<endl;
            cout<<"Apellido ["<<i+1<<"];"<<personas[i].apellido<<endl;
            cout<<"Edad ["<<i+1<<"];"<<personas[i].edad<<endl;
           
        }
        return 0;
    }

