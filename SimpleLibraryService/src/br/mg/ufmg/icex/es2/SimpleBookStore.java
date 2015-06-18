package br.mg.ufmg.icex.es2;

public class SimpleBookStore implements SimpleBookStoreInterface {

	private Livro[] estanteVirtual = new Livro[5];

	public SimpleBookStore() {
		estanteVirtual[0] = new Livro("Daniel","Pedras Soltas",85392);
		estanteVirtual[1] = new Livro("Gabriel","Brumas de Avalon",85393);
		estanteVirtual[2] = new Livro("Josué","Mulheres de Areia",85394);
		estanteVirtual[3] = new Livro("Marco Tulio","Engenharia de Software Avançada",85395);
		estanteVirtual[4] = new Livro("Moisés","Perguntas Frequentes",85396);
	}

	public Livro pesquisaIsbn (int isbn_) throws Exception {
		
		try {
			for (int i = 0; i < estanteVirtual.length; i++) {
				if (estanteVirtual[i].getIsbn() == isbn_) 
					return estanteVirtual[i];
			}
			
			throw new Exception("Livro não encontrado!");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		//Nunca é executado
		Livro a = new Livro();
		return a;
		
	}
	public Livro pesquisaAutor (String autor_) {
		
		try {
			for (int i = 0; i < estanteVirtual.length; i++) {
				if (estanteVirtual[i].getAutor().equals(autor_)) 
					return estanteVirtual[i];
			}
			
			throw new Exception("Livro não encontrado!");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		//Nunca é executado
		Livro a = new Livro();
		return a;
	}

}
