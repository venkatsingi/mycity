## Login and Registration 
### Set up Email

You need to configure the email by providing your own username and password in application.properties
You also need to use your own host, you can use Amazon or Google for example.

### AuthenticationSuccessHandler configuration for Custom Login Page article
If you want to activate the configuration for the article 

### Feature toggle for Geo IP Lib
The geolocation checks do not work for the IP addresses 127.0.0.1 and 0.0.0.0, 
which can be a problem when running the application locally or in a test environment.
To enable/disable the check on the geolocation, set the property `geo.ip.lib.enabled` to true/false; this is false by default.
