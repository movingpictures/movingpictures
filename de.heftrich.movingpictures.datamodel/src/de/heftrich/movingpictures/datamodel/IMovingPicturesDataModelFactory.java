/**
 * 
 */
package de.heftrich.movingpictures.datamodel;


/**
 * @author torsten
 *
 */
public interface IMovingPicturesDataModelFactory
{

	public IMovingPicturesDataModel connect(String user, String password);
}