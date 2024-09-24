package gustavo.vidal.primeirasemana;

public class UsuarioCalculadora {
        public static void main(String [] args) throws Exception{
            Calculadora calculadora = new Calculadora();

            calculadora.despesaCaixinhas();
            System.out.println("Despesas caixinhas R$ " + calculadora.custo_Caixinha);

            calculadora.despesaContador();
            System.out.println("Despesas contador R$ " + calculadora.custo_Contador);

            calculadora.despesaAds();
            System.out.println("Despesas Ads R$ " + calculadora.custo_Ads);

            calculadora.despesaDas();
            System.out.println("Despesas Das R$ " + calculadora.custo_Das);

            calculadora.despesaDevolução();
            System.out.println("Despesas Devolucao R$ " + calculadora.custo_Devolução);

            calculadora.despesaInsumos();
            System.out.println("Despesas Insumos R$ " + calculadora.custo_Insumos);
           


        }
}

