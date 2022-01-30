package dio.padrao.padraospring.service;

import dio.padrao.padraospring.model.Cliente;

public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Integer id);

    void inserir(Cliente cliente);

    void atualizar(Integer id, Cliente cliente);

    void deletar(Integer id);
}
