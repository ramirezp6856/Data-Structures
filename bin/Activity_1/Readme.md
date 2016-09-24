# Activity #1

## You must pair up with another person (your group-mate) to complete this activity. 

## You are to create a well-designed, efficient, object-oriented solution to maintain information for a company that sells Human Resources software systems. The Sales Company can have as many as 100 employees. Each employee can sell as many as 1000 software systems to different companies.

### There are three Software programs that can be sold: 
    * Oracle, meant for large companies at a cost of $35,000 
    * Datatel, meant for medium companies at a cost of $25,000 
    * Migrant, meant for small companies, at a cost of $10,000

### The resulting application will maintain records on salespeople within the company. At a minimum, your solution will have three classes: 
    * Software System 
        > includes variables for: 
            - name of the customer: Company purchasing system 
            - Software Vender (Oracle, Datatel, Migrant) – use either an Enumerated type or an array of String Constants 
            - Cost (stored as an array of Constants) 

        > Appropriate methods, including: 
            - accessors/validating mutators (get/set) 
            - toString()
    * SalesPerson
        > includes variables for:
            - name
            - salary
            - list(array) of software systems sold
        > Appropriate methods, including:
            - accessors/validating mutators (get/set)
            - total amount sold (sum of the cost of all sold systems
            - toString() 
    * SalesCompany (Implementation of SalesPerson)
        > Input a list of sales people and what systems they have sold from a text file (you can create a dummy file for this purpose).
        > Determine which sales person sold the most (highest total cost) 
        > Write the information about all software systems in a text file, including type, cost, and description.

##### Note: Software System is already provided to you. So you need to submit two classes "SalesPerson" and "SalesCompany".
