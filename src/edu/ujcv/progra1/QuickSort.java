package edu.ujcv.progra1;

public class QuickSort {





    public int[] quick(int[] arreglo, int primero, int ultimo){
        int i,j,pivote,auxiliar;
        i=primero;
        j=ultimo;
        pivote=arreglo[(primero+ultimo)/2];
        do{
            while(arreglo[i]<pivote){
                i++;
            }
            while(arreglo[j]>pivote){
                j--;
            }
//aqui se hace el intercambio
            if(i<=j){
                auxiliar=arreglo[i];
                arreglo[i]=arreglo[j];
                arreglo[j]=auxiliar;
                i++;
                j--;
            }
        }while(i<=j);
        if(primero<j){
            quick(arreglo, primero, j);

        }
        if(i<ultimo){
            quick(arreglo, i, ultimo);
        }
//mostrar arreglo en la clase principal
      return arreglo;
    }





}
