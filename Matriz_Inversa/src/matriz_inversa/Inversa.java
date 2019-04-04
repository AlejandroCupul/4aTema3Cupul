/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz_inversa;


public class Inversa {

        
     public static double[][] inversa(double a[][]){

            Gausiano gauss = new Gausiano();
            //Lectura de los datos que se ingresaron
            int n = a.length;
            double x[][] = new double[n][n];
            double b[][] = new double[n][n];
            int index[] = new int[n];
            for (int i=0; i<n; ++i) 
                b[i][i] = 1;
            //Inicializa los datos de la matriz

            //Utiliza la funcion de Gaus para llevar a cabo la inversa
            gauss.Gauss(a, index);

            //Multiplicacion de cada uno de los valores ingresados 
            for (int i=0; i<n-1; ++i)
                for (int j=i+1; j<n; ++j)
                    for (int k=0; k<n; ++k)
                        b[index[j]][k]
                        	    -= a[index[j]][i]*b[index[i]][k];
            
            for (int i=0; i<n; ++i)             {
                x[n-1][i] = b[index[n-1]][i]/a[index[n-1]][n-1];
                for (int j=n-2; j>=0; --j)                 {
                    x[j][i] = b[index[j]][i];
                    for (int k=j+1; k<n; ++k) 
                    {
                        x[j][i] -= a[index[j]][k]*x[k][i];
                    }

                    x[j][i] /= a[index[j]][j];
                }
            }
            return x;
     }
    
}
