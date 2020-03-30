# Links
https://github.com/in28minutes/in28minutes-initiatives/tree/master/The-in28Minutes-TroubleshootingGuide-And-FAQ#error---im-having-a-problem-running-jsps-with-spring-boot-in-intellij-what-should-i-do

#### Rest
Resource - has a uri
```
/users/rahul/todos
/users/rahul/todo/1
/users/rahul
```

Resource can have different representations:
xml, json, html

Users -> Posts (One to many)
```
Retrieve all users     - GET /users
Retrieve specific user - GET /users/{id}
Create a user          - POST /users
Delete a user          - DELETE /users/{id}

Retrieve all posts of user - GET /users/{id}/posts
Create a post for a user   - POST /users/{id}/posts
Retrieve details of post   - GET /users/{id}/posts/{postid} 
```