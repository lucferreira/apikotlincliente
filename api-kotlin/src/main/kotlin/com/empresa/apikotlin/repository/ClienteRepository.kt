package com.empresa.apikotlin.repository

import com.empresa.apikotlin.model.Cliente
import org.springframework.data.repository.CrudRepository
import org.springframework.data.jpa.repository.Query

interface ClienteRepository : CrudRepository<Cliente, Long>{
	
//	fun findAllCliente() : List<Cliente>
	
	fun findByIdcliente(idcliente:Long) : Cliente
	
	@Query("SELECT c FROM Cliente c WHERE c.ativo = true")
	fun findAllAtivo(): MutableIterable<Cliente>
	
//	@Query("SELECT c from Cliente where c.ativo = 'true'")
//	fun findAllAtivo(): List<Cliente>
}