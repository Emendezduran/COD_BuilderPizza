package cod_builderpizza;
public class PizzaBuilder {

    private float grHarina;
    private float mlAgua;
    private float grSal;
    private float mlAceite;
    private String tipoAceite;
    private float grQueso;
    private String tipoQueso;
    private float grPinha;

    public PizzaBuilder(final float grHarina, final float mlAgua) {
    }

    public PizzaBuilder setGrHarina(float grHarina) {
        this.grHarina = grHarina;
        return this;
    }

    public PizzaBuilder setMlAgua(float mlAgua) {
        this.mlAgua = mlAgua;
        return this;
    }

    public PizzaBuilder setGrSal(float grSal) {
        this.grSal = grSal;
        return this;
    }

    public PizzaBuilder setMlAceite(float mlAceite) {
        this.mlAceite = mlAceite;
        return this;
    }

    public PizzaBuilder setTipoAceite(String tipoAceite) {
        this.tipoAceite = tipoAceite;
        return this;
    }

    public PizzaBuilder setGrQueso(float grQueso) {
        this.grQueso = grQueso;
        return this;
    }

    public PizzaBuilder setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
        return this;
    }

    public PizzaBuilder setGrPinha(float grPinha) {
        this.grPinha = grPinha;
        return this;
    }

    public Pizza createPizza() {
        return new Pizza(grHarina, mlAgua, grSal, mlAceite, tipoAceite, grQueso, tipoQueso, grPinha);
    }

}
