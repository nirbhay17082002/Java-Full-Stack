class User
{
	private String name,contact,email;
	private int userid;
	
	//write only
	public void setUserId(int userid)
	{
		if(userid>0)
		{
			this.userid=userid;
			System.out.println("Data is saved successfully! as userid:"+userid);
		}
		else
		{
			System.out.println("User if should be grater than 0. ");
		}
	}
	public int getUserId()
	{
		return userid;
	}
}
public class EncapsulateExample
{
	public static void main(String[] args)
	{
		User u=new User();
		//u.userid=100;//error: beacuse private data member
		u.setUserId(1001);
		int userid=u.getUserId();
		System.out.println("User Id :"+userid);
	}
}