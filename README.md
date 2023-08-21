# JDBC Implementation

## There are three main operations:
1. Select all employee records with details by joining tables
2. Add a custom employee
3. Delete employee (only with address = 'Dhanmondi')

### A  remote 'development' branch was created right after creating this repo. After cloning this repository in my local machine, three local branches were created (for three different features) which were then merged with the remote 'development' branch. Finally, the remote 'development' branch was merged with the main branch.

## Step-by-step workflow with screenshots

### Step 1: Three tables with some manually inputted default data in it

`employee` table

![img.png](img.png)

`department` table

![img_2.png](img_2.png)

`employee_role` table

![img_3.png](img_3.png)


### Step 2: Run the code, execute all three features. Print output (employee records) after execution of each feature

![img_4.png](img_4.png)


### Step 3: Changes are reflected onto the `employee` table. We can see the employee records with address 'Dhanmondi' are deleted

![img_5.png](img_5.png)
