package com.empresa.apikotlin

import com.empresa.apikotlin.model.Cliente
import com.empresa.apikotlin.resource.ClienteResource
import com.empresa.apikotlin.serviceImpl.ClienteServiceImpl
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner
import org.springframework.boot.test.context.SpringBootTest

//@RunWith(SpringRunner::class)
@RunWith(MockitoJUnitRunner::class)
@SpringBootTest
class ApiKotlinApplicationTests(val clienteServiceImpl : ClienteServiceImpl, clienteResource : ClienteResource) {
	
	@Before
	fun mockCliente(){
		val cliente = Cliente(20,"Antonio Participio Silva", true)
	}
	
	@Test
	fun retornaListaCliente(){
		Mockito.verify(clienteServiceImpl.listaCliente())
	}
	
	@Test
	fun retornaListaClienteAtivo(){
		Mockito.verify(clienteServiceImpl.listaClienteAtivo())
	}
	

}
