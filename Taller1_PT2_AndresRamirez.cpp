/*
 Fecha: 18/02/2023
 Autor: Andres Felipe Ramirez Quintero
 problema:
 Se desea capturar los datos de los clientes para ser impreso en la factura. Se requiere
crear una estructura de datos, que encapsule los datos de los usuarios. Se requiere que
el uso de la estructura sea a través de punteros. Se requiere imprimir las facturas en
un fichero de texto.
*/
#include <iostream>
#include <fstream>
using namespace std;

struct Persona{
    string nombre, correo;
    long int Cc;
}persona, *puntero_persona =&persona;
int main() {
//    se solicita los datos para la fatura
    cout << "Por favor ingrese su nombre";
    cin>>(puntero_persona->nombre);
    cout << "Por favor ingrese su Id";
    cin>>(puntero_persona->Cc);
    cout << "Por favor ingrese su Correo";
    cin>>(puntero_persona->correo);
// se imprime lo solicitado
    cout<<"Nombre: "<<puntero_persona->nombre<<endl;
    cout<<"Numero de Identificacion: "<<puntero_persona->Cc<<endl;
    cout<<"Correo: "<<puntero_persona->correo<<endl;
    
    ofstream archivo;
    archivo.open("Texto.txt");
    if (archivo.is_open()) {
        archivo<<puntero_persona->nombre<<endl;
        archivo<<puntero_persona->Cc<<endl;
        archivo<<puntero_persona->correo<<endl;
        archivo.close();
    }
    return 0;
}
