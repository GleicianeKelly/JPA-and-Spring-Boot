package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {
	public static void main (String args[]) {
		
		
		Pessoa p1 = new Pessoa(1, "Gleice", "gleice@gmail.com");
		Pessoa p2 = new Pessoa(2, "Laura", "laura@gmail.com");
		Pessoa p3 = new Pessoa(3, "Fatima", "fatima@gmail.com");
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		//Abrir transa��o para iniciar
		em.getTransaction().begin();
		//add no banco
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);		
		//Fechar com commit
		em.getTransaction().commit();
		
		//Buscar no banco
		Pessoa p = em.find(Pessoa.class, 2);
		//para remover o objeto ele tem que acabar de ser inserido ou
		//ser buscado no banco primeiro.
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		System.out.println("Pronto! ");
		em.close();
		emf.close();
	}
}
