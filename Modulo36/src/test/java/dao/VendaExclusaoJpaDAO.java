package dao;

import br.com.zavala.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.zavala.dao.jpa.IVendaJpaDAO;
import br.com.zavala.domain.jpa.VendaJpa;
import br.com.zavala.exceptions.DAOException;
import br.com.zavala.exceptions.TipoChaveNaoEncontradaException;

/**
 * 
 * @author Ramiro
 *
 */
public class VendaExclusaoJpaDAO extends GenericJpaDB1DAO<VendaJpa, Long> implements IVendaJpaDAO {

	public VendaExclusaoJpaDAO() {
		super(VendaJpa.class);
	}

	@Override
	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public VendaJpa consultarComCollection(Long id) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

}

