# spring-rest-service-cors-demo

Enabling Cross Origin Requests for a RESTful Web Service

To test the CORS behaviour, you need to start the client from another server or port. Doing so not only avoids a collision between the two applications but also ensures that the client code is served from a different origin than the service. To start the app running on localhost at port 9000 (as well as the one that is already running on port 8080), run the following Maven command:

To start the client running on localhost at port 8080, run the following Maven command:
mvn spring-boot:run -Dserver.port=9000


Once the app starts, open http://localhost:9000 in your browser

If the service response includes the CORS headers, then the ID and content are rendered into the page. But if the CORS headers are missing (or insufficient for the client), the browser fails the request and the values are not rendered into the DOM.
