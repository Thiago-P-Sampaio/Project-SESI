package com.sesi.projeto.service;

import com.sesi.projeto.dto.ProdutoDTO;
import com.sesi.projeto.dto.UsuarioDTO;
import com.sesi.projeto.entities.Produto;
import com.sesi.projeto.entities.Usuario;
import com.sesi.projeto.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class ServiceHttpProduto {

    @Autowired
    ProdutoRepository produtoRepository;
    @Autowired
    UsuarioRepository usuarioRepository;
    @Autowired
    PedidoRepository pedidoRepository;
    @Autowired
    CategoriaRepository categoriaRepository;
    @Autowired
    PagamentoRepository pagamentoRepository;
    @Autowired
    ItemDoPedidoRepository itemDoPedidoRepository;

//
//
//

    public List<ProdutoDTO> BuscarTodosProdutos() {
        List<Produto> lista = produtoRepository.findAll();
        return lista.stream().map(x -> new ProdutoDTO(x)).toList();
    }
    public Page<ProdutoDTO> BuscarPorPagina(Pageable pagina) {
        Page<Produto> busca = produtoRepository.findAll(pagina);
        return busca.map(x -> new ProdutoDTO(x));
    }

//    public Optional<Produto> BuscarProdutoId(Long id) {
//        return produtoRepository.findById(id);
//    }
//
//    public Produto NovoProduto(Produto produto) {
//        return produtoRepository.save(produto);
//    }
//
//    public Produto atualizarPorId(Long id, ProdutoDTO dto) {
//        return produtoRepository.findById(id).map(produto -> {
//            if (dto.nome() != null) produto.setNome(dto.nome());
//            if (dto.preco() != 0) produto.setPreco(dto.preco());
//            if (dto.descricao() != null) produto.setDescricao(dto.descricao());
//            if (dto.imgUrl() != null) produto.setImgUrl(dto.imgUrl());
//            return produtoRepository.save(produto);
//        }).orElseThrow(() -> new RuntimeException("Produto não encontrado"));
//    }
//
//    public void  DeleteProduto(Long id){
//        produtoRepository.deleteById(id);
//    }
//


}
