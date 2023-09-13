package hibernate_user.controller;


import java.util.Iterator;
import java.util.Scanner;

import org.apache.catalina.Group;
import org.apache.catalina.Role;
import org.apache.catalina.User;
import org.apache.catalina.UserDatabase;

public class MainController  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

		User user = new User() {

			public String getName() {
				// TODO Auto-generated method stub
				return null;
			}

			public void addGroup(Group arg0) {
				// TODO Auto-generated method stub
				
			}

			public void addRole(Role arg0) {
				// TODO Auto-generated method stub
				
			}

			public String getFullName() {
				// TODO Auto-generated method stub
				return null;
			}

			public Iterator<Group> getGroups() {
				// TODO Auto-generated method stub
				return null;
			}

			public String getPassword() {
				// TODO Auto-generated method stub
				return null;
			}

			public Iterator<Role> getRoles() {
				// TODO Auto-generated method stub
				return null;
			}

			public UserDatabase getUserDatabase() {
				// TODO Auto-generated method stub
				return null;
			}

			public String getUsername() {
				// TODO Auto-generated method stub
				return null;
			}

			public boolean isInGroup(Group arg0) {
				// TODO Auto-generated method stub
				return false;
			}

			public boolean isInRole(Role arg0) {
				// TODO Auto-generated method stub
				return false;
			}

			public void removeGroup(Group arg0) {
				// TODO Auto-generated method stub
				
			}

			public void removeGroups() {
				// TODO Auto-generated method stub
				
			}

			public void removeRole(Role arg0) {
				// TODO Auto-generated method stub
				
			}

			public void removeRoles() {
				// TODO Auto-generated method stub
				
			}

			public void setFullName(String arg0) {
				// TODO Auto-generated method stub
				
			}

			public void setPassword(String arg0) {
				// TODO Auto-generated method stub
				
			}

			public void setUsername(String arg0) {
				// TODO Auto-generated method stub
				
			}
			
//			public String getName() {
//				// TODO Auto-generated method stub
//				return 
//			}
//			
//			public void setUsername(String username) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			public void setPassword(String password) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			public void setFullName(String fullName) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			public void removeRoles() {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			public void removeRole(Role role) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			public void removeGroups() {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			public void removeGroup(Group group) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			public boolean isInRole(Role role) {
//				// TODO Auto-generated method stub
//				return false;
//			}
//			
//			public boolean isInGroup(Group group) {
//				// TODO Auto-generated method stub
//				return false;
//			}
//			
//			public String getUsername() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//			
//			public UserDatabase getUserDatabase() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//			
//			public Iterator<Role> getRoles() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//			
//			public String getPassword() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//			
//			public Iterator<Group> getGroups() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//			
//			public String getFullName() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//			
//			public void addRole(Role role) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			public void addGroup(Group group) {
//				// TODO Auto-generated method stub
//				
//			}
		}
	
//		
		

		UserCRUD crud = new UserCRUD();

		System.out.println("Enter the choice \n1. SignUp User \n2. LogIn User \n3. Exit");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1: {
			System.out.println("Enter the id");
			user.setId(scanner.nextInt());
			System.out.println("Enter the name");
			user.setName(scanner.next());
			System.out.println("Enter the email");
			user.setEmail(scanner.next());
			System.out.println("Enter the password");
			user.setPassword(scanner.next());
			System.out.println("Enter the phone");
			user.setPhone(scanner.nextLong());

			crud.signupUser(user);
		}
			break;
		case 2: {
			System.out.println("Enter the email");
			String email = scanner.next();
			System.out.println("Enter the password");
			String password = scanner.next();

			boolean result = crud.loginUser(email, password);
			if (result) {
				System.out.println("Logged In successful");
				crud.displayPasswords(email);
				System.out.println("Enter the choice \n1. Update Passwords \n2.Exit");
				int key = scanner.nextInt();
				switch (key) {
				case 1: {
					System.out.println("Enter the facebook");
					user.setFacebook(scanner.next());
					System.out.println("Enter the instagram");
					user.setInstagram(scanner.next());
					System.out.println("Enter the snapchat");
					user.setSnapchat(scanner.next());
					System.out.println("Enter the whatsapp");
					user.setWhatsapp(scanner.next());
					System.out.println("Enter the twitter");
					user.setTwitter(scanner.next());

					crud.updatePasswords(user,email);
				}

					break;

				default:
					break;
				}
			} else {
				System.out.println("Invalid Credentials");
			}
		}
		default:
			break;
		}
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addGroup(Group group) {
		// TODO Auto-generated method stub
		
	}

	public void addRole(Role role) {
		// TODO Auto-generated method stub
		
	}

	public String getFullName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterator<Group> getGroups() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterator<Role> getRoles() {
		// TODO Auto-generated method stub
		return null;
	}

	public UserDatabase getUserDatabase() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isInGroup(Group group) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isInRole(Role role) {
		// TODO Auto-generated method stub
		return false;
	}

	public void removeGroup(Group group) {
		// TODO Auto-generated method stub
		
	}

	public void removeGroups() {
		// TODO Auto-generated method stub
		
	}

	public void removeRole(Role role) {
		// TODO Auto-generated method stub
		
	}

	public void removeRoles() {
		// TODO Auto-generated method stub
		
	}

	public void setFullName(String fullName) {
		// TODO Auto-generated method stub
		
	}

	public void setPassword(String password) {
		// TODO Auto-generated method stub
		
	}

	public void setUsername(String username) {
		// TODO Auto-generated method stub
		
	}

}

