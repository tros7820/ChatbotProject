package chatbot.model;

public class User
{
	private String userName;
	private int age;
	private String favoriteMovie;
	private Boolean isPierced;
	private Boolean isTattooed;

	public User()
	{

	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String user)
	{
		this.userName = user;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getFavoriteMovie()
	{
		return favoriteMovie;
	}

	public void setFavoriteMovie(String favoriteMovie)
	{
		this.favoriteMovie = favoriteMovie;
	}

	public Boolean getIsPierced()
	{
		return isPierced;
	}

	public void setIsPierced(Boolean isPierced)
	{
		this.isPierced = isPierced;
	}

	public Boolean getIsTattooed()
	{
		return isTattooed;
	}

	public void setIsTattooed(Boolean isTattooed)
	{
		this.isTattooed = isTattooed;
	}

}
