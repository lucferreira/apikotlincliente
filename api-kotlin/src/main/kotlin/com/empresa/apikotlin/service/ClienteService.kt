package com.empresa.apikotlin.service

import com.empresa.apikotlin.model.Cliente
import org.springframework.stereotype.Service

@Service
interface ClienteService {
	
	fun listaCliente (): MutableIterable<Cliente>
	
	fun saveCliente (cliente : Cliente): Cliente
	
	fun exibiCliente (idcliente : Long): Cliente
	
	fun deletaCliente (idcliente : Long)
	
	fun updateCliente (idcliente: Long, cliente : Cliente): Cliente
	
	fun listaClienteAtivo (): MutableIterable<Cliente>
	
}