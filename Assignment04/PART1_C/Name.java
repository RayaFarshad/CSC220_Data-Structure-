public class Name
{
	private String first; // First name
	private String last;  // Last name

	public Name()
	{
	} 

	public Name(String firstName, String lastName)
	{
            this.first = firstName;
            this.last = lastName;
	}

	public void setName(String firstName, String lastName)
	{
            this.first = firstName;
            this.last = lastName;
	}

	public String getName()
	{
            return this.first+this.last;
	}

	public void setFirst(String firstName)
	{
            this.first = firstName;
	}

	public String getFirst()
	{
            return this.first;
	} 

	public void setLast(String lastName)
	{
            this.last = lastName;
	}

	public String getLast()
	{
            return this.last;
	}

	public void giveLastNameTo(Name aName)
	{
            aName.setLast(last);
	}

        @Override
	public String toString()
	{
          return first+ " "+last;
	} 
} 
