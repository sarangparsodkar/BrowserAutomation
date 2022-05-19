Project to Automate Browser Actions in Java through RESTful Service calls

A simple stateless web service that allows one to interact with two web-browsers. 

Browsers: Google Chrome and Mozilla Firefox. 

The service should support the following endpoints: /start, /stop, /geturl, /cleanup

Example usage of endpoints:

<http://<server>/start?browser=<browser>&url=<url>> should start the desired browser and open the URLt in the same browser instance.

<http://<server>/geturl?browser=<browser>> should get the current active tab URL for the given browser.

<http://<server>/stop?browser=<browser>> should stop the given browser if it is running.

<http://<server>/cleanup?browser=<browser>> should clean up the browsing session for the given browser if it has been stopped.
