# SCM2.0
smart contact management(SCM2.0) to lern various thing in this project

feature of SCM2.0
1. user signup with an email and password.
2. verify account using email verification link or  otp.
3. signup with google, github using OAuth2 etc
4. Add the contact with picture
5. contact picture is uploaded to cloud [AWS, cloudinary]
6. The user can view all contact
7. can view the contact detail
8. compose and send the email directly from scm
9. email contains text and an attachment
10. update contact
11. delete contact
12. search contact
13. pagination contact
14. export the contact data to Excel
15. Mark favorite contact on to separate list
16. see and edit own details(profile details)
17. dark and light theme
18. provide feedback

technology used
1. latest version spring boot.
2. Spring MVC.
3. Spring data JPA
4. OAuth for social login-google and github
5. thymleaf template engine
6. validation(validate the form)
7. spring security -for secure route
8. postgres database
9. java email service -for sending and receiving email
10. AWS/Cloudinary SDK -for file store
11. javascript
12. tailwindcss
13. flowbite components -for readymade components
14. pdf/excel tools for generating reports

required dependencies
1. web
2. Lombok
3. devtool
4. thymleaf
5. data jpa
6. PostgreSQL driver
7. validation
8. security
9. oauth2-client
10. model mapper
11. stater mail


configure tailwindcss in project
11npm init -y
2.npm install -D tailwindcss
   in package.json add  "type": "module",
3.npx tailwindcss init
   in tailwindcss.config file add   content: ["./src/**/*.{html,js}"]
   create file this location index.css /* ./src/main/resource/static/css  */
   @tailwind base;
   @tailwind components;
   @tailwind utilities;

  **if you want use tailwind run command 
    npx tailwindcss -i src/main/resources/static/css/input.css -o 
    src/main/resources/static/css/output.css --watch

    add css script to home.html file in head session    
        <link rel="stylesheet" th:href="@{'/css/output.css'}" />
        
 ** if you want use flowbite and use their component then
  in head tag 
  <link 
 ``` ruby href="https://cdnjs.cloudflare.com/ajax/libs/flowbite/2.3.0/flowbite.min.css" rel="stylesheet" />
```
  before body tag
  <script src="https://cdnjs.cloudflare.com/ajax/libs/flowbite/2.3.0/flowbite.min.js"></script>



    



