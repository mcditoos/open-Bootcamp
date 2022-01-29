package com.temauno.Uno;


public class Uno {

    public static void main(String[] args)
    {
    int x = 5;
    float y= 10.5f;
    boolean b=true;
    String s = "Mi mama me mima";
    char c = 'X';
    double d=3.11415d;
    long l=0l;
    Object[] lista = new Object[]{x,y,b,s,c,d,l};
    for(int i=0;i<lista.length;i++){
        System.out.println(lista[i]);
        System.out.println(lista[i].getClass());
    }



    }

}
