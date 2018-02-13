class Login extends Password
{
  public Login()
  {
    super();
  }
  
  //overridden generatePass() method from superclass Password
  //in order to generate valid characters for password, use ints and RNG for ASCII values
  //97-122 (http://www.asciitable.com/), this generates a char[] of lowercase characters
  //that you can guess essentially by playing hangman
  public char[] generatePass()
  {
    return null;
  } 

  public boolean guess()
  {
    return false;
    
  }//overridden from Superclass Password, prompts user to guess
  //password til they get it (returns true if they do, false if they exit)
}
