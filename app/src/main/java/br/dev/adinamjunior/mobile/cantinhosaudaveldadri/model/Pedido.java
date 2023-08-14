package br.dev.adinamjunior.mobile.cantinhosaudaveldadri.model;

public class Pedido {
    //atributos
    private int codMarmita;
    private int quantidade;
    private String datadopedido;

    //metodos

    void setCodMarmita [int cm] [this.codMarmita = cm;]
    int getCodMarmita () [return this.codMarmita;]
    void setQuantidade(int cq) [
            if (int cq > 0 && cq <= 10 )
                this.Quantidade = cq;
            ]


}
