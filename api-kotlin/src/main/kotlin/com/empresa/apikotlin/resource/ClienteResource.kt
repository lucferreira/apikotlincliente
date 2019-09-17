package com.empresa.apikotlin.resource

import com.empresa.apikotlin.model.Cliente
import com.empresa.apikotlin.serviceImpl.ClienteServiceImpl
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.hibernate.annotations.UpdateTimestamp
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.beans.BeanUtils
import com.fasterxml.jackson.databind.util.BeanUtil

@RestController
class ClienteResource (val clienteServiceImpl:ClienteServiceImpl) {
	
	@GetMapping("/clientes")
	fun listaTodosClientes() = clienteServiceImpl.listaCliente()
	
	@GetMapping("/clientesativos")
	fun listaTodosClientesAtivos() = clienteServiceImpl.listaClienteAtivo()
	
	@GetMapping("/cliente/{idcliente}")
	fun exibirCliente(@PathVariable idcliente:Long) = clienteServiceImpl.exibiCliente(idcliente)
	
	@PostMapping("/cliente")
	fun saveClientes(@RequestBody cliente:Cliente) = clienteServiceImpl.saveCliente(cliente)
	
	@DeleteMapping("/clientes/{idcliente}")
	fun deletaCliente(@PathVariable idcliente:Long) = clienteServiceImpl.deletaCliente(idcliente)

//	@PutMapping("/clientesup/{idcliente}")
//	fun atualizaCliente(@PathVariable idcliente:Long, @RequestBody cliente:Cliente){
//		val clienteU = clienteServiceImpl.exibiCliente(idcliente)
//		BeanUtils.copyProperties(clienteU,cliente)
//		clienteServiceImpl.saveCliente(cliente)
//	}
	
	
	
	
}