##Spring Boot 2 REST API Controller
In Spring, a controller class, which is capable of serving REST API requests, is called rest controller. It should be annotated with @RestController annotation.
The resource uris are specified in @RequestMapping annotations. It can be applied at class level and method level both. Complete URI for an API is resolved after adding class level path and method level path.
We should always write produces and consumes attributes to specify the mediatype attributes for the API. Never reply on assumptions.
In given controller, we have two API methods. Feel free to add more methods as needed.

HTTP GET /employees – Returns list of the employees.
HTTP POST /employees – Add an employee in the employees collection.

    