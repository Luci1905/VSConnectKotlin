package com.senai.vsconnect_kotlin.models

import java.util.UUID

class Servico (
    val idSevico: UUID,
    val titulo: String,
    val descricao: String,
    val proposta: String
)