/*
 Fecha: 18/02/2023
 Autor: Andres Felipe Ramirez Quintero
 problema:
 1.- Crear un array con 10 elementos
 2.- Crear una función para generar números aleatorios entre 0 y 25
 3.- Llenar el array con 10 números aleatorios
 4.- Crear un puntero
 5.- Imprimir el contenido del array usando el puntero
 6.- Imprimir las direcciones del contenido del array usando el puntero.
 */

#include <iostream>


using namespace std;
// SE CREA UNA FUNCION LA CUAL SE LE PASA EL PUNTERO QUE APUNTA AL ARREGLO, Y ESTA GENERA UN NUMERO ALEATORIO HASTA EL NUMERO 25
int generaralt(int* ptr);
int generaralt(int* ptr)
{

    *ptr=rand()%25;
    return *ptr;
}
// SE CREA LA FUNCION PRINCIPAL
int main()
{
    //ARREGLO DE 10 POSICIONES
    int arr[10];
    // SE CREA UN PUNTERO QUE APUNTA AL ARREGLO DE 10 POSICIONES
    int* ptr=&arr[10];
    int aux;
    // SE CREA UN FOR QUE IMPIME LA DIRECCION EN MEMEORIA DEL NUMERO Y EL NUMERO USANDO APUNTADORES
    for(int i=0;i<10;i++)
    {
        aux=generaralt(ptr);
        cout<<"Direccion de Memoria: "<<ptr<<", Numero: "<<*ptr<<endl;
        arr[i]=aux;
    }
    // SE CREA UN FOR QUE NOS COMPRUEBA QUE LOS NUMEROS ESTAN GUARDADOS EN EL ARREGLO
    for(int i=0;i<10;i++)
    {
        cout<<"Numero: "<<arr[i]<<endl;
    }
    cout<<endl;


}
