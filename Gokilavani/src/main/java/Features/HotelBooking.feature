Feature: Google page test
Scenario: Google search text
Given User Login
| |admin|
|admin| | |
|admin|admin|
When User entered valid credentials
|Ben|
|Thomas|
|aa|abc123@gmail.com |
|9876|1234567890|9783124789|
|Wagamon street, Chennai - 6000097 |
|Chennai|
|Tamilnadu|
|6|
|Ben Thomas |
|1234567812345678|
|123|
|12|
|2030|
Then Success

