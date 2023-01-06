package servicos;

/**
 * @author wagne
 *
 */
public class PagamentoTotal {

	private TaxaDeServico taxaDeServico = new TaxaDeServico();
	private TaxaDeServicoDeEntrega taxaDeServicoDeEntrega = new TaxaDeServicoDeEntrega();

	public double precoTotal(double custo, String regiao) {
		return custo + taxaDeServicoDeEntrega.taxa(regiao) + taxaDeServico.taxa(custo);

	}

}