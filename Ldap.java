package connectLDAP;
import java.util.Hashtable;

import javax.naming.*;
import javax.naming.ldap.*;
import javax.naming.directory.*;

public class Ldap
{
    public static void main(String[]args)
    {
        Hashtable<String, String> environment = new Hashtable<String, String>();

        environment.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        environment.put(Context.PROVIDER_URL, "ldap://<hostname>:389");
        environment.put(Context.SECURITY_AUTHENTICATION, "simple");
        environment.put(Context.SECURITY_PRINCIPAL, "<Login DN>");
        environment.put(Context.SECURITY_CREDENTIALS, "<password>");

        try 
        {
            DirContext context = new InitialDirContext(environment);
            System.out.println("Connected..");
            System.out.println(context.getEnvironment());
            context.close();
        } 
        catch (AuthenticationNotSupportedException exception) 
        {
            System.out.println("The authentication is not supported by the server");
        }

        catch (AuthenticationException exception)
        {
            System.out.println("Incorrect password or username");
        }

        catch (NamingException exception)
        {
            System.out.println("Error when trying to create the context");
        }
    }
}


/* Sample info format

	# LDAP parameters
	ldap.host = ldap://ldap.mydomain.com:389
	ldap.factories.initctx = com.sun.jndi.ldap.LdapCtxFactory
	ldap.factories.control = com.sun.jndi.ldap.ControlFactory
	ldap.searchbase = dc=mydomain,dc=us
	ldap.user = MYDOMAIN.COM\\ldap-user
	ldap.userBase= MYDOMAIN.COM\\
	ldap.password = ******
*/