/*
 Fecha: 20/02/2023
 Autor: Andres Felipe Ramirez Quintero
 problema:
 Se desea hacer un aplicación que genere un conjunto de números aleatorios entre 0 y
 20. En caso que el usuario quiera, se debe presentar un histograma sobre la frecuencia
 de los números del conjunto de números aleatorios. La aplicación deberá presentar un
 menú, que identifique en dos partes: a) presentar la generación del conjunto de
 números aleatorios y b) presentar el histograma del conjunto de números aleatorios.
*/

#include <iostream>
#include <cstdlib>
#include <iomanip>

using namespace std;

//FUNCION LA CUAL SE LE PASA EL PUNTERO QUE APUNTA AL ARREGLO, Y ESTA GENERA UN NUMERO ALEATORIO HAST EL NUMERO 20
int generaralt();
int generaralt()
{
    int aux;
    aux= 1+rand()%20;
    return aux;
}

int main()
{
    int MAX;
    int mayorn,menor,medio;
    string arrh[10];
    string opcion;
    char opcion2;
    int indexmax,indexmen;
    int aux;
    
    {
        cout<<"Bienvenido que desea hacer"<<endl<<"a.Presentar conjutno generando aleatoriamente"<<endl<<"b. Presentar Histograma del conjunto de numeros generados aleatoriamente."<<endl<<"c.Salir"<<endl;
        cin>>opcion2;
        cout<<"Cuantos numeros quiere almacenar en su arrgelo"<<endl;
        cin>>MAX;
        //ARREGLO DE LAS POSICIONES QUE DESEA EL USUARIO
        int arr[MAX];
        //Dependiendo a que selecciono el usuario en la pregunta selecciona la opcion a realizar
        switch(opcion2)
        {
                
            case 'a':
                
                
                // SE GENERAN LOS NUMEROS ALEATORIOS Y LOS ASIGNA AL ARREGLO
                for(int i=0; i<MAX; i++)
                {
                    aux=generaralt();
                    arr[i]=aux;
                }
                cout<<"Numeros: "<<endl;
                //IMPRESION DE NUMEROS GENERADOS ALEATORIAMENTE
                for(int i=0; i<MAX; i++)
                {
                    cout<<arr[i]<<", ";
                }
                cout<<endl;
                break;
            case 'b':
                //GENERA LOS NUMEROS ALEATORIOS Y LOS ASIGNA AL ARREGLO
                for(int i=0; i<MAX; i++)
                {
                    aux=generaralt();
                    arr[i]=aux;
                }
                mayorn=arr[0];
                //ENCUENTRA EL MAYOR DE LOS NUMEROS GENERADOS
                for(int i=1; i<MAX; i++)
                {
                    if(arr[i]>mayorn)
                    {
                        mayorn=arr[i];
                        indexmax=i;
                    }
                }
                menor=arr[0];
                //ENCUENTRA EL MENOR DE LOS NUMEROS GENERADOS
                for(int i=1; i<MAX; i++)
                {
                    
                    if(arr[i]<menor)
                    {
                        menor=arr[i];
                        indexmen=i;
                    }
                }
                medio=mayorn/2;
                //ESTE CICLO ASIGNA UNO O DOS ATERISCOS DEPENDIENDO SI ES MAYOR O MENOR A LA MITAD DEL MAYOR
                for(int i=0; i<MAX; i++)
                {
                    if (arr[i]==mayorn){
                        arrh[i]="***";
                    }else if (arr[i]==menor){
                        arrh[i]="*";
                    }
                    
                    else if(arr[i]>=medio)
                    {
                        arrh[i]="**";
                    }
                    else
                    {
                        arrh[i]=*"*";
                    }
                }
                cout<<mayorn<<endl;
                cout<<menor<<endl;
                arrh[indexmax]="***";
                arrh[indexmen]="*";
                cout << "Index:"<< setw(7) << "Valor:" << setw(12) << "Histograma:"<<endl;
                //IMPRESION DEL LA TABLA CON INIDICE HISTOGRAMA Y NUMERO
                for( int r=0; r<MAX; r++)
                {
                    
                    cout << r+1 << setw(12) << arr[r] << setw(12) << arrh[r]<<endl;
                }
                break;
                //SI EL USUARIO DIGITA LA C ACABA EL PROGRAMA
            case 'c':
                cout<<"Fin del programa, Gracias"<<endl;
                break;
        }
    }
}

