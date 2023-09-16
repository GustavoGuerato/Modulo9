package br.guerato.gustavo;

public class Exemplo1 {

    public static void main(String[] args){

        //boxing
        Boolean status = true;

        Boolean status1 = Boolean.TRUE;

        Character c ='A';

        Integer idade=10;

        Long cpf = Long.valueOf(123123);


        //unboxing
        boolean status2= Boolean.TRUE;
        char letra= Character.valueOf('A');


        //casting
        int num1=10;
        short num2=(short) num1;

        long numL = 1111111111111l;
        System.out.println(numL);
        int numI=(int) numL;
        System.out.println(numI);
    }
}
