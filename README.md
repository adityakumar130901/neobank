To get the project started you need to do these steps

1) Clone the code or download the code. 
### git clone https://github.com/adityakumar130901/neobank.git

2) Now you have code base. Now you need to build it. Build command: 
### mvn clean install

3) Now run the java application by
### mvn exec:java -Dexec.mainClass=com.neobank.OrderManagement.OrderManagementApplication 

### Sample Request
curl --location --request POST 'http://localhost:8080/check' \
--header 'Accept: application/json' \
--header 'Content-Type: application/json' \
--data-raw '[
 "001",
 "001",
 "001",
 "001",
 "001",
 "001"
]'

### Sample Respone
{"price":400}
