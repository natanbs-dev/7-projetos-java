package projeto1;


// percorra esse array com os valores contidos nele

// não informe a quantide, e sim a totalidade dos valores ali contidos
public class Projeto_FOR_ARRAYS {
    public static  void main(String[] args) {
        String[] cars = {"BMW", "PORCHE", "FIAT", "ASTON MARTIN"};

         for(int i = 0;i < cars.length; i++) {
             System.out.print(cars[i] + " ");
         }
    }
}
