package de.heftrich.movingpictures.datamodel.pub;

import java.util.List;

public interface IItem
{

	public String getTitle();

	public void setTitle(String title);

	public String getSubTitle();

	public int getID();
	
	public IGenre getGenre();
	
	public String getSummary();
	
	public int getLength();
	
	public String getLengthFormatted();

	public List<ICarrier> getCarriers();

	public List<IRolePart> getRolePartsInItem();

	public IImage getMainImage();

	public List<IMedia> getMediaList();
}
