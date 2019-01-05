
package problema_439;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class VDT 
{
    public static void main(String[] args) throws IOException 
    {
        Scanner sc=new Scanner (System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int casos=sc.nextInt();
        String datos;
        int longitud,z,V=0,T=0,D=0;
        String a="",b="";
        String separador[]=new String[2];
        
        int dato_numero[]=new int[2];
        String dato_letra[]=new String[2];
        
        for (int i = 0; i < casos; i++) 
        {
            datos=br.readLine();
            separador=datos.split(" ");
            for (int j = 0; j < 2; j++) 
            {
                longitud=separador[j].length();
                for (int k = 0; k < longitud; k++) 
                {
                    if(k<2)
                    {
                        a=a+separador[j].charAt(k);
                    }
                    else
                    {
                        b=b+separador[j].charAt(k);
                    }
                }
                dato_letra[j]=a;
                z=Integer.parseInt(b);
                dato_numero[j]=z;
                a="";
                b="";
            }
            for (int j = 0; j < 2; j++) 
            {
                if(dato_letra[j].charAt(0)=='v'||dato_letra[j].charAt(0)=='V')
                {
                    V=dato_numero[j];
                }
                if(dato_letra[j].charAt(0)=='d'||dato_letra[j].charAt(0)=='D')
                {
                    D=dato_numero[j];
                }
                if(dato_letra[j].charAt(0)=='t'||dato_letra[j].charAt(0)=='T')
                {
                    T=dato_numero[j];
                }      
            }
            if(V==0)
            {
                V=D/T;
                System.out.println("V="+V);
            }
            if(D==0)
            {
                D=T*V;
                System.out.println("D="+D);
            }
            if(T==0)
            {
                T=D/V;
                System.out.println("T="+T);
            }
            V=0;
            D=0;
            T=0;
        }   
    }
}