package cod_builderpizza;
// @author emendezduran

public class COD_BuilderPizza {
    public static void main(String[] args) {
    
    Pizza miPizzaHawaiana;
    
    miPizzaHawaiana = new PizzaBuilder(500f,350f).setGrPinha(30f).setGrSal(5f).setGrQueso(30f).setMlAceite(5f).createPizza();
    
        System.out.println(miPizzaHawaiana.toString());
    

    }

}
