from py4j.java_gateway import JavaGateway,GatewayParameters
# import stack
gateway=JavaGateway()
s=gateway.entry_point
s.setString("Sahil")
y=s.getString()
y=y+" Goyal"
print(y)


s.add(12)
s.add(15)
s.add(42)
s.add(66)

z=s.getList()           

s.SetElement(1,444)      #SEt the element at index 1 to 444

print(len(z))        #Tells the length of java list 

print(z[1])          #Gives element at index 1

for i in range(len(z)-1):   #Show all elements of java list
    print(z[i])



