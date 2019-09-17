package com.empresa.apikotlin.test

import com.empresa.apikotlin.resource.ClienteResource
import com.empresa.apikotlin.serviceImpl.ClienteServiceImpl
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner
import org.springframework.boot.test.context.SpringBootTest

@RunWith(MockitoJUnitRunner::class)
@SpringBootTest
class ApiTestListaCliente (val clienteServiceImpl : ClienteServiceImpl, val clienteResource : ClienteResource){

	


}