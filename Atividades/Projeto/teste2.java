criarButton.setOnAction(event -> criarElemento(pageName));
        listarButton.setOnAction(event -> listarElementos(pageName));
        atualizarButton.setOnAction(event -> atualizarElemento(pageName));
        excluirButton.setOnAction(event -> excluirElemento(pageName));

        private void criarElemento(String pageName) {
        if (pageName.equals("Cliente")) {

            Cliente novoCliente = new Cliente(nome, email, telefone, medidas);

            clientes.add(novoCliente);

            processarCliente(novoCliente);
        }
    }

    private void listarElementos(String pageName) {
        if (pageName.equals("Cliente")) {
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        } else if (pageName.equals("Tecido")) {
            for (Tecido tecido : tecidos) {
                System.out.println(tecido);
            }
        }
    }

    private void atualizarElemento(String pageName) {
        if (pageName.equals("Cliente")) {

            cliente.setNome(novoNome);
            cliente.setEmail(novoEmail);
            cliente.setTelefone(novoTelefone);
            cliente.setMedidas(novasMedidas);

            processarClienteAtualizado(cliente);
        }
    }

    private void excluirElemento(String pageName) {
        if (pageName.equals("Cliente")) {

            clientes.remove(cliente);

            processarExclusaoCliente(cliente);
        }
    }
