# Spring excersises

### Useful git commands 

### MVC pattern
- Model
- View
- Controller

### Stack architecture based and MVC pattern
- Controller 
- Model (data + operations on data) = Service + Repository

- Controller -> Get the request from user and return the view
- Service -> Business logic ( what application should do)
- Repository -> Access to DB

### View - it's a view which user is able to play with
- html pages
- json payload

### Model data
- dto(Data Transfer Object)
- Entity

### REST Architecture/Restful API
- exposing data through html protocol
- -every resource have url
- -standard methods to play with those resources
- CRUD methods, Create/Read/Update/Delete
- Car as an example - our propositions
 - get all cars (url + Http verb): GET /all-cars
 - get one particular car (url + Http verb): POST /VIN; POST /bmw
 - create new car (url + Http verb): POST /add-car; POST /add-new-car
 - delete car (url + Http verb): DELETE /VIN; DELETE /delete-car
 - update car (url + Http verb): PATCH /VIN-patch; PATCH/update-car
 - Car entity : good practices
   -get all cars(url + Http verb): GET /cars
 - -get one cars(url + Http verb): GET /cars/{id} e.g /cars/1024
 - -create new car(url + Http verb): POST /cars
 - -delete car(url + Http verb): DELETE /cars/{id}
 - -update car(replace) (url + Http verb): PUT /cars/{id}
 - -update car(partial) (url + Http verb): PATCH /cars/{id}