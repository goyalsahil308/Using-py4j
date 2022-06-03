# Using-py4j
## Libraries Used
#### 1. py4j:    Py4J enables Python programs running in a Python interpreter to dynamically access Java objects in a Java Virtual Machine
_________________________________________________________________________________________________________

## User defined Functions:
### In Java
#### getString :  Used to get private String "str"
#### setString :  Used to set string "str"
#### getList   :  It will return the list
#### add       :  It will add number to list 
#### sort      :  Sort the list
#### SetElement: Set element "x" and "i" index
________________________________________________________________________________________________________

## Target: To run java methods in python program. 
_________________________________________________________________________________________________________
## Working of code
#### StackEntrypoint.java
Before working on this program make sure to install py4j.You can install this by pip command using 

      pip install py4j
  
  After py4j is installed ,java .jar file is located here share/py4j/py4j0.x.jar .Copy it into project.It is recommended to use virtual enviroment.
  First ,we import py4j.gatewayserver .It will be used to make connection .
  Then we make a class name Stackentrypoint in which we define all functions mentioned above i.e getString,setstring,add etc
  A new arraylist of integer type is declared and private string "str" is declared
  at the end of public class ,main method is declared .
  An object of class StackEntryPoint named "app"  is created  using:
  
      StackEntryPoint app =new StackEntryPoint();
 Gateway server is started and object "app" is passed through it.
 
    GatewayServer gatewayserver =new GatewayServer(app)
    
  Start the server by using :
  
      gatewayserver.start()
      
 Before running thr program check if program is not running or it will show error.We can close the server by using:
 
    gatewayserver.shutdown()
    
  By default it wil run server on 25333 port .We can change the port by using :
  
    GatewayServer gatewayserver =new GatewayServer(app,25335)
    
  Now port being uded is 24335 .if you are changing the port also remember to change the port from python program.
  
 #### Test.py
 
First of all, import gateway server using: 

    from py4j.java_gateway import JavaGateway,GatewayParameters

Declare gateway:

    gateway=JavaGateway()
    
If you have changed the port use:

    gateway = JavaGateway(gateway_parameters=GatewayParameters(port=25335))
    
Now put object of java in variable:

      s=gateway.entry_point
   
Now put value of java variable str from python.We will call java method using:

    s.setString("Sahil")
Get string by using method getString :

      y=s.getString()
      print(y)   

Output:  Sahil

Access the java method add and add to list any numbers:

    s.add(12)
    s.add(15)
    s.add(42)
    s.add(66)  
    s.setElement(1,444)
 Put list in variable "z"
 
      z=s.getList()
 We can perform real python functions on java list 
 
      print(z[1])
      print(len(z))  
      for i in range(len(z)):   
         print(z[i])
         
Output:  444
         4
         12
         4444
         42
         66
 
