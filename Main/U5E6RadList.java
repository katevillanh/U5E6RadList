
package Main;

import java.util.ArrayList;
import java.util.List;

public class U5E6RadList {

    public static void main(String[] args) {
        
        List <Integer> arreglo=new ArrayList<Integer>();
       
        arreglo.add(24);
        arreglo.add(1);
        arreglo.add(5);
        arreglo.add(8);
        arreglo.add(2);
        arreglo.add(6);
        arreglo.add(3);
        arreglo.add(7);
        arreglo.add(4);
        arreglo.add(10);
        //arreglo.add(55);
        //arreglo.add(9);
        
        System.out.println("Lista desordenada:");
        for(int i=0; i<arreglo.size(); i++){
            System.out.print(" "+arreglo.get(i));    
        }  
       
            int x,i,j;
            for(x=Integer.SIZE-1;x>=0;x--){ //Integer.SIZE sirve para contar los numeros de bits que representan un numero entero
                List <Integer> auxiliar=new ArrayList<Integer>(arreglo.size());
               
            for(int t=0;t<arreglo.size();t++){
                auxiliar.add(0);
            }
            
                j=0;
                for(i=0;i<arreglo.size();i++){
                    boolean mover=arreglo.get(i)<<x>=0;
                    if(x==0 ? !mover:mover){
                        //auxiliar[j]=arreglo[i];
                        auxiliar.set(j,arreglo.get(i));
                        j++;
                    }else{
                        //arreglo[i-j]=arreglo[i];
                        arreglo.set((i-j), arreglo.get(i));
                    }
                }
                for(i=j;i<auxiliar.size();i++){
                    //auxiliar[i]=arreglo[i-j];
                    auxiliar.set(i,arreglo.get(i-j));
                }
                arreglo=auxiliar;
            }
        System.out.println(" ");   
        System.out.println("Lista ordenada:");
        for(int k=0; k<arreglo.size(); k++){
            System.out.print(" "+arreglo.get(k));    
        } 
    }
    
}
