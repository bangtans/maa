package de.mlo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import de.mlo.model.Req;

// TODO: Auto-generated Javadoc
/**
 * The Interface ReqRepository.
 */
public interface ReqRepository extends JpaRepository<Req, Integer> {
	
	/**
	 * Find by name.
	 *
	 * @param name the name
	 * @return the req
	 */
	Req findByName(String name);
	
	List<Req> findAllByStudentId (int id);


}
