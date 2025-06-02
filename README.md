URI uri = ServletUriComponentsBuilder
             .fromCurrentRequest()         // pega o endereço atual
             .path("/{id}")                // adiciona espaço para o ID
             .buildAndExpand(bookDTO.getId()) // coloca o ID real
             .toUri();                     // vira um link completo!
