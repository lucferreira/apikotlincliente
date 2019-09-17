package com.empresa.apikotlin.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.SequenceGenerator
import javax.persistence.Table

@Entity
@Table(name = "clientes")
data class Cliente (
		@Id
		@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="public.clientes_idcliente_seq")
		@SequenceGenerator(name="public.clientes_idcliente_seq", sequenceName="public.clientes_idcliente_seq", allocationSize=1)
		val idcliente: Long,
		val nome: String,
		val ativo: Boolean
)

{
	constructor ():this(0, "",false)
}