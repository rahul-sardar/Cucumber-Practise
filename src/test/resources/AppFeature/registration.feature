Feature: User Registration

Scenario: Register a User with different data
Given User is on Registration Page
When User Enter Following User Details
     | Rahul | Sardar | rahulsardar@gmail.com | 9999 | Mumbai |
     | Ravi | Sharma | ravisharma@gmail.com | 11111 | Pune |
     | Bawli | Kapoor | bawliKapoor@gmail.com | 7777 | Nagpada |
Then User Registration Should Be Successful     

Scenario: Register a User with different data with columns
Given User is on Registration Page
When User Enter Following User Details with columns
     | fisrtname | Lastname | email | PhoneNumber | City |
     | Rahul | Sardar | rahulsardar@gmail.com | 9999 | Mumbai |
     | Ravi | Sharma | ravisharma@gmail.com | 11111 | Pune |
     | Bawli | Kapoor | bawliKapoor@gmail.com | 7777 | Nagpada |
Then User Registration Should Be Successful     