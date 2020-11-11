# OSS-Project-Group-1

 Read <a href="https://github.com/Trossetti/OSS-Project-Group-1/blob/main/Current_Progress.md">Current_Progress.md</a> for current updates. <p>
 Neo Gentrics </p>

# Startup
Three options: 
- Login 
- Account Creation 
- Exit

# Login
- Ask user for credentials, send encrypted traffic to LDAP server to authenticate.
- Once logged in, user should be able to view, upload, or delete items they have permission to view and modify.
- All requests from the client user to the server should be encrypted.

# Account Creation
- Ask user for a username, check against current list of users in LDAP server's database. If a user already exists, ask for another username.
- Ask user for a password, password should be restricted to something hard to crack.
- If both are sufficient, create user on the server and return user to the main script so they may choose to login, create another user, etc.

# Exit
- Nothing, the program should just end.
