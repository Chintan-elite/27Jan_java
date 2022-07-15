package execption;

import java.io.FileNotFoundException;
import java.io.IOException;

class Sample
{
	public void display() throws IOException
	{
		
	}
}

public class ExceptionwithOverride extends Sample
{
	@Override
	public void display() throws FileNotFoundException
	{
		
	}
}
