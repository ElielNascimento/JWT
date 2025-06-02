<p> URI uri = ServletUriComponentsBuilder </p>
   <P>.path("/{id}")   // adiciona espaço para o ID </P>   
   <P>.buildAndExpand(bookDTO.getId()) // coloca o ID real</P>
   <p>.toUri(); // vira um link completo! </p>
             
            
