Project to Automate Browser Actions in Java through RESTful Service calls
Action - get
A simple stateless web service that allows one to interact with two web-browsers. 

Browsers: Google Chrome and Mozilla Firefox. 

The service should support the following endpoints:

Method

Endpoint

Parameter(s)

Description

GET

/start

browser, url

Starts <browser> which has the <url> open inside it

GET

/stop

browser

Kills the <browser>.

GET

/cleanup

browser

Deletes all the browsing session information such as history, cache, cookies, downloads, saved passwords, etc for <browser>

GET

/geturl

browser

Returns the current active tab's URL. Assume the <browser> has exactly one window and multiple tabs

<browser> = chrome/firefox

<url> = Any valid URL like: google.com

Example usage of endpoints:

<http://<server>/start?browser=<browser>&url=<url>> should start the desired browser and open the URLt in the same browser instance.

<http://<server>/geturl?browser=<browser>> should get the current active tab URL for the given browser.

<http://<server>/stop?browser=<browser>> should stop the given browser if it is running.

<http://<server>/cleanup?browser=<browser>> should clean up the browsing session for the given browser if it has been stopped.
