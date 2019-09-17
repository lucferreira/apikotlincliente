package com.empresa.apikotlin.serviceImpl

import com.empresa.apikotlin.model.Cliente
import com.empresa.apikotlin.repository.ClienteRepository
import com.empresa.apikotlin.service.ClienteService
import org.springframework.stereotype.Controller

@Controller
class ClienteServiceImpl(val repository : ClienteRepository) : ClienteService{
	
	override fun listaCliente() = repository.findAll()
	
	override fun saveCliente (cliente:Cliente) = repository.save(cliente)

	override fun exibiCliente (idcliente:Long) =  repository.findByIdcliente(idcliente)
	
	override fun deletaCliente (idcliente:Long) = repository.deleteById(idcliente)
	
	override fun updateCliente (idcliente: Long, cliente : Cliente) = repository.save(cliente)
	
	override fun listaClienteAtivo() = repository.findAllAtivo()
}