package gustavo.vidal.primeirasemana;

public class Calculadora {
    double despesaTotal;
    double custo_Caixinha;
    double custo_Contador;
    double custo_Ads;
    double custo_Das;
    double custo_Insumos;
    double custo_Devolução;
    double valorBruto;

    public void despesaCaixinhas (){
       int valorCaixinha = 2;
       int quantidadeCaixinhas = 1;
           custo_Caixinha = quantidadeCaixinhas * valorCaixinha;
    }

    public void despesaContador () {
        int valorMensal = 400;
        double valorDiario = valorMensal / 30;
        int quantidadeDias = 1;
            custo_Contador = valorDiario * quantidadeDias;
    }

    public void despesaAds () {
        int valorAds = 30;
        int quantidadeDias = 1;
            custo_Ads = valorAds * quantidadeDias;
    }

    public void despesaDas () {
        double valorBruto = 1;
        double porcentagemDas = 0.05;
             custo_Das = valorBruto * porcentagemDas;
    }

    public void despesaInsumos () {
       int custo_Faixa_1;
       int quantidade_Faixa_1 = 1;
       int custo_Faixa_2;
       int quantidade_Faixa_2 = 1;
       int custo_Faixa_3;
       int quantidade_Faixa_3 = 1;
       int custo_Faixa_4;
       int quantidade_Faixa_4 = 1;

           custo_Faixa_1 = quantidade_Faixa_1 * 30;
           custo_Faixa_2 = quantidade_Faixa_2 * 35;
           custo_Faixa_3 = quantidade_Faixa_3 * 40;
           custo_Faixa_4 = quantidade_Faixa_4 * 10;
           custo_Insumos = custo_Faixa_1 + custo_Faixa_2 + custo_Faixa_3 + custo_Faixa_4;
    }

     public void despesaDevolução () {
        int faixa1 = 40;
        int faixa2 = 45;
        int faixa3 = 50;       
        int faixa4 = 20;
           custo_Devolução = faixa1 + faixa2 + faixa3 + faixa4;
     }

     public void totalVendasBruto () {
        int vendasfaixa1 = 1;
        int vendasfaixa2 = 1;
        int vendasfaixa3 = 1;
        int vendasfaixa4 = 1;
        double valorFaixa1 = 65 * vendasfaixa1;
        double valorFaixa2 = 65 * vendasfaixa2;
        double valorFaixa3 = 90 * vendasfaixa3;
        double valorFaixa4 = 55 * vendasfaixa4;
        valorBruto = valorFaixa1 + valorFaixa2 + valorFaixa3 + valorFaixa4;

     }


}
