package br.com.fiap.listadecompras.model

class ItemModel (val name: String,
                 val onRemove: (ItemModel) -> Unit)
