# What is filter?
* A filter is an object that is invoked at the preprocessing and postprocessing of a request.
* It is mainly used to perform filtering tasks such as conversion, logging, compression, encryption and decryption, input validation etc.
* The servlet filter is pluggable, i.e. its entry is defined in the web.xml file, if we remove the entry of filter from the web.xml file, filter will be removed automatically and 
 we don't need to change the servlet.
# Why filter is used?
* recording all incoming requests
* logs the IP addresses of the computers from which the requests originate
  conversion
* data compression
* encryption and decryption
* input validation etc.
# Advantage of Filter
 Filter is pluggable.
* One filter don't have dependency onto another resource.
* Less Maintenance
* Like servlet filter have its own API. The javax.servlet package contains the three interfaces of Filter API.
Filter
FilterChain
FilterConfig
# web.xml file
```
<filter>  
<filter-name>f1</filter-name>  
<filter-class>MyFilter</filter-class>  
</filter>  
   
<filter-mapping>  
<filter-name>f1</filter-name>  
<url-pattern>/servlet1</url-pattern>  
</filter-mapping>  
```
