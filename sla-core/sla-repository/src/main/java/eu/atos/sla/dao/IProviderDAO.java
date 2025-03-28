package eu.atos.sla.dao;

import java.util.List;

import eu.atos.sla.datamodel.IProvider;
import eu.atos.sla.datamodel.bean.Provider;

/**
 * DAO interface to access to the Provider information
 * 
 * @author Pedro Rey - Atos
 * 
 */
public interface IProviderDAO {

	/**
	 * Returns the Provider from the database by its Id
	 * 
	 * @param id
	 *            of the Provider
	 * @return the corresponding Provider from the database
	 */
	public Provider getById(Long id);

	/**
	 * Returns the Provider from the database by its UUID
	 * 
	 * @param id
	 *            of the Provider
	 * @return the corresponding Provider from the database
	 */
	public IProvider getByUUID(String uuid);

	/**
	 * Returns the Provider from the database by its name
	 * 
	 * @param id
	 *            of the Provider
	 * @return the corresponding Provider from the database
	 */
	public IProvider getByName(String providerName);

	/**
	 * Returns last Provider from the database
	 * 
	 * @param id
	 *            of the Provider
	 * @return the corresponding Provider from the database
	 */
	public IProvider getLastProvider();

	/**
	 * Returns all the Provider stored in the database
	 * 
	 * @return all the Provider stored in the database
	 */
	public List<IProvider> getAll();

	/**
	 * Stores a Provider into the database
	 * 
	 * @param Provider
	 *            Provider to be saved.
	 * @return <code>true</code> if the ProviderType was saved correctly
	 * @throws Exception 
	 */
	public IProvider save(IProvider provider);

	/**
	 * Updates a Provider in the database
	 * 
	 * @param Provider
	 *            Provider to be updated
	 * @return <code>true</code> if the Provider was saved correctly
	 */
	public boolean update(IProvider provider);

	/**
	 * Deletes a Provider from the database
	 * 
	 * @param Provider
	 *            to be deleted
	 * @return <code>true</code> if the Provider was deleted correctly
	 */
	public boolean delete(IProvider provider);

	
	
}
